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
public class PowerSupply extends Elemento{
private String Capacidad;
private String Certificacion;

    public PowerSupply(String Capacidad, String Certificacion, String ID, String Marca, String Modelo, String Precio, String cantidad, String Potencia) {
        super(ID, Marca, Modelo, Precio, cantidad, Potencia);
        this.Capacidad = Capacidad;
        this.Certificacion = Certificacion;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getCertificacion() {
        return Certificacion;
    }

    public void setCertificacion(String Certificacion) {
        this.Certificacion = Certificacion;
    }


}
