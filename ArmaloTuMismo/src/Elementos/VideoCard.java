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
public class VideoCard extends Elemento{
    public String Arquitectura;
    public String TipoBus;
    public float Frecuencia;
    public int Memoria;
    public String TipoMem;
    public float largo;
    public float ancho;

    public VideoCard(int ID, String Marca, String Modelo, float Precio, boolean disponibilidad, String Arquitectura, String TipoBus, float Frecuencia, int Memoria, String TipoMem, float largo, float ancho) {
        super(ID, Marca, Modelo, Precio, disponibilidad);
        this.Arquitectura = Arquitectura;
        this.TipoBus = TipoBus;
        this.Frecuencia = Frecuencia;
        this.Memoria = Memoria;
        this.TipoMem = TipoMem;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String getArquitectura() {
        return Arquitectura;
    }

    public void setArquitectura(String Arquitectura) {
        this.Arquitectura = Arquitectura;
    }

    public String getTipoBus() {
        return TipoBus;
    }

    public void setTipoBus(String TipoBus) {
        this.TipoBus = TipoBus;
    }

    public float getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(float Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public String getTipoMem() {
        return TipoMem;
    }

    public void setTipoMem(String TipoMem) {
        this.TipoMem = TipoMem;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
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
