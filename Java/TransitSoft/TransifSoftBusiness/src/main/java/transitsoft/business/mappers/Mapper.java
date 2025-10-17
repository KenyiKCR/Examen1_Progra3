/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package transitsoft.business.mappers;

/**
 *
 * @author USUARIO
 */
public interface Mapper<S, T> {

    T map(S original);
}
