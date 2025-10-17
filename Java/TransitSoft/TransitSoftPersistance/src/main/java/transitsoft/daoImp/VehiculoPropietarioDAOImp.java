/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.daoImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import transitsoft.dao.VehiculoPropietarioDAO;
import transitsoft.daoImp.util.Columna;
import transitsoft.model.PropietarioDTO;
import transitsoft.model.VehiculoDTO;
import transitsoft.model.VehiculoPropietarioDTO;

/**
 *
 * @author USUARIO
 */
public class VehiculoPropietarioDAOImp extends DAOImplBase implements VehiculoPropietarioDAO {

    private VehiculoPropietarioDTO vehiculoPropietario;

    public VehiculoPropietarioDAOImp() {
        super("vehiculo_propietario");
        vehiculoPropietario = null;
    }

    @Override
    protected void configurarListaDeColumnas() {
        listaColumnas.add(new Columna("id", true, true));
        listaColumnas.add(new Columna("placa", false, false));
        listaColumnas.add(new Columna("marca", false, false));
        listaColumnas.add(new Columna("modelo", false, false));
        listaColumnas.add(new Columna("anho", false, false));
    }

    @Override
    public Integer insertar(VehiculoPropietarioDTO vehiculoPropietario) {
        this.vehiculoPropietario = vehiculoPropietario;
        retornarLlavePrimaria = true;
        return super.insertar();
    }

    @Override
    public VehiculoPropietarioDTO obtenerPorId(Integer vehiculoId) {
        VehiculoPropietarioDTO vehiculoPropietarioDTO = new VehiculoPropietarioDTO();
        vehiculoPropietario.setId(vehiculoId);
        this.vehiculoPropietario = vehiculoPropietarioDTO;
        super.obtenerPorId();
        return this.vehiculoPropietario;
    }

    @Override
    public Integer modificar(VehiculoPropietarioDTO vehiculoPropietario) {
        this.vehiculoPropietario = vehiculoPropietario;
        return super.modificar();
    }

    @Override
    public Integer eliminar(VehiculoPropietarioDTO vehiculoPropietario) {
        this.vehiculoPropietario = vehiculoPropietario;
        return super.eliminar();
    }

    @Override
    public ArrayList<VehiculoPropietarioDTO> listarTodos() {
        return (ArrayList<VehiculoPropietarioDTO>) super.listarTodos();
    }

    @Override
    protected void incluirValorDeParametrosParaInsercion() throws SQLException {
        this.statement.setInt(1, this.vehiculoPropietario.getVehiculo().getId());
        this.statement.setInt(2, this.vehiculoPropietario.getPropietario().getId());

    }

    @Override
    protected void incluirValorDeParametrosParaEliminacion() throws SQLException {
        this.statement.setInt(1, vehiculoPropietario.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaModificacion() throws SQLException {
        this.statement.setInt(1, this.vehiculoPropietario.getVehiculo().getId());
        this.statement.setInt(2, this.vehiculoPropietario.getPropietario().getId());
        this.statement.setInt(3, this.vehiculoPropietario.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaObtenerPorId() throws SQLException {
        this.statement.setInt(1, vehiculoPropietario.getId());
    }

    @Override
    protected void instanciarObjetoDelResultSet() throws SQLException {
        this.vehiculoPropietario = new VehiculoPropietarioDTO();

        this.vehiculoPropietario.setId(this.resultSet.getInt("id"));

        VehiculoDTO vehiculo = new VehiculoDTO();
        vehiculo.setId(this.resultSet.getInt("id_vehicu  lo"));
        vehiculo.setPlaca(this.resultSet.getString("placa"));
        vehiculo.setMarca(this.resultSet.getString("marca"));
        vehiculo.setModelo(this.resultSet.getString("modelo"));
        vehiculo.setAnho(this.resultSet.getInt("anho"));
        this.vehiculoPropietario.setVehiculo(vehiculo);

        PropietarioDTO propietario = new PropietarioDTO();

        propietario.setId(this.resultSet.getInt("id_propietario"));
        propietario.setDni(this.resultSet.getString("dni"));
        propietario.setNombres(this.resultSet.getString("nombres"));
        propietario.setApellidos(this.resultSet.getString("apellidos"));
        propietario.setDireccion(this.resultSet.getString("direccion"));

        this.vehiculoPropietario.setPropietario(propietario);

    }

    @Override
    protected void agregarObjetoALaLista(List lista) throws SQLException {
        this.instanciarObjetoDelResultSet();
        lista.add(this.vehiculoPropietario);
    }

    @Override
    protected void limpiarObjetoDelResultSet() {
        this.vehiculoPropietario = null;
    }

}
