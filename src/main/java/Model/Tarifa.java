/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public class Tarifa {
    private String clase;
    private double precio;

    public Tarifa(String clase, double precio) {
        this.clase = clase;
        this.precio = precio;
    }

    public String getClase() {
        return clase;
    }

    public double getPrecio() {
        return precio;
    }
    
}
