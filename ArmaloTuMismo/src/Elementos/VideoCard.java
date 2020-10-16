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
    public String Frecuencia;
    public String Memoria;
    public String TipoMem;
    public String largo;
    public String ancho;

    public VideoCard(String Arquitectura, String TipoBus, String Frecuencia, String Memoria, String TipoMem, String largo, String ancho, String ID, String Marca, String Modelo, String Precio, String disponibilidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, disponibilidad, Potencia);
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

    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public String getMemoria() {
        return Memoria;
    }

    public void setMemoria(String Memoria) {
        this.Memoria = Memoria;
    }

    public String getTipoMem() {
        return TipoMem;
    }

    public void setTipoMem(String TipoMem) {
        this.TipoMem = TipoMem;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
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

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getPotencia() {
        return Potencia;
    }

    public void setPotencia(String Potencia) {
        this.Potencia = Potencia;
    }


   
}
