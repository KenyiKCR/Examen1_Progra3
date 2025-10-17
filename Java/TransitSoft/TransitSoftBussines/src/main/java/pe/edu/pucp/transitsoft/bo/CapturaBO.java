package pe.edu.pucp.transitsoft.bo;

import java.util.List;
import pe.edu.pucp.transitsoft.model.CapturaDTO;

public interface CapturaBO {
    List<CapturaDTO> obtenerCapturasConExcesoDeVelocidad();
    void actualizar(CapturaDTO modelo);
}
