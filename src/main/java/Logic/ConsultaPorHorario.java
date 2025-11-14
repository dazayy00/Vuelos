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
public class ConsultaPorHorario implements IConsultaStrategy{

    @Override
    public List<Vuelo> buscar(List<Vuelo> vuelos) {
        System.out.println("Ordenando vuelos por horario de salida");
        return vuelos.stream()
                .sorted(Comparator.comparing(Vuelo::getSalida))
                .collect(Collectors.toList());
    }
    
}
