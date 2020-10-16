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
    public String Vel;
    public String capacidad;
    public String disipacion;

    public RAM(String Gen, String Vel, String capacidad, String disipacion, String ID, String Marca, String Modelo, String Precio, String disponibilidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, disponibilidad, Potencia);
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    

    
   
}
