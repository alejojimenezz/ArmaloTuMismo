/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Elementos;

public class RAM extends Elemento{
    private String Gen;
    private String Vel;
    private String capacidad;
    private String disipacion;

    public RAM(String Gen, String Vel, String capacidad, String disipacion, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
        this.Gen = Gen;
        this.Vel = Vel;
        this.capacidad = capacidad;
        this.disipacion = disipacion;
    }

    public String getGen() {
        return Gen;
    }

    public void setGen(String Gen) {
        this.Gen = Gen;
    }

    public String getVel() {
        return Vel;
    }

    public void setVel(String Vel) {
        this.Vel = Vel;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getDisipacion() {
        return disipacion;
    }

    public void setDisipacion(String disipacion) {
        this.disipacion = disipacion;
    }    
   
}
