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
    public float Frecuencia;
    public int Nucleos;
    public int Hilos;
    public String Arquitectura;
    public float potencia;
    public String Socket;
    public int cache;

    public CPU(int ID, String Marca, String Modelo, float Precio, boolean disponibilidad, float Frecuencia, int Nucleos, int Hilos, String Arquitectura, float potencia, String Socket, int cache) {
        super(ID, Marca, Modelo, Precio, disponibilidad);
        this.Frecuencia = Frecuencia;
        this.Nucleos = Nucleos;
        this.Hilos = Hilos;
        this.Arquitectura = Arquitectura;
        this.potencia = potencia;
        this.Socket = Socket;
        this.cache = cache;
    }

    public float getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(float Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public int getNucleos() {
        return Nucleos;
    }

    public void setNucleos(int Nucleos) {
        this.Nucleos = Nucleos;
    }

    public int getHilos() {
        return Hilos;
    }

    public void setHilos(int Hilos) {
        this.Hilos = Hilos;
    }

    public String getArquitectura() {
        return Arquitectura;
    }

    public void setArquitectura(String Arquitectura) {
        this.Arquitectura = Arquitectura;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String Socket) {
        this.Socket = Socket;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
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
