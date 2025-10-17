/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transitsoft.dao;

import java.util.ArrayList;
import transitsoft.model.VehiculoPropietarioDTO;

/**
 *
 * @author USUARIO
 */
public interface VehiculoPropietarioDAO {

    public Integer insertar(VehiculoPropietarioDTO vehiculoPropietario);

    public VehiculoPropietarioDTO obtenerPorId(Integer vehiculoPropietarioId);

    public Integer modificar(VehiculoPropietarioDTO vehiculoPropietario);

    public Integer eliminar(VehiculoPropietarioDTO vehiculoPropietario);

    public ArrayList<VehiculoPropietarioDTO> listarTodos();
}
