/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class Vuelo {
    private String numero;
    private LocalDateTime salida;
    private LocalDateTime llegada;
    
    private Aeropuerto origen;
    private Aeropuerto destino;
    private List<Aeropuerto> escalas;
    private Aerolinea aerolinea;
    private Avion avion;
    
    private List<Asiento> asientos;
    private List<Tarifa> tarifas;

    public Vuelo(String numero, LocalDateTime salida, LocalDateTime llegada, Aeropuerto origen, Aeropuerto destino, Aerolinea aerolinea, Avion avion) {
        this.numero = numero;
        this.salida = salida;
        this.llegada = llegada;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.avion = avion;
        
        this.tarifas = new ArrayList<>();
        this.asientos = new ArrayList<>();
    }
    
    public void agregarTarifa(Tarifa tarifa){
        this.tarifas.add(tarifa);
    }
    
    public double getPrecioBase(){
        if(tarifas.isEmpty()) return 0.0;
        
        return tarifas.get(0).getPrecio();
    }

    public String getNumero() {
        return numero;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public List<Tarifa> getTarifas() {
        return tarifas;
    }
    
    
}
