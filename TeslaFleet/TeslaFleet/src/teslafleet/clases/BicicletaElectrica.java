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
public class BicicletaElectrica extends Vehiculo implements ReglasAlquiler{
    
    private String TipoFreno;
    private int CapacidadBateria;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String IdVehiculo, String TipoFreno, int CapacidadBateria, boolean RequiereMantenimiento) {
        super(IdVehiculo, RequiereMantenimiento);
        this.TipoFreno = TipoFreno;
        this.CapacidadBateria = CapacidadBateria;
    }

    public String getTipoFreno() {
        return TipoFreno;
    }

    public void setTipoFreno(String TipoFreno) {
        this.TipoFreno = TipoFreno;
    }

    public int getCapacidadBateria() {
        return CapacidadBateria;
    }

    public void setCapacidadBateria(int CapacidadBateria) {
        this.CapacidadBateria = CapacidadBateria;
    }
    
    

    @Override
    public String MostrarDatos() {
        return "bicicleta ID: "+ BicicletaElectrica.super.getIdVehiculo()+", Tipo de Frenos: "
                +TipoFreno+", Capacidad de Bateria: "+CapacidadBateria+" Kms.";
    }

    @Override
    public double CaluclarCostoAlquiler(int horas) {
       double costo = horas*valor_hora_alquiler;
       if(CapacidadBateria<20){
           costo*=0.95;
       }
       return costo;
    }
    
}
