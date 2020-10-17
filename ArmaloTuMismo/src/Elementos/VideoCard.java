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
    private String Arquitectura;
    private String TipoBus;
    private String Frecuencia;
    private String Memoria;
    private String TipoMem;
    private String largo;
    private String ancho;

    public VideoCard(String Arquitectura, String TipoBus, String Frecuencia, String Memoria, String TipoMem, String largo, String ancho, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
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
