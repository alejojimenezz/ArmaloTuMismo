/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Elementos;

import java.util.*;


public class Inventario {

    public HashMap<String, Elemento> componentes=new HashMap<String, Elemento>();

    public void agregar(String key, Elemento e){
        componentes.put(key, e);
    }
    
    public void eliminar(String key){
        componentes.remove(key);
    }
    
    public Elemento consultar(String key){
    if  (componentes.get(key)== null) System.out.println("No existe componente con esa referencia");
    return componentes.get(key);
    
    }
    
    
    
    
    
    
    
}
