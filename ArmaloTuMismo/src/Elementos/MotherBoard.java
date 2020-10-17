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

    private String Socket;
    private String RAMSupported;
    private String Tamano;
    private Boolean Overclock;
    private String Chipset ;
    private String SLI;
    private String puertos;

    public MotherBoard(String Socket, String RAMSupported, String Tamano, Boolean Overclock, String Chipset, String SLI, String puertos, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
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
