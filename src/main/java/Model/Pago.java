/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author johan
 */
public class Pago {
    private String tipo;
    private LocalDate fecha;
    private double cantidad;

    public Pago(String tipo, LocalDate fecha, double cant) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.cantidad = cant;
    }
    
    
}
