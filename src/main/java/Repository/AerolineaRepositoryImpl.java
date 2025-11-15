/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Aerolinea;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author johan
 */
public class AerolineaRepositoryImpl implements IAerolineaRepository {
    private Map<String, Aerolinea> db = new HashMap<>();

    public AerolineaRepositoryImpl() { 
        db.put("Aeromexico", new Aerolinea("Aeromexico")); 
    }

    @Override
    public Aerolinea findByNombre(String n) { 
        return db.get(n); 
    }
}
