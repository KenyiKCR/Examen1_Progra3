package pe.edu.pucp.transitsoft.model;

import pe.edu.pucp.transitsoft.model.util.EstadoCaptura;
import java.util.Date;

public class CapturaDTO {
    private Integer id;
    private String placa;
    private Double velocidad;
    private Date fechaCaptura;
    private CamaraDTO camara;
    private EstadoCaptura estado;
    private VehiculoDTO vehiculo;

    public CapturaDTO() {
        this.id = null;
        this.placa = null;
        this.velocidad = null;
        this.fechaCaptura = null;
        this.camara = null;
        this.estado = null;
        this.vehiculo = vehiculo;
    }

    
    public CapturaDTO(Integer id, String placa, Double velocidad,
            Date fechaCaptura, CamaraDTO camara, EstadoCaptura estado,
            VehiculoDTO vehiculo) {
        this.id = id;
        this.placa = placa;
        this.velocidad = velocidad;
        this.fechaCaptura = fechaCaptura;
        this.camara = camara;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CamaraDTO getCamara() {
        return camara;
    }

    public void setCamara(CamaraDTO camara) {
        this.camara = camara;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public EstadoCaptura getEstado() {
        return estado;
    }

    public void setEstado(EstadoCaptura estado) {
        this.estado = estado;
    }
}