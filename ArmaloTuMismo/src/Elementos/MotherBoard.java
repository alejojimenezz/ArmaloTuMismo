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
    private String Overclock;
    private String SLI;
    private String puertos;

    public MotherBoard(String Socket, String RAMSupported, String Tamano, String Overclock, String SLI, String puertos, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
        this.Socket = Socket;
        this.RAMSupported = RAMSupported;
        this.Tamano = Tamano;
        this.Overclock = Overclock;
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

    public String getOverclock() {
        return Overclock;
    }

    public void setOverclock(String Overclock) {
        this.Overclock = Overclock;
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

    @Override
    public String toString() {
        return "MotherBoard{" + "Socket=" + Socket + ", RAMSupported=" + RAMSupported + ", Tamano=" + Tamano + ", Overclock=" + Overclock + ", SLI=" + SLI + ", puertos=" + puertos + '}';
    }

    
}
