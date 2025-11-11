/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public class Aeropuerto {
    private String codigoIATA;
    private String nombre;
    private String ciudad;

    public Aeropuerto(String codigoIATA, String nombre, String ciudad) {
        this.codigoIATA = codigoIATA;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public String getNombre() {
        return nombre;
    }
    
}
