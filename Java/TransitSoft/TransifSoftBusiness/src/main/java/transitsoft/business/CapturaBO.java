/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.business;

import java.util.ArrayList;
import java.util.List;
import transitsoft.dao.CapturaDAO;
import transitsoft.daoImp.CapturaDAOImp;
import transitsoft.model.CapturaDTO;

/**
 *
 * @author USUARIO
 */
public class CapturaBO {

    private final CapturaDAO capturaDao;

    public CapturaBO() {
        this.capturaDao = new CapturaDAOImp();
    }

    public List<CapturaDTO> obtenerCapturasConExcesoDeVelocidad() {
        // TODO: LLamar a capturaDao.leerTodos() y luego
        // devolver solo las capturas donde la velocidad excede
        // el limite permitido
        List<CapturaDTO> listaTotal = capturaDao.leerTodos();
        List<CapturaDTO> listExceso = new ArrayList<CapturaDTO>();
        for (CapturaDTO cap : listaTotal) {
            if (cap.getVelocidad() > 50) {
                listExceso.add(cap);
            }
        }
        return listExceso;
    }

    public void actualizar(CapturaDTO modelo) {
        // TODO: Llamar a capturaDao.actualizar(modelo)
        capturaDao.actualizar(modelo);
    }
}
