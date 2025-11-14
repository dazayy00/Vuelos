/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author johan
 */
public class VueloRepositoryImpl implements IVueloRepository{
    private static Map<String, Vuelo> dbVuelos = new HashMap<>();
    
    public VueloRepositoryImpl(IAeropuertoRepository aeropuertoRepo, IAerolineaRepository aerolineaRepo){
        Aeropuerto mex = aeropuertoRepo.findByCodigo("MEX");
        Aeropuerto mty = aeropuertoRepo.findByCodigo("MTY");
        Aerolinea am = aerolineaRepo.findByNombre("Aeromexico");
        Avion b737 = new Avion("Boeing 737", 150);
        
        Vuelo am100 = new Vuelo("AM100",
            LocalDateTime.now().plusDays(1).withHour(10).withMinute(30),
            LocalDateTime.now().plusDays(1).withHour(12).withMinute(0),
            mex, mty, am, b737);
        am100.agregarTarifa(new Tarifa("Economica", 1500.00));
        
        Vuelo am102 = new Vuelo("AM102",
            LocalDateTime.now().plusDays(1).withHour(14).withMinute(0),
            LocalDateTime.now().plusDays(1).withHour(15).withMinute(30),
            mex, mty, am, b737);
        am102.agregarTarifa(new Tarifa("Economica", 1000.00));
        
        dbVuelos.put(am100.getNumero(), am100);
        dbVuelos.put(am102.getNumero(), am102);
    }
    
    @Override
    public List<Vuelo> findByOrigenDestino(String codigoOrigen, String codigoDestino){
        return dbVuelos.values().stream()
                .filter(v -> v.getOrigen().getCodigoIATA().equals(codigoOrigen) &&
                        v.getDestino().getCodigoIATA().equals(codigoDestino))
                .collect(Collectors.toList());
    }
    
    @Override
    public Vuelo findByNumero(String numero){
        return dbVuelos.get(numero);
    }
    
    @Override
    public List<Vuelo> findAll(){
        return new ArrayList<>(dbVuelos.values());
    }
}
