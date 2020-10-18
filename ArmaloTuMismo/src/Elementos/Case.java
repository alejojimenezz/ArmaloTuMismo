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
    
   private String tamano;
   private String SlotStorage;
   private String SlotVideoCard;
   private String fans;

    public Case(String tamano, String SlotStorage, String SlotVideoCard, String fans, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
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

    @Override
    public String toString() {
        return "Case{" + "tamano=" + tamano + ", SlotStorage=" + SlotStorage + ", SlotVideoCard=" + SlotVideoCard + ", fans=" + fans + '}';
    }
    
    
    
}
