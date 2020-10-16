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
public class CPU extends Elemento{
    public String Frecuencia;
    public String Nucleos;
    public String Hilos;
    public String Arquitectura;
    public String Socket;
    public String cache;

    public CPU(String Frecuencia, String Nucleos, String Hilos, String Arquitectura, String Socket, String cache, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
        this.Frecuencia = Frecuencia;
        this.Nucleos = Nucleos;
        this.Hilos = Hilos;
        this.Arquitectura = Arquitectura;
        this.Socket = Socket;
        this.cache = cache;
    }


    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public String getNucleos() {
        return Nucleos;
    }

    public void setNucleos(String Nucleos) {
        this.Nucleos = Nucleos;
    }

    public String getHilos() {
        return Hilos;
    }

    public void setHilos(String Hilos) {
        this.Hilos = Hilos;
    }

    public String getArquitectura() {
        return Arquitectura;
    }

    public void setArquitectura(String Arquitectura) {
        this.Arquitectura = Arquitectura;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String Socket) {
        this.Socket = Socket;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
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
