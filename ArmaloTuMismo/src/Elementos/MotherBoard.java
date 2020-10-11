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
public class MotherBoard extends Elemento{

    public String Socket;
    public int RAMSupported;
    public String Tamano;
    public Boolean Overclock;
    public String Chipset ;
    public boolean SLI;
    public int puertos;
    public float Potencia;

    public MotherBoard(int ID, String Marca, String Modelo, float Precio, boolean disponibilidad, String Socket, int RAMSupported, String Tamano, Boolean Overclock, String Chipset, boolean SLI, int puertos, float Potencia) {
        super(ID, Marca, Modelo, Precio, disponibilidad);
        this.Socket = Socket;
        this.RAMSupported = RAMSupported;
        this.Tamano = Tamano;
        this.Overclock = Overclock;
        this.Chipset = Chipset;
        this.SLI = SLI;
        this.puertos = puertos;
        this.Potencia=Potencia;
    }

    public float getPotencia() {
        return Potencia;
    }

    public void setPotencia(float Potencia) {
        this.Potencia = Potencia;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String Socket) {
        this.Socket = Socket;
    }

    public int getRAMSupported() {
        return RAMSupported;
    }

    public void setRAMSupported(int RAMSupported) {
        this.RAMSupported = RAMSupported;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String Tamano) {
        this.Tamano = Tamano;
    }

    public Boolean getOverclock() {
        return Overclock;
    }

    public void setOverclock(Boolean Overclock) {
        this.Overclock = Overclock;
    }

    public String getChipset() {
        return Chipset;
    }

    public void setChipset(String Chipset) {
        this.Chipset = Chipset;
    }

    public boolean isSLI() {
        return SLI;
    }

    public void setSLI(boolean SLI) {
        this.SLI = SLI;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
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
