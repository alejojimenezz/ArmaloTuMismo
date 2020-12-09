/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;
import java.util.ArrayList;
import java.util.List;


public class MyHashMap {
       
    public int cantidad=0;
	class Container{
		Object key;
		Object value;
		public void insert(Object k, Object v){
			this.key=k;
			this.value=v;
		}
	}
	
	private Container c;
	private List<Container> recordList;
	
	public MyHashMap(){
		
		this.recordList=new ArrayList<Container>();
	}
	
	public void put(Object k, Object v){
		this.c=new Container();
		c.insert(k, v);
		//check for the same key before adding
		for(int i=0; i<recordList.size(); i++){
			Container c1=recordList.get(i);
			if(c1.key.equals(k)){
				//remove the existing object
				recordList.remove(i);
				break;
			}
		}
		recordList.add(c);
                cantidad++;
	}
	
	public Object get(Object k){
            Object vuelta= new Object();
		for(int i=0; i<this.recordList.size(); i++){
			Container con = recordList.get(i);
			//System.out.println("k.toString():"+k.toString()+"con.key.toString()"+con.key.toString());
			if (k.toString().equals(con.key.toString())) {
				
				vuelta= con.value;
                                return vuelta;
			}
                        else{
                        vuelta=null;
                        }
                        
			
		}
              return vuelta;  
	}

    public int getCantidad() {
        return cantidad;
    }

         

}