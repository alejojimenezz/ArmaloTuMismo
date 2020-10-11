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
public class Storage extends Elemento {
    public String Tipo;
    public long capacidad;
    public int vel_write;
    public int vel_Read;
    public String BusType;
    public float Potencia;

    public Storage(int ID, String Marca, String Modelo, float Precio, boolean disponibilidad, String Tipo, long capacidad, int vel_write, int vel_Read, String BusType, float Potencia) {
        super(ID, Marca, Modelo, Precio, disponibilidad);
        this.Tipo = Tipo;
        this.capacidad = capacidad;
        this.vel_write = vel_write;
        this.vel_Read = vel_Read;
        this.BusType = BusType;
        this.Potencia=Potencia;
    }

    public float getPotencia() {
        return Potencia;
    }

    public void setPotencia(float Potencia) {
        this.Potencia = Potencia;
    }
    

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public long getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(long capacidad) {
        this.capacidad = capacidad;
    }

    public int getVel_write() {
        return vel_write;
    }

    public void setVel_write(int vel_write) {
        this.vel_write = vel_write;
    }

    public int getVel_Read() {
        return vel_Read;
    }

    public void setVel_Read(int vel_Read) {
        this.vel_Read = vel_Read;
    }

    public String getBusType() {
        return BusType;
    }

    public void setBusType(String BusType) {
        this.BusType = BusType;
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
