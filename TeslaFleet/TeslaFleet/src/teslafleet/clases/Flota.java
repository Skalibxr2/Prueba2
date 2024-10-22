/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Flota {
    
    private List<Vehiculo> vehiculos  = new ArrayList<>();

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    
    public void AgregarVehiculo(Vehiculo vehiculo){
        
        for(Vehiculo v : vehiculos){
            if (v.getIdVehiculo().equals(vehiculo.getIdVehiculo())){
                System.out.println("El vehiculo ID "+vehiculo.getIdVehiculo()
                        +" ya se encuentra registrado");
                return;
            }
            
        }
        vehiculos.add(vehiculo);
    }
    
    public void ListarVehiculos(){
        for (Vehiculo v : vehiculos){
            System.out.println(v.MostrarDatos());
        }
    }
    
    public int ContarVehiculos(){
        return vehiculos.size();
    }
}
