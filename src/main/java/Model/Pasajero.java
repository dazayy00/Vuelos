/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class Pasajero {
    private String email;
    private String password;
    private String nombre;
    private String direccion;
    
    private List<Tarjeta> tarjetas;
    private List<Reserva> reservas;

    public Pasajero(String email, String password, String nombre, String direccion, List<Tarjeta> tarjetas, List<Reserva> reservas) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarjetas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    
    public boolean validarPassword(String password){
        return this.password.equals(password);
    }
    
    public void agregarTarjeta(Tarjeta tarjeta){
        this.tarjetas.add(tarjeta);
    }
    
    public void agregarReserva(Reserva reserva){
        this.reservas.add(reserva);
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarjeta> getTarjetas() {
        return tarjetas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
    
    
}
