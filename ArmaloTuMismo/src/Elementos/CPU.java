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
    private String Frecuencia;
    private String Nucleos;
    private String Hilos;
    private String Arquitectura;
    private String Socket;
    private String cache;

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




    
    
    
}
