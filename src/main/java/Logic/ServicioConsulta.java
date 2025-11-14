/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Model.Vuelo;
import Repository.IVueloRepository;
import java.util.List;

/**
 *
 * @author johan
 */
public class ServicioConsulta {
    private final IVueloRepository vueloRepo;
    private IConsultaStrategy estrategia;

    public ServicioConsulta(IVueloRepository vueloRepo) {
        this.vueloRepo = vueloRepo;
        this.estrategia = new ConsultaPorHorario();
    }
    
    public void setEstrategia(IConsultaStrategy estrategia){
        this.estrategia = estrategia;
    }
    
    public List<Vuelo> consultar(String origen, String destino){
        List<Vuelo> vuelos = vueloRepo.findByOrigenDestino(origen, destino);
        
        return estrategia.buscar(vuelos);
    }
    
    public Vuelo getInformacionVuelo(String numeroVuelo){
        return vueloRepo.findByNumero(numeroVuelo);
    }
}
