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
public abstract class Vehiculo implements ReglasAlquiler{
    
    private String IdVehiculo;
    private boolean RequiereMantenimiento;

    public Vehiculo() {
    }

    public Vehiculo(String IdVehiculo, boolean RequiereMantenimiento) {
        this.IdVehiculo = IdVehiculo;
        this.RequiereMantenimiento = RequiereMantenimiento;
    }

    public String getIdVehiculo() {
        return IdVehiculo;
    }

    public void setIdVehiculo(String IdVehiculo) {
        this.IdVehiculo = IdVehiculo;
    }

    public boolean isRequiereMantenimiento() {
        return RequiereMantenimiento;
    }

    public void setRequiereMantenimiento(boolean RequiereMantenimiento) {
        this.RequiereMantenimiento = RequiereMantenimiento;
    }
    
    public abstract String MostrarDatos();

    @Override
    public abstract double CaluclarCostoAlquiler(int horas);
    
   
    
    
    
    
}
