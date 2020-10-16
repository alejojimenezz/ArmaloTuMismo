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
    public String ID;
    public String Marca;
    public String Modelo;
    public String Precio;
    public String cantidad;
    public String Potencia;

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

    
    
}
