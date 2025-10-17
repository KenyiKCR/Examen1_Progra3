package pe.edu.pucp.transitsoft.bo;

import java.util.List;
import java.util.stream.Collectors;
import pe.edu.pucp.transitsoft.bo.mappers.CapturaToInfraccionMapper;
import pe.edu.pucp.transitsoft.model.CapturaDTO;
import pe.edu.pucp.transitsoft.model.InfraccionDTO;

public class InfraccionBOImpl implements InfraccionBO {
    
    @Override
    public List<InfraccionDTO> crearInfracciones(List<CapturaDTO> capturasConExceso) {
        var mapper = new CapturaToInfraccionMapper();
        return capturasConExceso.stream()
            .map(mapper::map)
            .collect(Collectors.toList());
    }
}
