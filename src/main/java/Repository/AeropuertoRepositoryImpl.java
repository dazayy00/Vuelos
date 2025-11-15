/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Aeropuerto;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author johan
 */
public class AeropuertoRepositoryImpl implements IAeropuertoRepository {
    private Map<String, Aeropuerto> db = new HashMap<>();

    public AeropuertoRepositoryImpl() {
        db.put("MEX", new Aeropuerto("MEX", "Benito Juárez", "Ciudad de México"));
        db.put("MTY", new Aeropuerto("MTY", "Mariano Escobedo", "Monterrey"));
    }

    @Override
    public Aeropuerto findByCodigo(String c) { 
        return db.get(c); 
    }
}