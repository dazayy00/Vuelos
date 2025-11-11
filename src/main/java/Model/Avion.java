/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public class Avion {
    private String tipo;
    private int numPasajeros;

    public Avion(String tipo, int numPasajeros) {
        this.tipo = tipo;
        this.numPasajeros = numPasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }
    
    
}
