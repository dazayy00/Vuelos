/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import Logic.*;
import Repository.*;

/**
 *
 * @author johan
 */
public class Main {

    public static void main(String[] args) {
        IAeropuertoRepository aeropuertoRepo = new AeropuertoRepositoryImpl();
        IAerolineaRepository aerolineaRepo = new AerolineaRepositoryImpl();
        IVueloRepository vueloRepo = new VueloRepositoryImpl(aeropuertoRepo, aerolineaRepo);
        
        ServicioConsulta servicioConsulta = new ServicioConsulta(vueloRepo);
    }
    
}
