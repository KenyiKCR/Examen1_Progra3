/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.model;

/**
 *
 * @author USUARIO
 */
public class VehiculoDTO {

    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    private Integer anho;
    private PropietarioDTO propietario;

    public VehiculoDTO(Integer id, String placa, String marca, String modelo, Integer anho, PropietarioDTO propietario) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.propietario = propietario;
    }

    public VehiculoDTO() {
        this.id = null;
        this.placa = null;
        this.marca = null;
        this.modelo = null;
        this.anho = null;
        this.propietario = null;
    }

    public VehiculoDTO(VehiculoDTO vehiculo) {
        this.id = vehiculo.id;
        this.placa = vehiculo.placa;
        this.marca = vehiculo.marca;
        this.modelo = vehiculo.modelo;
        this.anho = vehiculo.anho;
        this.propietario = vehiculo.propietario;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    public PropietarioDTO getPropietario() {
        return propietario;
    }

    public void setPropietario(PropietarioDTO propietario) {
        this.propietario = propietario;
    }

}
