/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package armalotumismo;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Nodo {
    //Algoritmo para implementar doblemente enlazada
    Object value;
    Nodo next;
    public Nodo(Object value) {
        this.value = value;
        this.next=null;
    
    }
    
    public void link(Nodo n){
    next=n;
 
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    

}
