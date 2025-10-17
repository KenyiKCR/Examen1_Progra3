/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transitsoft.dao;

import java.util.ArrayList;
import transitsoft.model.CamaraDTO;

/**
 *
 * @author USUARIO
 */
public interface CamaraDAO {

    public Integer insertar(CamaraDTO camara);

    public CamaraDTO obtenerPorId(Integer camaraId);

    public Integer modificar(CamaraDTO camara);

    public Integer eliminar(CamaraDTO camara);

    public ArrayList<CamaraDTO> listarTodos();
}
