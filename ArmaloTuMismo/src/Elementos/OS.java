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
public class OS extends Elemento{

    public OS(int ID, String Marca, String Modelo, float Precio, boolean disponibilidad) {
        super(ID, Marca, Modelo, Precio, disponibilidad);
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getMarca() {
        return Marca;
    }

    @Override
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String getModelo() {
        return Modelo;
    }

    @Override
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public float getPrecio() {
        return Precio;
    }

    @Override
    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    @Override
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    @Override
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
