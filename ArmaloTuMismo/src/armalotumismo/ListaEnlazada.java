/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package armalotumismo;

import Elementos.CPU;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ListaEnlazada {

    Nodo head;
    int size;
    public ListaEnlazada() {
        head=null;
        size=0;
    }
    
    public Object getObject(int i){
    Nodo temp=head;
    
        for(int j=0;j<i;j++){
            temp=temp.getNext();
        }
         return temp.getValue();
        
    }
    
    public void addfirst(Object o){
        if(head==null)
           head= new Nodo(o);
        else{
            Nodo temp=head;
            Nodo newN=new Nodo(o);
            newN.link(temp);
            head=newN;
        }
        size++;
    }
    
    public void eliminar(int i){
    if(i==0) head=head.getNext();
    else{
        Nodo temp=head;
        for(int j=0; j<i-1;i++) temp=temp.getNext();
        temp.link(temp.getNext().getNext());
    }
    size--;
    }
    
    public void cut(int i){
    Nodo temp=head;
    
    if(i==0){
    temp.link(null);
    }else{
    
        for(int j=0;j<i-1;j++){
        temp=temp.getNext();
        }
        temp.link(null);
    
    }
    
    
    }
    
    public int size(){
    return size;
    }
    
    public boolean empty (){
    
        return(head==null);
    }
    
    public void addAfter(Object o, int i){
    Nodo temp=head;
        if(head==null)
                head=new Nodo(o);
        else{
            for(int j=0;j<i-1;j++){
                temp=temp.getNext();
            }
            Nodo newN= new Nodo(o);
            Nodo temp1=temp.getNext();
            temp.setNext(newN);
            newN.setNext(temp1);           
        
        }
    }      
}
