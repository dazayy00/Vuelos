/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Model.Vuelo;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author johan
 */
public class ConsultaPorTarifa implements IConsultaStrategy{

    //implementacion de strategy
    @Override
    public List<Vuelo> buscar(List<Vuelo> vuelos) {
        System.out.println("Ordenando vuelos por tarifa");
        return vuelos.stream()
                .sorted(Comparator.comparingDouble(Vuelo::getPrecioBase))
                .collect(Collectors.toList());
    }
}
