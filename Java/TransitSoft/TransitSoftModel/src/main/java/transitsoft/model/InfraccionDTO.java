/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class InfraccionDTO {

    private Integer id;
    private String placa;
    private Double velocidad;
    private Double limite;
    private Double exceso;
    private String vehiculoMarca;
    private String vehiculoModelo;
    private Integer vehiculoAnho;
    private String propietarioDni;
    private String propietarioNombres;
    private String propietarioApellidos;
    private String propietarioDireccion;
    private Integer camaraId;
    private String camaraModelo;
    private String camaraCodigoSerie;
    private Integer camaraLatitud;
    private Integer camaraLongitud;
    private Double monto;
    private Date fechaCaptura;
    private Date fechaRegistro;

    public InfraccionDTO(Integer id, String placa, Double velocidad, Double limite, Double exceso, String vehiculoMarca, String vehiculoModelo, Integer vehiculoAnho, String propietarioDni, String propietarioNombres, String propietarioApellidos, String propietarioDireccion, Integer camaraId, String camaraModelo, String camaraCodigoSerie, Integer camaraLatitud, Integer camaraLongitud, Double monto, Date fechaCaptura, Date fechaRegistro) {
        this.id = id;
        this.placa = placa;
        this.velocidad = velocidad;
        this.limite = limite;
        this.exceso = exceso;
        this.vehiculoMarca = vehiculoMarca;
        this.vehiculoModelo = vehiculoModelo;
        this.vehiculoAnho = vehiculoAnho;
        this.propietarioDni = propietarioDni;
        this.propietarioNombres = propietarioNombres;
        this.propietarioApellidos = propietarioApellidos;
        this.propietarioDireccion = propietarioDireccion;
        this.camaraId = camaraId;
        this.camaraModelo = camaraModelo;
        this.camaraCodigoSerie = camaraCodigoSerie;
        this.camaraLatitud = camaraLatitud;
        this.camaraLongitud = camaraLongitud;
        this.monto = monto;
        this.fechaCaptura = fechaCaptura;
        this.fechaRegistro = fechaRegistro;
    }

    public InfraccionDTO(InfraccionDTO infraccion) {
        this.id = infraccion.id;
        this.placa = infraccion.placa;
        this.velocidad = infraccion.velocidad;
        this.limite = infraccion.limite;
        this.exceso = infraccion.exceso;
        this.vehiculoMarca = infraccion.vehiculoMarca;
        this.vehiculoModelo = infraccion.vehiculoModelo;
        this.vehiculoAnho = infraccion.vehiculoAnho;
        this.propietarioDni = infraccion.propietarioDni;
        this.propietarioNombres = infraccion.propietarioNombres;
        this.propietarioApellidos = infraccion.propietarioApellidos;
        this.propietarioDireccion = infraccion.propietarioDireccion;
        this.camaraId = infraccion.camaraId;
        this.camaraModelo = infraccion.camaraModelo;
        this.camaraCodigoSerie = infraccion.camaraCodigoSerie;
        this.camaraLatitud = infraccion.camaraLatitud;
        this.camaraLongitud = infraccion.camaraLongitud;
        this.monto = infraccion.monto;
        this.fechaCaptura = infraccion.fechaCaptura;
        this.fechaRegistro = infraccion.fechaRegistro;
    }

    public InfraccionDTO() {
        this.id = null;
        this.placa = null;
        this.velocidad = null;
        this.limite = null;
        this.exceso = null;
        this.vehiculoMarca = null;
        this.vehiculoModelo = null;
        this.vehiculoAnho = null;
        this.propietarioDni = null;
        this.propietarioNombres = null;
        this.propietarioApellidos = null;
        this.propietarioDireccion = null;
        this.camaraId = null;
        this.camaraModelo = null;
        this.camaraCodigoSerie = null;
        this.camaraLatitud = null;
        this.camaraLongitud = null;
        this.monto = null;
        this.fechaCaptura = null;
        this.fechaRegistro = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
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

    public String getVehiculoMarca() {
        return vehiculoMarca;
    }

    public void setVehiculoMarca(String vehiculoMarca) {
        this.vehiculoMarca = vehiculoMarca;
    }

    public String getVehiculoModelo() {
        return vehiculoModelo;
    }

    public void setVehiculoModelo(String vehiculoModelo) {
        this.vehiculoModelo = vehiculoModelo;
    }

    public Integer getVehiculoAnho() {
        return vehiculoAnho;
    }

    public void setVehiculoAnho(Integer vehiculoAnho) {
        this.vehiculoAnho = vehiculoAnho;
    }

    public String getPropietarioDni() {
        return propietarioDni;
    }

    public void setPropietarioDni(String propietarioDni) {
        this.propietarioDni = propietarioDni;
    }

    public String getPropietarioNombres() {
        return propietarioNombres;
    }

    public void setPropietarioNombres(String propietarioNombres) {
        this.propietarioNombres = propietarioNombres;
    }

    public String getPropietarioApellidos() {
        return propietarioApellidos;
    }

    public void setPropietarioApellidos(String propietarioApellidos) {
        this.propietarioApellidos = propietarioApellidos;
    }

    public String getPropietarioDireccion() {
        return propietarioDireccion;
    }

    public void setPropietarioDireccion(String propietarioDireccion) {
        this.propietarioDireccion = propietarioDireccion;
    }

    public Integer getCamaraId() {
        return camaraId;
    }

    public void setCamaraId(Integer camaraId) {
        this.camaraId = camaraId;
    }

    public String getCamaraModelo() {
        return camaraModelo;
    }

    public void setCamaraModelo(String camaraModelo) {
        this.camaraModelo = camaraModelo;
    }

    public String getCamaraCodigoSerie() {
        return camaraCodigoSerie;
    }

    public void setCamaraCodigoSerie(String camaraCodigoSerie) {
        this.camaraCodigoSerie = camaraCodigoSerie;
    }

    public Integer getCamaraLatitud() {
        return camaraLatitud;
    }

    public void setCamaraLatitud(Integer camaraLatitud) {
        this.camaraLatitud = camaraLatitud;
    }

    public Integer getCamaraLongitud() {
        return camaraLongitud;
    }

    public void setCamaraLongitud(Integer camaraLongitud) {
        this.camaraLongitud = camaraLongitud;
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
