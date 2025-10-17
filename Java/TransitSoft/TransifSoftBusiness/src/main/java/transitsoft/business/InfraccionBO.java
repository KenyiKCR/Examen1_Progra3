/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.business;

import java.util.List;
import java.util.stream.Collectors;
import transitsoft.business.mappers.CapturaToInfraccionMapper;
import transitsoft.model.CapturaDTO;
import transitsoft.model.InfraccionDTO;

/**
 *
 * @author USUARIO
 */
public class InfraccionBO {

    public List<InfraccionDTO> crearInfracciones(List<CapturaDTO> capturasConExceso) {
        var mapper = new CapturaToInfraccionMapper();
        return capturasConExceso.stream().map(mapper::map).collect(Collectors.toList());
    }
}
