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
   public int SlotStorage;
   public int SlotVideoCard;
   public int fans;

    public Case(int ID, String Marca, String Modelo, float Precio, boolean disponibilidad, String tamano, int SlotStorage, int SlotVideoCard, int fans) {
        super(ID, Marca, Modelo, Precio, disponibilidad);
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

    public int getSlotStorage() {
        return SlotStorage;
    }

    public void setSlotStorage(int SlotStorage) {
        this.SlotStorage = SlotStorage;
    }

    public int getSlotVideoCard() {
        return SlotVideoCard;
    }

    public void setSlotVideoCard(int SlotVideoCard) {
        this.SlotVideoCard = SlotVideoCard;
    }

    public int getFans() {
        return fans;
    }

    public void setFans(int fans) {
        this.fans = fans;
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
