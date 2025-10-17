/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.model;

/**
 *
 * @author USUARIO
 */
public class VehiculoPropietarioDTO {

    private Integer id;
    private VehiculoDTO vehiculo;
    private PropietarioDTO propietario;

    public VehiculoPropietarioDTO(Integer id, VehiculoDTO vehiculo, PropietarioDTO propietario) {
        this.id = id;
        this.vehiculo = vehiculo;
        this.propietario = propietario;
    }

    public VehiculoPropietarioDTO() {
        this.id = null;
        this.vehiculo = null;
        this.propietario = null;
    }

    public VehiculoPropietarioDTO(VehiculoPropietarioDTO vehiculoPropietario) {
        VehiculoDTO vehi = vehiculoPropietario.vehiculo;
        PropietarioDTO prop = vehiculoPropietario.propietario;
        this.id = vehiculoPropietario.id;
        this.vehiculo = vehi;
        this.propietario = prop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
    }

    public PropietarioDTO getPropietario() {
        return propietario;
    }

    public void setPropietario(PropietarioDTO propietario) {
        this.propietario = propietario;
    }

}
