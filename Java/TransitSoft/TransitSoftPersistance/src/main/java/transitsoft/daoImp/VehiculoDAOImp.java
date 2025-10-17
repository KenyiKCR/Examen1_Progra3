/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.daoImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import transitsoft.dao.VehiculoDAO;
import transitsoft.daoImp.util.Columna;
import transitsoft.model.VehiculoDTO;

/**
 *
 * @author USUARIO
 */
public class VehiculoDAOImp extends DAOImplBase implements VehiculoDAO {

    private VehiculoDTO vehiculo;

    public VehiculoDAOImp() {
        super("vehiculo");
        vehiculo = null;
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
    public Integer insertar(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
        retornarLlavePrimaria = true;
        return super.insertar();
    }

    @Override
    public VehiculoDTO obtenerPorId(Integer vehiculoId) {
        VehiculoDTO vehiculoDTO = new VehiculoDTO();
        vehiculoDTO.setId(vehiculoId);
        this.vehiculo = vehiculoDTO;
        super.obtenerPorId();
        return this.vehiculo;
    }

    @Override
    public Integer modificar(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
        return super.modificar();
    }

    @Override
    public Integer eliminar(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
        return super.eliminar();
    }

    @Override
    public ArrayList<VehiculoDTO> listarTodos() {
        return (ArrayList<VehiculoDTO>) super.listarTodos();
    }

    @Override
    protected void incluirValorDeParametrosParaInsercion() throws SQLException {
        this.statement.setString(1, this.vehiculo.getPlaca());
        this.statement.setString(2, this.vehiculo.getMarca());
        this.statement.setString(3, this.vehiculo.getModelo());
        this.statement.setInt(4, this.vehiculo.getAnho());
    }

    @Override
    protected void incluirValorDeParametrosParaEliminacion() throws SQLException {
        this.statement.setInt(1, vehiculo.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaModificacion() throws SQLException {
        this.statement.setString(1, this.vehiculo.getPlaca());
        this.statement.setString(2, this.vehiculo.getMarca());
        this.statement.setString(3, this.vehiculo.getModelo());
        this.statement.setInt(4, this.vehiculo.getAnho());
        this.statement.setInt(5, this.vehiculo.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaObtenerPorId() throws SQLException {
        this.statement.setInt(1, vehiculo.getId());
    }

    @Override
    protected void instanciarObjetoDelResultSet() throws SQLException {
        this.vehiculo = new VehiculoDTO();
        this.vehiculo.setId(this.resultSet.getInt("id"));
        this.vehiculo.setPlaca(this.resultSet.getString("placa"));
        this.vehiculo.setMarca(this.resultSet.getString("marca"));
        this.vehiculo.setModelo(this.resultSet.getString("modelo"));
        this.vehiculo.setAnho(this.resultSet.getInt("anho"));
    }

    @Override
    protected void agregarObjetoALaLista(List lista) throws SQLException {
        this.instanciarObjetoDelResultSet();
        lista.add(this.vehiculo);
    }
    
    @Override
    protected void limpiarObjetoDelResultSet(){
        this.vehiculo = null;
    }

}
