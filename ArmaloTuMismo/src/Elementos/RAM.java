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
