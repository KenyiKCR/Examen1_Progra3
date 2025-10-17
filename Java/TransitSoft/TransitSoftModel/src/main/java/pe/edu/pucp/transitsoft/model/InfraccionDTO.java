package pe.edu.pucp.transitsoft.model;

import java.util.Date;

public class InfraccionDTO {

    private String placa;
    private Double velocidad;
    private Double limite;
    private Double exceso;
    private String marcaVehiculo;
    private String modeloVehiculo;
    private Integer anhoVehiculo;
    private String dniPropietario;
    private String nombresPropietario;
    private String apellidosPropietario;
    private String direccionPropietario;
    private String modeloCamara;
    private String codigoSerieCamara;
    private Long latitud;
    private Long longitud;
    private Double monto;
    private Date fechaCaptura;
    private Date fechaRegistro;

    public InfraccionDTO() {
        this.placa = null;
        this.velocidad = null;
        this.limite = null;
        this.exceso = null;
        this.marcaVehiculo = null;
        this.modeloVehiculo = null;
        this.anhoVehiculo = null;
        this.dniPropietario = null;
        this.nombresPropietario = null;
        this.apellidosPropietario = null;
        this.direccionPropietario = null;
        this.modeloCamara = null;
        this.codigoSerieCamara = null;
        this.latitud = null;
        this.longitud = null;
        this.monto = null;
        this.fechaCaptura = null;
        this.fechaRegistro = null;
    }
    
    public InfraccionDTO(String placa, Double velocidad, Double limite,
            Double exceso, String marcaVehiculo, String modeloVehiculo,
            Integer anhoVehiculo, String dniPropietario,
            String nombresPropietario, String apellidosPropietario,
            String direccionPropietario, String modeloCamara,
            String codigoSerieCamara, Long latitud, Long longitud,
            Double monto, Date fechaCaptura, Date fechaRegistro) {
        this.placa = placa;
        this.velocidad = velocidad;
        this.limite = limite;
        this.exceso = exceso;
        this.marcaVehiculo = marcaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.anhoVehiculo = anhoVehiculo;
        this.dniPropietario = dniPropietario;
        this.nombresPropietario = nombresPropietario;
        this.apellidosPropietario = apellidosPropietario;
        this.direccionPropietario = direccionPropietario;
        this.modeloCamara = modeloCamara;
        this.codigoSerieCamara = codigoSerieCamara;
        this.latitud = latitud;
        this.longitud = longitud;
        this.monto = monto;
        this.fechaCaptura = fechaCaptura;
        this.fechaRegistro = fechaRegistro;
    }
    
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getvelocidad() {
        return velocidad;
    }

    public void setvelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getExceso() {
        return exceso;
    }

    public void setExceso(Double exceso) {
        this.exceso = exceso;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public Integer getAnhoVehiculo() {
        return anhoVehiculo;
    }

    public void setAnhoVehiculo(Integer anhoVehiculo) {
        this.anhoVehiculo = anhoVehiculo;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }

    public String getNombresPropietario() {
        return nombresPropietario;
    }

    public void setNombresPropietario(String nombresPropietario) {
        this.nombresPropietario = nombresPropietario;
    }

    public String getApellidosPropietario() {
        return apellidosPropietario;
    }

    public void setApellidosPropietario(String apellidosPropietario) {
        this.apellidosPropietario = apellidosPropietario;
    }

    public String getDireccionPropietario() {
        return direccionPropietario;
    }

    public void setDireccionPropietario(String direccionPropietario) {
        this.direccionPropietario = direccionPropietario;
    }

    public String getModeloCamara() {
        return modeloCamara;
    }

    public void setModeloCamara(String modeloCamara) {
        this.modeloCamara = modeloCamara;
    }

    public String getCodigoSerieCamara() {
        return codigoSerieCamara;
    }

    public void setCodigoSerieCamara(String codigoSerieCamara) {
        this.codigoSerieCamara = codigoSerieCamara;
    }

    public Long getLatitud() {
        return latitud;
    }

    public void setLatitud(Long latitud) {
        this.latitud = latitud;
    }

    public Long getLongitud() {
        return longitud;
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
