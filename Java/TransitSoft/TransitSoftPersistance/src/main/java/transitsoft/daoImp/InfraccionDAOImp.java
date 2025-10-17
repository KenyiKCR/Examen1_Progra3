/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.daoImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import transitsoft.dao.InfraccionDAO;
import transitsoft.daoImp.util.Columna;
import transitsoft.model.CapturaDTO;
import transitsoft.model.InfraccionDTO;
import transitsoft.model.VehiculoDTO;

/**
 *
 * @author USUARIO
 */
public class InfraccionDAOImp extends DAOImplBase implements InfraccionDAO {

    private InfraccionDTO infraccion;
    //  private CapturaDTO captura;

    public InfraccionDAOImp() {
        super("infraccion");
        infraccion = null;
    }

    @Override
    protected void configurarListaDeColumnas() {
        listaColumnas.add(new Columna("id", true, true));
        listaColumnas.add(new Columna("placa", false, false));
        listaColumnas.add(new Columna("velocidad", false, false));
        listaColumnas.add(new Columna("limite", false, false));
        listaColumnas.add(new Columna("exceso", false, false));
        listaColumnas.add(new Columna("vehiculo_marca", false, false));
        listaColumnas.add(new Columna("vehiculo_modelo", false, false));
        listaColumnas.add(new Columna("vehiculo_anho", false, false));
        listaColumnas.add(new Columna("propietario_dni", false, false));
        listaColumnas.add(new Columna("propietario_nombres", false, false));
        listaColumnas.add(new Columna("propietario_apellidos", false, false));
        listaColumnas.add(new Columna("propietario_direccion", false, false));
        listaColumnas.add(new Columna("id_camara", false, false));
        listaColumnas.add(new Columna("camara_modelo", false, false));
        listaColumnas.add(new Columna("camara_codigo_serie", false, false));
        listaColumnas.add(new Columna("camara_latitud", false, false));
        listaColumnas.add(new Columna("camara_longitud", false, false));
        listaColumnas.add(new Columna("monto", false, false));
        listaColumnas.add(new Columna("fecha_captura", false, false));
        listaColumnas.add(new Columna("fecha_registro", false, false));
    }

    @Override
    public Integer insertar(InfraccionDTO infraccion) {
        this.infraccion = infraccion;
        retornarLlavePrimaria = true;
        return super.insertar();
    }

    @Override
    public InfraccionDTO obtenerPorId(Integer infraccionId) {
        InfraccionDTO infraccionDTO = new InfraccionDTO();
        infraccionDTO.setId(infraccionId);
        this.infraccion = infraccionDTO;
        super.obtenerPorId();
        return this.infraccion;
    }

    @Override
    public Integer modificar(InfraccionDTO infraccion) {
        this.infraccion = infraccion;
        return super.modificar();
    }

    @Override
    public Integer eliminar(InfraccionDTO infraccion) {
        this.infraccion = infraccion;
        return super.eliminar();
    }

    @Override
    public ArrayList<InfraccionDTO> listarTodos() {
        return (ArrayList<InfraccionDTO>) super.listarTodos();
    }

    @Override
    protected void incluirValorDeParametrosParaInsercion() throws SQLException {
        this.statement.setString(1, this.infraccion.getPlaca());
        this.statement.setDouble(2, this.infraccion.getVelocidad());
        this.statement.setDouble(3, this.infraccion.getLimite());
        this.statement.setDouble(4, this.infraccion.getExceso());
        this.statement.setString(5, this.infraccion.getVehiculoMarca());
        this.statement.setString(6, this.infraccion.getVehiculoModelo());
        this.statement.setInt(7, this.infraccion.getVehiculoAnho());
        this.statement.setString(8, this.infraccion.getPropietarioDni());
        this.statement.setString(9, this.infraccion.getPropietarioNombres());
        this.statement.setString(10, this.infraccion.getPropietarioApellidos());
        this.statement.setString(11, this.infraccion.getPropietarioDireccion());
        this.statement.setInt(12, this.infraccion.getCamaraId());
        this.statement.setString(13, this.infraccion.getCamaraModelo());
        this.statement.setString(14, this.infraccion.getCamaraCodigoSerie());
        this.statement.setDouble(15, this.infraccion.getCamaraLatitud());
        this.statement.setDouble(16, this.infraccion.getCamaraLongitud());
        this.statement.setDouble(17, this.infraccion.getMonto());
        Date fechaUtil = infraccion.getFechaCaptura();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
        statement.setDate(18, fechaSQL);
        Date fechaUtilReg = infraccion.getFechaRegistro();
        java.sql.Date fechaSQLReg = new java.sql.Date(fechaUtilReg.getTime());
        statement.setDate(18, fechaSQLReg);

    }

    @Override
    protected void incluirValorDeParametrosParaEliminacion() throws SQLException {
        this.statement.setInt(1, infraccion.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaModificacion() throws SQLException {
        this.statement.setString(1, this.infraccion.getPlaca());
        this.statement.setDouble(2, this.infraccion.getVelocidad());
        this.statement.setDouble(3, this.infraccion.getLimite());
        this.statement.setDouble(4, this.infraccion.getExceso());
        this.statement.setString(5, this.infraccion.getVehiculoMarca());
        this.statement.setString(6, this.infraccion.getVehiculoModelo());
        this.statement.setInt(7, this.infraccion.getVehiculoAnho());
        this.statement.setString(8, this.infraccion.getPropietarioDni());
        this.statement.setString(9, this.infraccion.getPropietarioNombres());
        this.statement.setString(10, this.infraccion.getPropietarioApellidos());
        this.statement.setString(11, this.infraccion.getPropietarioDireccion());
        this.statement.setInt(12, this.infraccion.getCamaraId());
        this.statement.setString(13, this.infraccion.getCamaraModelo());
        this.statement.setString(14, this.infraccion.getCamaraCodigoSerie());
        this.statement.setDouble(15, this.infraccion.getCamaraLatitud());
        this.statement.setDouble(16, this.infraccion.getCamaraLongitud());
        this.statement.setDouble(17, this.infraccion.getMonto());
        Date fechaUtil = infraccion.getFechaCaptura();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
        statement.setDate(18, fechaSQL);
        Date fechaUtilReg = infraccion.getFechaRegistro();
        java.sql.Date fechaSQLReg = new java.sql.Date(fechaUtilReg.getTime());
        statement.setDate(19, fechaSQLReg);
        this.statement.setInt(20, infraccion.getId());

    }

    @Override
    protected void incluirValorDeParametrosParaObtenerPorId() throws SQLException {
        this.statement.setInt(1, infraccion.getId());
    }

    @Override
    protected void instanciarObjetoDelResultSet() throws SQLException {
        this.infraccion = new InfraccionDTO();
        this.infraccion.setId(this.resultSet.getInt("id"));
        this.infraccion.setPlaca(this.resultSet.getString("placa"));
        this.infraccion.setVelocidad(this.resultSet.getDouble("velocidad"));
        this.infraccion.setLimite(this.resultSet.getDouble("limite"));
        this.infraccion.setExceso(this.resultSet.getDouble("exceso"));
        this.infraccion.setVehiculoMarca(this.resultSet.getString("vehiculo_marca"));
        this.infraccion.setVehiculoModelo(this.resultSet.getString("vehiculo_modelo"));
        this.infraccion.setVehiculoAnho(this.resultSet.getInt("placa"));
        this.infraccion.setPropietarioDni(this.resultSet.getString("propietario_dni"));
        this.infraccion.setPropietarioNombres(this.resultSet.getString("propietario_nombres"));
        this.infraccion.setPropietarioApellidos(this.resultSet.getString("propietario_apellidos"));
        this.infraccion.setPropietarioDireccion(this.resultSet.getString("propietario_direccion"));
        this.infraccion.setCamaraId(this.resultSet.getInt("id_camara"));
        this.infraccion.setCamaraModelo(this.resultSet.getString("camara_modelo"));
        this.infraccion.setCamaraCodigoSerie(this.resultSet.getString("camara_codigo_serie"));
        this.infraccion.setCamaraLatitud(this.resultSet.getInt("camara_latitud"));
        this.infraccion.setCamaraLongitud(this.resultSet.getInt("camara_longitud"));
        this.infraccion.setMonto(this.resultSet.getDouble("placa"));
        this.infraccion.setFechaCaptura(new java.util.Date(resultSet.getDate("fecha_captura").getTime()));
        this.infraccion.setFechaRegistro(new java.util.Date(resultSet.getDate("fecha_registro").getTime()));

    }

    @Override
    protected void agregarObjetoALaLista(List lista) throws SQLException {
        this.instanciarObjetoDelResultSet();
        lista.add(this.infraccion);
    }

    @Override
    protected void limpiarObjetoDelResultSet() {
        this.infraccion = null;
    }
}
