/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transitsoft.dao;

import java.util.ArrayList;
import transitsoft.model.PropietarioDTO;

/**
 *
 * @author USUARIO
 */
public interface PropietarioDAO {

    public Integer insertar(PropietarioDTO propietario);

    public PropietarioDTO obtenerPorId(Integer propietarioId);

    public Integer modificar(PropietarioDTO propietario);

    public Integer eliminar(PropietarioDTO propietario);

    public ArrayList<PropietarioDTO> listarTodos();

}
