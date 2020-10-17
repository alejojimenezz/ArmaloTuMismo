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
    private String Tipo;
    private String capacidad;
    private String vel_write;
    private String vel_Read;
    private String BusType;

    public Storage(String Tipo, String capacidad, String vel_write, String vel_Read, String BusType, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
        this.Tipo = Tipo;
        this.capacidad = capacidad;
        this.vel_write = vel_write;
        this.vel_Read = vel_Read;
        this.BusType = BusType;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVel_write() {
        return vel_write;
    }

    public void setVel_write(String vel_write) {
        this.vel_write = vel_write;
    }

    public String getVel_Read() {
        return vel_Read;
    }

    public void setVel_Read(String vel_Read) {
        this.vel_Read = vel_Read;
    }

    public String getBusType() {
        return BusType;
    }

    public void setBusType(String BusType) {
        this.BusType = BusType;
    }

    public String getID() {
        return getID();
    }

    public void setID(String ID) {
        this.setID(ID);
    }

    public String getMarca() {
        return getMarca();
    }

    public void setMarca(String Marca) {
        this.setMarca(Marca);
    }

    public String getModelo() {
        return getModelo();
    }

    public void setModelo(String Modelo) {
        this.setModelo(Modelo);
    }

    public String getPrecio() {
        return getPrecio();
    }

    public void setPrecio(String Precio) {
        this.setPrecio(Precio);
    }

    public String getCantidad() {
        return getCantidad();
    }

    public void setCantidad(String cantidad) {
        this.setCantidad(cantidad);
    }

    public String getPotencia() {
        return getPotencia();
    }

    public void setPotencia(String Potencia) {
        this.setPotencia(Potencia);
    }

    

   
    
}
