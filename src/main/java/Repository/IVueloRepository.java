/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Vuelo;
import java.util.List;

/**
 *
 * @author johan
 */
public interface IVueloRepository {
    List<Vuelo> findByOrigenDestino(String codigoOrigen, String codigoDestino);
    Vuelo findByNumero(String numero);
    List<Vuelo> findAll();
}
