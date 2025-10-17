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
public class CapturaDTO {

    private Integer id;
    private CamaraDTO camara;
    private String placa;
    private Double velocidad;
    private Date fechaCaptura;
    //private String estado;
    private EstadoCaptura estado;
    private VehiculoDTO vehiculo;

//    public CapturaDTO(Integer id, CamaraDTO camara, String placa, Double velocidad, LocalDate fechaCaptura, String estado) {
//        this.id = id;
//        this.camara = camara;
//        this.placa = placa;
//        this.velocidad = velocidad;
//        this.fechaCaptura = fechaCaptura;
//        this.estado = estado;
//    }
    public CapturaDTO(Integer id, CamaraDTO camara, String placa, Double velocidad, Date fechaCaptura, EstadoCaptura estado, VehiculoDTO vehiculo) {
        this.id = id;
        this.camara = camara;
        this.placa = placa;
        this.velocidad = velocidad;
        this.fechaCaptura = fechaCaptura;
        this.estado = estado;
        this.vehiculo = vehiculo;
    }

    public CapturaDTO() {
        this.id = null;
        this.camara = null;
        this.placa = null;
        this.velocidad = null;
        this.fechaCaptura = null;
        this.estado = null;
        this.vehiculo = null;
    }

    public CapturaDTO(CapturaDTO captura) {
        CamaraDTO cam = captura.camara;
        this.id = captura.id;
        this.camara = cam;
        this.placa = captura.placa;
        this.velocidad = captura.velocidad;
        this.fechaCaptura = captura.fechaCaptura;
        this.estado = captura.estado;
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

    public Date getFechaCaptura() {
        return fechaCaptura;
    }



    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

//    public String getEstado() {
//        return estado;
//    }
//
//    public void setEstado(String estado) {
//        this.estado = estado;
//    }
    public EstadoCaptura getEstado() {
        return estado;
    }

    public void setEstado(EstadoCaptura estado) {
        this.estado = estado;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
    }

}
