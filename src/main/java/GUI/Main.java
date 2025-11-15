/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import Logic.*;
import Model.*;
import Repository.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        
        Pasajero pasajero = new Pasajero("johanbal@gmail.com", "123", "Johan", "Alamos sm");
        
        System.out.println("----- SISTEMA DE RESERVA DE VUELOS -----");
        
        System.out.println("Busqueda 1: Por horario (Default)");
        
        List<Vuelo> vuelosPorHora = servicioConsulta.consultar("MEX", "MTY");
        vuelosPorHora.forEach(v -> System.out.printf("Vuelo: %s, Sale: %tT, Precio: $%.2f%n",
                v.getNumero(), v.getSalida(), v.getPrecioBase()));
        
        System.out.println("Busqueda 2: Por tarifa");
        
        servicioConsulta.setEstrategia(new ConsultaPorTarifa());
        List<Vuelo> vuelosPorTarifa = servicioConsulta.consultar("MEX", "MTY");
        vuelosPorTarifa.forEach(v -> System.out.printf("Vuelo: %s, Sale: %tT, Precio: $%.2f%n",
                v.getNumero(), v.getSalida(), v.getPrecioBase()));
        
        System.out.println("---- Reserva y Compra ----");
        Vuelo vueloElegido = vuelosPorTarifa.get(0);
        
        Reserva miReserva = new Reserva("R-001", List.of(vueloElegido), List.of(pasajero));
        pasajero.agregarReserva(miReserva);
        System.out.println("Reserva: "+ miReserva.getClave()+ " creada. Costo total: $"+ miReserva.getCostoTotal());
        
        Tarjeta miTarjeta = new Tarjeta("1245-4596-7863-0001", "Johan David Baltazar Trinidad", "09/32");
        pasajero.agregarTarjeta(miTarjeta);
        
        miReserva.realizarPago(miTarjeta);
        
        System.out.println("Estado de la reserva: "+ (miReserva.isPagada() ? "Pagada" : "Pendiente"));
    }
    
}
