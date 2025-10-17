/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.daoImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import transitsoft.dao.PropietarioDAO;
import transitsoft.daoImp.util.Columna;
import transitsoft.model.PropietarioDTO;

/**
 *
 * @author USUARIO
 */
public class PropietarioDAOImp extends DAOImplBase implements PropietarioDAO {

    private PropietarioDTO propietario;

    public PropietarioDAOImp() {
        super("propietario");
        propietario = null;
    }

    @Override
    protected void configurarListaDeColumnas() {
        listaColumnas.add(new Columna("id", true, true));
        listaColumnas.add(new Columna("dni", false, false));
        listaColumnas.add(new Columna("nombres", false, false));
        listaColumnas.add(new Columna("apellidos", false, false));
        listaColumnas.add(new Columna("direccion", false, false));
    }

    @Override
    public Integer insertar(PropietarioDTO propietario) {
        this.propietario = propietario;
        retornarLlavePrimaria = true;
        return super.insertar();
    }

    @Override
    public PropietarioDTO obtenerPorId(Integer propietarioId) {
        PropietarioDTO propietarioDTO = new PropietarioDTO();
        propietarioDTO.setId(propietarioId);
        this.propietario = propietarioDTO;
        super.obtenerPorId();
        return this.propietario;
    }

    @Override
    public Integer modificar(PropietarioDTO propietario) {
        this.propietario = propietario;
        return super.modificar();
    }

    @Override
    public Integer eliminar(PropietarioDTO propietario) {
        this.propietario = propietario;
        return super.eliminar();
    }

    @Override
    public ArrayList<PropietarioDTO> listarTodos() {
        return (ArrayList<PropietarioDTO>) super.listarTodos();
    }

    @Override
    protected void incluirValorDeParametrosParaInsercion() throws SQLException {
        this.statement.setString(1, this.propietario.getDni());
        this.statement.setString(2, this.propietario.getNombres());
        this.statement.setString(3, this.propietario.getApellidos());
        this.statement.setString(4, this.propietario.getDireccion());
    }

    @Override
    protected void incluirValorDeParametrosParaEliminacion() throws SQLException {
        this.statement.setInt(1, propietario.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaModificacion() throws SQLException {
        this.statement.setString(1, this.propietario.getDni());
        this.statement.setString(2, this.propietario.getNombres());
        this.statement.setString(3, this.propietario.getApellidos());
        this.statement.setString(4, this.propietario.getDireccion());
        this.statement.setInt(5, this.propietario.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaObtenerPorId() throws SQLException {
        this.statement.setInt(1, propietario.getId());
    }

    @Override
    protected void instanciarObjetoDelResultSet() throws SQLException {
        this.propietario = new PropietarioDTO();
        this.propietario.setId(this.resultSet.getInt("id"));
        this.propietario.setDni(this.resultSet.getString("dni"));
        this.propietario.setNombres(this.resultSet.getString("nombres"));
        this.propietario.setApellidos(this.resultSet.getString("apellidos"));
        this.propietario.setDireccion(this.resultSet.getString("direccion"));
    }

    @Override
    protected void agregarObjetoALaLista(List lista) throws SQLException {
        this.instanciarObjetoDelResultSet();
        lista.add(this.propietario);
    }

    @Override
    protected void limpiarObjetoDelResultSet() {
        this.propietario = null;
    }

}
