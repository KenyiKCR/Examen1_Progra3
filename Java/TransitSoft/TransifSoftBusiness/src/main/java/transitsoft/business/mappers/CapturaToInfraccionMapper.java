/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.business.mappers;

import java.util.Date;
import transitsoft.model.CapturaDTO;
import transitsoft.model.InfraccionDTO;

/**
 *
 * @author USUARIO
 */
public class CapturaToInfraccionMapper implements Mapper<CapturaDTO, InfraccionDTO> {

    @Override
    public InfraccionDTO map(CapturaDTO captura) {
        InfraccionDTO infraccion = new InfraccionDTO();

        infraccion.setPlaca(captura.getPlaca());
        infraccion.setVelocidad(captura.getVelocidad());
        infraccion.setLimite(50.00);
        infraccion.setExceso(captura.getVelocidad() - 50.00);
        infraccion.setVehiculoMarca(captura.getVehiculo().getMarca());
        infraccion.setVehiculoModelo(captura.getVehiculo().getModelo());
        infraccion.setVehiculoAnho(captura.getVehiculo().getAnho());
        infraccion.setPropietarioDni(captura.getVehiculo().getPropietario().getDni());
        infraccion.setPropietarioNombres(captura.getVehiculo().getPropietario().getNombres());
        infraccion.setPropietarioApellidos(captura.getVehiculo().getPropietario().getApellidos());
        infraccion.setPropietarioDireccion(captura.getVehiculo().getPropietario().getDireccion());
        infraccion.setCamaraModelo(captura.getCamara().getModelo());
        infraccion.setCamaraCodigoSerie(captura.getCamara().getCodigoSerie());
        infraccion.setCamaraLatitud(captura.getCamara().getLatitud());
        infraccion.setCamaraLongitud(captura.getCamara().getLongitud());
        infraccion.setMonto(950.00);
        infraccion.setFechaCaptura(captura.getFechaCaptura());
        infraccion.setFechaRegistro(new Date());

        return infraccion;
    }
}
