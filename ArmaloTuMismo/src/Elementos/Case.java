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
public class Case extends Elemento{
    
   public String tamano;
   public String SlotStorage;
   public String SlotVideoCard;
   public String fans;

    public Case(String tamano, String SlotStorage, String SlotVideoCard, String fans, String ID, String Marca, String Modelo, String Precio, String disponibilidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, disponibilidad, Potencia);
        this.tamano = tamano;
        this.SlotStorage = SlotStorage;
        this.SlotVideoCard = SlotVideoCard;
        this.fans = fans;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getSlotStorage() {
        return SlotStorage;
    }

    public void setSlotStorage(String SlotStorage) {
        this.SlotStorage = SlotStorage;
    }

    public String getSlotVideoCard() {
        return SlotVideoCard;
    }

    public void setSlotVideoCard(String SlotVideoCard) {
        this.SlotVideoCard = SlotVideoCard;
    }

    public String getFans() {
        return fans;
    }

    public void setFans(String fans) {
        this.fans = fans;
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
