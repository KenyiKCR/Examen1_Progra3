/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transitsoft.dao;

import java.util.ArrayList;
import transitsoft.model.VehiculoDTO;

/**
 *
 * @author USUARIO
 */
public interface VehiculoDAO {

    public Integer insertar(VehiculoDTO vehiculo);

    public VehiculoDTO obtenerPorId(Integer vehiculoId);

    public Integer modificar(VehiculoDTO vehiculo);

    public Integer eliminar(VehiculoDTO vehiculo);

    public ArrayList<VehiculoDTO> listarTodos();

}
