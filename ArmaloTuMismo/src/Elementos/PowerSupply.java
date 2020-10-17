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
public class PowerSupply extends Elemento{
private String Capacidad;
private String Certificacion;

    public PowerSupply(String Capacidad, String Certificacion, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
        this.Capacidad = Capacidad;
        this.Certificacion = Certificacion;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getCertificacion() {
        return Certificacion;
    }

    public void setCertificacion(String Certificacion) {
        this.Certificacion = Certificacion;
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
