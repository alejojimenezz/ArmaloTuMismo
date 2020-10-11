/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Elementos;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class RAM extends Elemento{
    public String Gen;
    public float Vel;
    public int capacidad;
    public boolean disipacion;

    public RAM(int ID, String Marca, String Modelo, float Precio, boolean disponibilidad, String Gen, float Vel, int capacidad, boolean disipacion) {
        super(ID, Marca, Modelo, Precio, disponibilidad);
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

    public float getVel() {
        return Vel;
    }

    public void setVel(float Vel) {
        this.Vel = Vel;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isDisipacion() {
        return disipacion;
    }

    public void setDisipacion(boolean disipacion) {
        this.disipacion = disipacion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }


    
   
}
