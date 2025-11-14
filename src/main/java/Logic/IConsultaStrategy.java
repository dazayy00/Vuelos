/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Logic;

import Model.Vuelo;
import java.util.List;

/**
 *
 * @author johan
 */
public interface IConsultaStrategy {
    List<Vuelo> buscar(List<Vuelo> vuelos);
}
