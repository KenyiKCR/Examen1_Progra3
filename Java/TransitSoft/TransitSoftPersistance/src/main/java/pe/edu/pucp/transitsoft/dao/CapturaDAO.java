package pe.edu.pucp.transitsoft.dao;

import java.util.List;
import pe.edu.pucp.transitsoft.model.CapturaDTO;

// TODO: Definir Interfaz CapturaDAO
public interface CapturaDAO {
    public List<CapturaDTO> listarTodos();
    public Boolean modificar(CapturaDTO captura);
}
