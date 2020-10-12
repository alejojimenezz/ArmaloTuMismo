/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armalotumismo;

import Elementos.Elemento;
import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class Pedido {
    
    private String Direccion;
    private ArrayList<Elemento> Elementos;
    private float TotalPrecio;

    public Pedido(String Direccion, ArrayList<Elemento> Elementos, float TotalPrecio) {
        this.Direccion = Direccion;
        this.Elementos = Elementos;
        this.TotalPrecio = TotalPrecio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Elemento> getElementos() {
        return Elementos;
    }

    public void setElementos(ArrayList<Elemento> Elementos) {
        this.Elementos = Elementos;
    }

    public float getTotalPrecio() {
        return TotalPrecio;
    }

    public void setTotalPrecio(float TotalPrecio) {
        this.TotalPrecio = TotalPrecio;
    }
    
}
