/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Aerolinea;

/**
 *
 * @author johan
 */
public interface IAerolineaRepository {
    Aerolinea findByNombre(String n);
}
