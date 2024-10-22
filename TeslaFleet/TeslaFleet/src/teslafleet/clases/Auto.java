/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet.clases;

import teslafleet.ReglasAlquiler;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo implements ReglasAlquiler{
    
    private int CantidadPasajeros;
    private boolean autopilot;


    public Auto(String IdVehiculo,int CantidadPasajeros, boolean autopilot, boolean RequiereMantenimiento) {
        super(IdVehiculo, RequiereMantenimiento);
        this.CantidadPasajeros = CantidadPasajeros;
        this.autopilot = autopilot;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public boolean isAutopilot() {
        return autopilot;
    }

    public void setAutopilot(boolean autopilot) {
        this.autopilot = autopilot;
    }
    
    

    @Override
    public double CaluclarCostoAlquiler(int horas) {
        double costo = horas*valor_hora_alquiler;
        if (autopilot){
            costo*=1.1;
        }
         return costo;
        
    }

    @Override
    public String MostrarDatos() {
        
        return "auto - codigo: "+Auto.super.getIdVehiculo()+", Pasajeros: "
                +CantidadPasajeros + ", Autopilot: " + autopilot;
        
    }
    
    
    
    
    
}
