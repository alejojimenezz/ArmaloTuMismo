/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armalotumismo;

import Elementos.Elemento;

/**
 *
 * @author Familia
 */
public class ShoppingCart {
    // Se usa lista doblemente enlazada
    
    ListaEnlazada componentes=new ListaEnlazada();
    
    public void additem(Elemento e){
    Nodo head=new Nodo(e);
    componentes.addfirst(head);
    }
    
    public void DeleteElement (Elemento e){
       for(int i=0; i<componentes.size;i++){
           if(e==componentes.getObject(i)){
           componentes.eliminar(i);
           }
        }
    }
    
    public void GetElementos (){
        for(int i=0; i<componentes.size;i++){
            System.out.println(componentes.getObject(i));
        }
    }
}
