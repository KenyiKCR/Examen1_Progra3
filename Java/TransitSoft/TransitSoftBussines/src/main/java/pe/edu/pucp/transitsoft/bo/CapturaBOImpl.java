package pe.edu.pucp.transitsoft.bo;

import java.util.ArrayList;
import java.util.List;
import pe.edu.pucp.transitsoft.dao.CapturaDAO;
import pe.edu.pucp.transitsoft.daoimpl.CapturaDAOImpl;
import pe.edu.pucp.transitsoft.model.CapturaDTO;
import pe.edu.pucp.transitsoft.model.util.EstadoCaptura;

public class CapturaBOImpl implements CapturaBO {
    private final CapturaDAO capturaDao;
    
    public CapturaBOImpl() {
        this.capturaDao = new CapturaDAOImpl();
    }
    
    @Override
    public List<CapturaDTO> obtenerCapturasConExcesoDeVelocidad() {
        ArrayList<CapturaDTO> capturasExceso = new ArrayList();
        ArrayList<CapturaDTO> capturas = new ArrayList();
        
        capturas = (ArrayList<CapturaDTO>) capturaDao.listarTodos();
        
        for (CapturaDTO captura : capturas) {
            if(captura.getVelocidad()>= 50){
                capturasExceso.add(captura);
            }
            
        }
        // TODO: LLamar a capturaDao.leerTodos() y luego
        // devolver solo las capturas donde la velocidad excede
        // el limite permitido
        return capturasExceso;
    }

    @Override
    public void actualizar(CapturaDTO modelo) {
        // TODO: Llamar a capturaDao.actualizar(modelo)
        modelo.setEstado(EstadoCaptura.PROCESADO);
        this.capturaDao.modificar(modelo);
    }
}
