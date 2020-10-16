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
    public String RAMSupported;
    public String Tamano;
    public Boolean Overclock;
    public String Chipset ;
    public String SLI;
    public String puertos;

    public MotherBoard(String Socket, String RAMSupported, String Tamano, Boolean Overclock, String Chipset, String SLI, String puertos, String ID, String Marca, String Modelo, String Precio, String disponibilidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, disponibilidad, Potencia);
        this.Socket = Socket;
        this.RAMSupported = RAMSupported;
        this.Tamano = Tamano;
        this.Overclock = Overclock;
        this.Chipset = Chipset;
        this.SLI = SLI;
        this.puertos = puertos;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String Socket) {
        this.Socket = Socket;
    }

    public String getRAMSupported() {
        return RAMSupported;
    }

    public void setRAMSupported(String RAMSupported) {
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

    public String getSLI() {
        return SLI;
    }

    public void setSLI(String SLI) {
        this.SLI = SLI;
    }

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
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
