/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.daoImp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import transitsoft.dao.CapturaDAO;
import transitsoft.daoImp.util.Columna;
import transitsoft.model.CamaraDTO;
import transitsoft.model.CapturaDTO;
import transitsoft.model.EstadoCaptura;
import transitsoft.model.PropietarioDTO;
import transitsoft.model.VehiculoDTO;

/**
 *
 * @author USUARIO
 */
public class CapturaDAOImp extends DAOImplBase implements CapturaDAO {

    private CapturaDTO captura;

    public CapturaDAOImp() {
        super("captura");
        retornarLlavePrimaria = true;
        captura = null;
    }

    @Override
    public Integer insertar(CapturaDTO captura) {
        this.captura = captura;
        retornarLlavePrimaria = true;
        return super.insertar();
    }

    @Override
    public List<CapturaDTO> leerTodos() {
        String listaSQL = "SELECT";
        listaSQL += "        c.id,\n"
                + "        c.placa,\n"
                + "        c.velocidad,\n"
                + "        c.fecha_captura,\n"
                + "        c.estado,\n"
                + "        c.id_camara,\n"
                + "        ca.modelo AS camara_modelo, \n"
                + "        ca.codigo_serie AS camara_codigo_serie, \n"
                + "        ca.latitud AS camara_latitud, \n"
                + "        ca.longitud AS camara_longitud, \n"
                + "        p.id as id_propietario, \n"
                + "        p.dni AS propietario_dni, \n"
                + "        p.nombres AS propietario_nombres, \n"
                + "        p.apellidos AS propietario_apellidos, \n"
                + "        p.direccion AS propietario_direccion,\n"
                + "        v.id AS id_vehiculo,\n"
                + "        v.placa AS vehiculo_placa, \n"
                + "        v.marca AS vehiculo_marca, \n"
                + "        v.modelo AS vehiculo_modelo, \n"
                + "        v.anho AS vehiculo_anho \n";
        listaSQL += "        FROM captura AS c\n"
                + "    INNER JOIN camara as ca \n"
                + "		ON c.id_camara = ca.id\n"
                + "    INNER JOIN vehiculo AS v\n"
                + "        ON v.placa = c.placa\n"
                + "    INNER JOIN vehiculo_propietario AS vp\n"
                + "        ON vp.id_vehiculo = v.id\n"
                + "	INNER JOIN propietario AS p\n"
                + "		ON vp.id_propietario = p.id";

        Consumer incluir = null;
        Object parametros = null;
        return (List<CapturaDTO>) super.listarTodos(listaSQL, incluir, parametros);
    }

    @Override
    public boolean actualizar(CapturaDTO captura) {
        this.captura = captura;
        return super.modificar() > 0;
    }

    @Override
    protected void configurarListaDeColumnas() {
        this.listaColumnas.add(new Columna("id", true, true));
        this.listaColumnas.add(new Columna("id_camara", false, false));
        this.listaColumnas.add(new Columna("placa", false, false));
        this.listaColumnas.add(new Columna("velocidad", false, false));
        this.listaColumnas.add(new Columna("fecha_captura", false, false));
        this.listaColumnas.add(new Columna("estado", false, false));
    }

    @Override
    protected void incluirValorDeParametrosParaModificacion() throws SQLException {
        statement.setInt(1, captura.getCamara().getId());
        statement.setString(2, captura.getPlaca());
        statement.setDouble(3, captura.getVelocidad());
        Date fechaUtil = captura.getFechaCaptura();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
        statement.setDate(4, fechaSQL);
        String estado;
        if (captura.getEstado() == EstadoCaptura.PROCESADO) {
            estado = "PROCESADO";
        } else {
            estado = "REGISTRADO";
        }
        statement.setString(5, estado);
        statement.setInt(6, captura.getId());
    }

    @Override
    protected void instanciarObjetoDelResultSet() throws SQLException {
        this.captura = new CapturaDTO();
        this.captura.setId(this.resultSet.getInt("id"));
        CamaraDTO camara = new CamaraDTO();
        camara.setId(resultSet.getInt("id_camara"));
        camara.setModelo(resultSet.getString("camara_modelo"));
        camara.setCodigoSerie(resultSet.getString("camara_codigo_serie"));
        camara.setLatitud(resultSet.getInt("camara_latitud"));
        camara.setLongitud(resultSet.getInt("camara_longitud"));
        this.captura.setCamara(camara);
        this.captura.setPlaca(this.resultSet.getString("placa"));
        captura.setVelocidad(resultSet.getDouble("velocidad"));
        captura.setFechaCaptura(new java.util.Date(resultSet.getDate("fecha_captura").getTime()));
        if ("REGISTRADO".equals(resultSet.getString("estado"))) {
            captura.setEstado(EstadoCaptura.REGISTRADO);
        } else {
            captura.setEstado(EstadoCaptura.PROCESADO);
        }
        PropietarioDTO pro = new PropietarioDTO();
        pro.setId(resultSet.getInt("id_propietario"));
        pro.setDni(resultSet.getString("propietario_dni"));
        pro.setNombres(resultSet.getString("propietario_nombres"));
        pro.setApellidos(resultSet.getString("propietario_apellidos"));
        pro.setDireccion(resultSet.getString("propietario_direccion"));
        VehiculoDTO vehiculo = new VehiculoDTO();
        vehiculo.setId(resultSet.getInt("id_vehiculo"));
        vehiculo.setPlaca(resultSet.getString("vehiculo_placa"));
        vehiculo.setPropietario(pro);
        vehiculo.setMarca(resultSet.getString("vehiculo_marca"));
        vehiculo.setModelo(resultSet.getString("vehiculo_modelo"));
        vehiculo.setAnho(resultSet.getInt("vehiculo_anho"));
        captura.setVehiculo(vehiculo);
    }

    @Override
    protected void limpiarObjetoDelResultSet() {
        this.captura = null;
    }

    @Override
    protected void agregarObjetoALaLista(List lista) throws SQLException {
        this.instanciarObjetoDelResultSet();
        lista.add(this.captura);
    }

    @Override
    public Integer eliminar(CapturaDTO captura) {
        this.captura = captura;
        return super.eliminar();
    }

    @Override
    public ArrayList<CapturaDTO> listarTodos() {
        return (ArrayList<CapturaDTO>) super.listarTodos();
    }

    @Override
    public Integer modificar(CapturaDTO captura) {
        this.captura = captura;
        return super.modificar();
    }

    @Override
    public CapturaDTO obtenerPorId(Integer capturaId) {
        CapturaDTO captura = new CapturaDTO();
        captura.setId(capturaId);
        this.captura = captura;
        super.obtenerPorId();
        return this.captura;
    }

    @Override
    protected void incluirValorDeParametrosParaEliminacion() throws SQLException {
        this.statement.setInt(1, this.captura.getId());
    }

    @Override
    protected void incluirValorDeParametrosParaInsercion() throws SQLException {
        this.statement.setInt(1, this.captura.getCamara().getId());
        this.statement.setString(2, this.captura.getPlaca());
        this.statement.setDouble(3, this.captura.getVelocidad());
        java.util.Date fechaUtil = captura.getFechaCaptura();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
        this.statement.setDate(4, fechaSQL);
        String estado;
        if (captura.getEstado() == EstadoCaptura.PROCESADO) {
            estado = "PROCESADO";
        } else {
            estado = "REGISTRADO";
        }
        statement.setString(5, estado);

    }

    
}
