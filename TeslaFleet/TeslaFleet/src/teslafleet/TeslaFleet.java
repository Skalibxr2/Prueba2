/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import teslafleet.clases.Auto;
import teslafleet.clases.BicicletaElectrica;
import teslafleet.clases.Flota;
import teslafleet.clases.Moto;
import teslafleet.clases.Vehiculo;


/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Flota flota = new Flota();
        
        flota.AgregarVehiculo(new Auto("AUTO1", 5, false, true));
        flota.AgregarVehiculo(new Auto("AUTO2", 2, true, true));
        flota.AgregarVehiculo(new Auto("AUTO3", 3, false, false));
        
        flota.AgregarVehiculo(new Moto("MOTO1", 80, true, true));
        flota.AgregarVehiculo(new Moto("MOTO2", 30, true, false));
        
        flota.AgregarVehiculo(new BicicletaElectrica("BICI1", "disco", 20, true));
        flota.AgregarVehiculo(new BicicletaElectrica("BICI2", "pastilla", 50, false));
        
        System.out.println("Listado de Vehiculos");
        flota.ListarVehiculos();
        
        System.out.println("La cantidad total de vehiculos es: " + flota.ContarVehiculos());
        
        
        for (Vehiculo v : flota.getVehiculos()){
          
            System.out.println("El valor del vehiculo ID"+v.getIdVehiculo()+" es: "+ v.CaluclarCostoAlquiler(5));
        }
            
        
        
        
    }
    
}
