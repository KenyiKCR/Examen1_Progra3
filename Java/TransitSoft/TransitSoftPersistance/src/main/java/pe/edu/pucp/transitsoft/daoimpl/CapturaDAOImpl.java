package pe.edu.pucp.transitsoft.daoimpl;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import pe.edu.pucp.transitsoft.dao.CapturaDAO;

import pe.edu.pucp.transitsoft.daoimpl.util.Columna;
import pe.edu.pucp.transitsoft.model.CamaraDTO;
import pe.edu.pucp.transitsoft.model.CapturaDTO;
import pe.edu.pucp.transitsoft.model.PropietarioDTO;
import pe.edu.pucp.transitsoft.model.VehiculoDTO;
import pe.edu.pucp.transitsoft.model.util.EstadoCaptura;

// TODO: Implementar CapturaDAOImpl
public class CapturaDAOImpl extends DAOImplBase implements CapturaDAO{

    
    private CapturaDTO captura;

    public CapturaDAOImpl() {
        super("captura");
        this.captura = null;
        this.retornarLlavePrimaria = true;
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
    public List<CapturaDTO> listarTodos() {
        String listaSQL = "SELECT";
        listaSQL+="        c.id,\n" +
        "        c.placa,\n" +
        "        c.velocidad,\n" +
        "        c.fecha_captura,\n" +
        "        c.estado,\n" +
        "        c.id_camara,\n" +
        "        ca.modelo AS camara_modelo, \n" +
        "        ca.codigo_serie AS camara_codigo_serie, \n" +
        "        ca.latitud AS camara_latitud, \n" +
        "        ca.longitud AS camara_longitud, \n" +
        "        p.id as id_propietario, \n" +
        "        p.dni AS propietario_dni, \n" +
        "        p.nombres AS propietario_nombres, \n" +
        "        p.apellidos AS propietario_apellidos, \n" +
        "        p.direccion AS propietario_direccion,\n" +
        "        v.id AS id_vehiculo,\n" +
        "        v.placa AS vehiculo_placa, \n" +
        "        v.marca AS vehiculo_marca, \n" +
        "        v.modelo AS vehiculo_modelo, \n" +
        "        v.anho AS vehiculo_anho \n";
        listaSQL+="        FROM captura AS c\n" +
        "    INNER JOIN camara as ca \n" +
        "		ON c.id_camara = ca.id\n" +
        "    INNER JOIN vehiculo AS v\n" +
        "        ON v.placa = c.placa\n" +
        "    INNER JOIN vehiculo_propietario AS vp\n" +
        "        ON vp.id_vehiculo = v.id\n" +
        "	INNER JOIN propietario AS p\n" +
        "		ON vp.id_propietario = p.id";
        
        Object parametros = null;
        Consumer incluirValorParametros = null;
        return (ArrayList<CapturaDTO>) super.listarTodos(listaSQL,
                incluirValorParametros,parametros);
    }

    @Override
    protected void instanciarObjetoDelResultSet() throws SQLException {
        this.captura = new CapturaDTO();
        this.captura.setId(this.resultSet.getInt("id"));
        this.captura.setPlaca(this.resultSet.getString("placa"));
        this.captura.setVelocidad(this.resultSet.getDouble("velocidad"));
        this.captura.setFechaCaptura(this.resultSet.getDate("fecha_captura"));
        
        if("REGISTRADO".equals(this.resultSet.getString("estado"))) {
            this.captura.setEstado(EstadoCaptura.REGISTRADO);
        }else this.captura.setEstado(EstadoCaptura.PROCESADO);
        
        
        
        CamaraDTO camara = new CamaraDTO();
        
        camara.setId(this.resultSet.getInt("id_camara"));
        camara.setModelo(this.resultSet.getString("camara_modelo"));
        camara.setCodigoSerie(this.resultSet.getString("camara_codigo_serie"));
        camara.setLatitud(this.resultSet.getLong("camara_latitud"));
        camara.setLongitud(this.resultSet.getLong("camara_longitud"));
        this.captura.setCamara(camara);
        
        
        VehiculoDTO vehiculo = new VehiculoDTO();
        vehiculo.setId(this.resultSet.getInt("id_vehiculo"));
        vehiculo.setPlaca(this.resultSet.getString("vehiculo_placa"));
        vehiculo.setMarca(this.resultSet.getString("vehiculo_marca"));
        vehiculo.setModelo(this.resultSet.getString("vehiculo_modelo"));
        vehiculo.setAnho(this.resultSet.getInt("vehiculo_anho"));
       
        
        PropietarioDTO propietario = new PropietarioDTO();
        propietario.setId(this.resultSet.getInt("id_propietario"));
        propietario.setDni(this.resultSet.getString("propietario_dni"));
        propietario.setNombres(this.resultSet.getString("propietario_nombres"));
        propietario.setApellidos(this.resultSet.getString("propietario_apellidos"));
        propietario.setDireccion(this.resultSet.getString("propietario_direccion"));
       
        vehiculo.setPropietario(propietario);
        this.captura.setVehiculo(vehiculo);
        
    }

    
    
    @Override
    protected void agregarObjetoALaLista(List lista) throws SQLException {
        this.instanciarObjetoDelResultSet();
        lista.add(this.captura);
    }

    @Override
    protected void limpiarObjetoDelResultSet() {
        this.captura = null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    @Override
    public Boolean modificar(CapturaDTO captura) {
        return super.modificar()>0;
    }

    @Override
    protected void incluirValorDeParametrosParaModificacion() throws SQLException {
        this.statement.setInt(1,this.captura.getCamara().getId());
        this.statement.setString(2,this.captura.getPlaca());
        this.statement.setDouble(3,this.captura.getVelocidad());
        this.statement.setDate(4, (Date) this.captura.getFechaCaptura());
        if(this.captura.getEstado().equals(EstadoCaptura.REGISTRADO))
            this.statement.setString(5,"REGISTRADO");
        else this.statement.setString(5,"PROCESADO");
        
        this.statement.setInt(6,this.captura.getId());
        
    }
    
    
    
}