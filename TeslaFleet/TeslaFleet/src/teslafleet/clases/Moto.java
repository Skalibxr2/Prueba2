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
public class Moto extends Vehiculo implements ReglasAlquiler{
    
    private int CapacidadBateria;
    private boolean ModoEco;

    public Moto() {
    }

    public Moto(String IdVehiculo, int CapacidadBateria, boolean ModoEco, boolean RequiereMantenimiento) {
        super(IdVehiculo, RequiereMantenimiento);
        this.CapacidadBateria = CapacidadBateria;
        this.ModoEco = ModoEco;
    }

    public int getCapacidadBateria() {
        return CapacidadBateria;
    }

    public void setCapacidadBateria(int CapacidadBateria) {
        this.CapacidadBateria = CapacidadBateria;
    }

    public boolean isModoEco() {
        return ModoEco;
    }

    public void setModoEco(boolean ModoEco) {
        this.ModoEco = ModoEco;
    }

    @Override
    public String MostrarDatos() {
        return "moto ID: "+Moto.super.getIdVehiculo()+", Capacidad Bateria: "
                + CapacidadBateria+ "km, Modo Eco: "+ModoEco;
    }
    
    

 

    @Override
    public double CaluclarCostoAlquiler(int horas) {
        double costo = horas*valor_hora_alquiler;
        if(ModoEco && horas > horas/2){
            costo*=1.08;
        }
        return costo;
    }
    
}
