package pe.edu.pucp.transitsoft.bo;

import java.util.List;
import pe.edu.pucp.transitsoft.model.CapturaDTO;
import pe.edu.pucp.transitsoft.model.InfraccionDTO;

/**
 *
 * @author eric
 */
public interface InfraccionBO {
    List<InfraccionDTO> crearInfracciones(List<CapturaDTO> capturasConExceso);
}
