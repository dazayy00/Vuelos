/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author johan
 */
public class Reserva {
    private String clave;
    private double costoTotal;
    
    private List<Vuelo> vuelos;
    private List<Pasajero> pasajeros;
    private Pago pago;

    public Reserva(String clave, List<Vuelo> vuelos, List<Pasajero> pasajeros) {
        this.clave = clave;
        this.vuelos = vuelos;
        this.pasajeros = pasajeros;
        this.costoTotal = calcularCostoTotal();
        this.pago = null;
    }

    private double calcularCostoTotal() {
        double total = 0;
        for(Vuelo v : vuelos){
            total += v.getPrecioBase();
        }
        return total * pasajeros.size();
    }
    
    public boolean realizarPago(Tarjeta tarjeta){
        this.pago = new Pago("Tarjeta", java.time.LocalDate.now(), this.costoTotal);
        System.out.println("Reserva "+ clave + " pagada con exito");
        return true;
    }
    
    public boolean isPagada(){
        return this.pago != null;
    }
    
    public String getClave(){
        return clave;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
    
    
}
