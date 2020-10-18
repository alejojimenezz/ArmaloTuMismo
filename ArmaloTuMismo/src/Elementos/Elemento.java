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
public abstract class Elemento {
    protected String ID;
    protected String Marca;
    protected String Modelo;
    protected String Precio;
    protected String cantidad;
    protected String Potencia;

    public Elemento(String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        this.ID = ID;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
        this.cantidad = cantidad;
        this.Potencia = Potencia;
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }



    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }

    @Override
    public String toString() {
        return "Elemento{" + "ID=" + ID + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Precio=" + Precio + ", cantidad=" + cantidad + ", Potencia=" + Potencia + '}';
    }

    
    
}
