/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transitsoft.dao;

import java.util.ArrayList;
import transitsoft.model.InfraccionDTO;

/**
 *
 * @author USUARIO
 */
public interface InfraccionDAO {

    public Integer insertar(InfraccionDTO infraccion);

    public InfraccionDTO obtenerPorId(Integer infraccionId);

    public Integer modificar(InfraccionDTO infraccion);

    public Integer eliminar(InfraccionDTO infraccion);

    public ArrayList<InfraccionDTO> listarTodos();
}
