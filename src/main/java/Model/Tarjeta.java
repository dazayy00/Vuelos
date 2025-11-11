/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author johan
 */
public class Tarjeta {
    private String numero;
    private String nombre;
    private String vencimiento;
    
    public Tarjeta(String num, String nom, String ven){
        this.numero = num;
        this.nombre = nom;
        this.vencimiento = ven;
    }
}
