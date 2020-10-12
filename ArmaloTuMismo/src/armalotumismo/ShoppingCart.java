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
    
    private Nodo Head;
    
    private class Nodo {
        public Elemento e;
        public Nodo next = null;

        public Nodo(Elemento e) {
            this.e = e;
        }

    }
    
    public void AddElement (Elemento e){
        Nodo nodo = new Nodo (e);
        nodo.next = Head;
        Head = nodo;
    }
    
    public void DeleteElement (Elemento e){
        
    }
    
    public void GetElementos (){
        
    }
}
