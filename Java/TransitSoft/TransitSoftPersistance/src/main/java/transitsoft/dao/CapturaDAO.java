/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transitsoft.dao;

import java.util.ArrayList;
import java.util.List;
import transitsoft.model.CapturaDTO;

/**
 *
 * @author USUARIO
 */
public interface CapturaDAO {

    public Integer insertar(CapturaDTO captura);

    public CapturaDTO obtenerPorId(Integer capturaId);

    public Integer modificar(CapturaDTO captura);

    public Integer eliminar(CapturaDTO captura);

    public ArrayList<CapturaDTO> listarTodos();

    public List<CapturaDTO> leerTodos();

    public boolean actualizar(CapturaDTO captura);
}
