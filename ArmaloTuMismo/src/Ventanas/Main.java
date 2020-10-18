/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Elementos.CPU;
import Elementos.CPUCooler;
import Elementos.Case;
import Elementos.Inventario;
import Elementos.MotherBoard;
import Elementos.OS;
import Elementos.PowerSupply;
import Elementos.RAM;
import Elementos.Storage;
import Elementos.VideoCard;
import armalotumismo.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/**
 *
 * @author Julian Medina
 */
public class Main {

    public static void main(String[] args) {
   List<Usuario> usuarios = new ArrayList<Usuario>();
   Map<Integer, CPU> CPU1=new HashMap<Integer, CPU>();
   Map<Integer, CPUCooler> CPUCooler1 = new HashMap<Integer, CPUCooler>();
   Map<Integer, Case> Case1= new HashMap<Integer, Case>();
   Map<Integer,MotherBoard> MotherBoard1 = new HashMap<Integer, MotherBoard>();
   Map<Integer, OS> OS1 =new HashMap<Integer, OS>();
   Map<Integer, PowerSupply> PowerSupply1 =new HashMap<Integer, PowerSupply>();
   Map<Integer, RAM> RAM1 =new HashMap<Integer, RAM>();
   Map<Integer, Storage> Storage1 =new HashMap<Integer, Storage>();
   Map<Integer, VideoCard> VideoCard1 =new HashMap<Integer, VideoCard>();
   Inventario in =new Inventario();
   int valid=0;

   ExportarCSVInventario(CPU1, CPUCooler1, Case1, MotherBoard1, OS1, PowerSupply1, RAM1, Storage1, VideoCard1);
        
        
        while(valid!=6){
            System.out.println("¿Qué desea hacer? Ingrese la opcion deseada: ");
            System.out.println("1. Agregar componente");
            System.out.println("2. Eliminar componente");
            System.out.println("3. Buscar componente");
            System.out.println("4. Filtrar componentes");
            System.out.println("5. Agregar al carrito");
            System.out.println("6. Salir");
            
            switch(valid){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                
                case 6:
                    valid=6;
                    break;
            
            }
            
   
        
        
        }
     
             }

public static void ExportarCSVUsuario(List<Usuario> usuarios){
String salidaArchivo = "Usuarios.csv"; // nombre del archivo
boolean existe = new File(salidaArchivo).exists();
// si existe un archivo llamado asi lo borra
if(existe){
File archivoUsuarios = new File(salidaArchivo);
archivoUsuarios.delete();
}

try {
 CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true),';');
//datos para identificar las columnas
salidaCSV.write("Userid");
salidaCSV.write("Nombre");
salidaCSV.write("Password");
salidaCSV.write("Age");
salidaCSV.write("Modificar");

salidaCSV.endRecord(); //Deja de escribir en el archivo

//recorremos la lista y lo insertamos en el archivo
for(Usuario user: usuarios){
    salidaCSV.write(user.getUserid());
    salidaCSV.write(user.getNombre());
    salidaCSV.write(user.getPassword());
    salidaCSV.write(user.getAge());
    salidaCSV.write(user.getModificar());
    
    salidaCSV.endRecord(); //Deja de escribir en el archivo
    
    
}

salidaCSV.close(); // cierra el archivo

}catch(IOException e){
e.printStackTrace();
}


}


public static void ImportarCSVUsuario(){
try {
List<Usuario> usuarios = new ArrayList<Usuario>(); // lista donde guardaremos los datos del archivo  leerUsuarios = new CsvReader("Usuarios.csv");
CsvReader leerUsuarios = new CsvReader("Usuarios.csv");
leerUsuarios.readHeaders();

// Mientras haya lineas obtendremos los datos del archivo 
while(leerUsuarios.readRecord()){

    String userid = leerUsuarios.get(0);
    String nombre = leerUsuarios.get(1);
    String password = leerUsuarios.get(2);
    String age = leerUsuarios.get(3);
    String modificar = leerUsuarios.get(4);

    usuarios.add(new Usuario(userid,nombre,password,age,modificar)); // añade la informacion a la lista
}



leerUsuarios.close(); // Cierra el archivo

// recorremos la lista para imprimirla en pantalla


}catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}

}



public static void ExportarCSVInventario(Map<Integer,CPU> CPU1
        ,Map<Integer,CPUCooler> CPUCooler1 ,Map<Integer,Case> Case1 , Map<Integer
        ,MotherBoard> MotherBoard1 ,Map<Integer,OS> OS1 ,
        Map<Integer,PowerSupply> PowerSupply1 , Map<Integer,RAM> RAM1 , 
        Map<Integer,Storage> Storage1 , Map<Integer, VideoCard> VideoCard1 ){

String salidaArchivo = "Inventario.csv"; // nombre del archivo
boolean existe = new File(salidaArchivo).exists();
// si existe un archivo llamado asi lo borra
if(existe){
File archivoInventario = new File(salidaArchivo);
archivoInventario.delete();
}
try {
 CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true),';');
//datos para identificar las columnas


//salidaCSV.endRecord(); //Deja de escribir en el archivo

//recorremos la lista y lo insertamos en el archivo
for(Entry<Integer,CPU> elemento : CPU1.entrySet() ){
    salidaCSV.write("a");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getFrecuencia());
    salidaCSV.write(elemento.getValue().getNucleos());
    salidaCSV.write(elemento.getValue().getHilos());
    salidaCSV.write(elemento.getValue().getArquitectura());
    salidaCSV.write(elemento.getValue().getSocket());
    salidaCSV.write(elemento.getValue().getCache());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 
}

for(Entry<Integer,CPUCooler> elemento : CPUCooler1.entrySet() ){
    salidaCSV.write("b");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getTipo());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 

}

for(Entry<Integer,Case> elemento : Case1.entrySet() ){
    salidaCSV.write("c");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getTamano());
    salidaCSV.write(elemento.getValue().getSlotStorage());
    salidaCSV.write(elemento.getValue().getSlotVideoCard());
    salidaCSV.write(elemento.getValue().getFans());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 

}
for(Entry<Integer,MotherBoard> elemento : MotherBoard1.entrySet() ){
    salidaCSV.write("d");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getSocket());
    salidaCSV.write(elemento.getValue().getRAMSupported());
    salidaCSV.write(elemento.getValue().getTamano());
    salidaCSV.write(elemento.getValue().getOverclock());
    salidaCSV.write(elemento.getValue().getChipset());
    salidaCSV.write(elemento.getValue().getSLI());
    salidaCSV.write(elemento.getValue().getPuertos());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 
    
    
}
for(Entry<Integer,OS> elemento : OS1.entrySet() ){
    salidaCSV.write("e");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 
}

for(Entry<Integer,PowerSupply> elemento : PowerSupply1.entrySet() ){
    salidaCSV.write("f");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getCapacidad());
    salidaCSV.write(elemento.getValue().getCertificacion());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 

}

for(Entry<Integer,RAM> elemento : RAM1.entrySet() ){
    salidaCSV.write("g");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getGen());
    salidaCSV.write(elemento.getValue().getVel());
    salidaCSV.write(elemento.getValue().getCapacidad());
    salidaCSV.write(elemento.getValue().getDisipacion());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 
}
for(Entry<Integer,Storage> elemento : Storage1.entrySet() ){
    salidaCSV.write("h");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getTipo());
    salidaCSV.write(elemento.getValue().getCapacidad());
    salidaCSV.write(elemento.getValue().getVel_write());
    salidaCSV.write(elemento.getValue().getVel_Read());
    salidaCSV.write(elemento.getValue().getBusType());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 
}
for(Entry<Integer,VideoCard> elemento : VideoCard1.entrySet() ){
    salidaCSV.write("i");
    salidaCSV.write(elemento.getValue().getID());
    salidaCSV.write(elemento.getValue().getMarca());
    salidaCSV.write(elemento.getValue().getModelo());
    salidaCSV.write(elemento.getValue().getPrecio());
    salidaCSV.write(elemento.getValue().getCantidad());
    salidaCSV.write(elemento.getValue().getPotencia());
    salidaCSV.write(elemento.getValue().getArquitectura());
    salidaCSV.write(elemento.getValue().getTipoBus());
    salidaCSV.write(elemento.getValue().getFrecuencia());
    salidaCSV.write(elemento.getValue().getMemoria());
    salidaCSV.write(elemento.getValue().getTipoMem());
    salidaCSV.write(elemento.getValue().getLargo());
    salidaCSV.write(elemento.getValue().getAncho());
    salidaCSV.endRecord(); //Deja de escribir en el archivo 
}



salidaCSV.close(); // cierra el archivo

}catch(IOException e){
e.printStackTrace();
}




}


public static void ImportarCSVInventario(){

try {
    Map<Integer,CPU> CPU1 = new HashMap<Integer,CPU>(); // lista donde guardaremos los datos del archivo  leerUsuarios = new CsvReader("Usuarios.csv");
    Map<Integer, CPUCooler> CPUCooler1 = new HashMap<Integer, CPUCooler>();
    Map<Integer, Case> Case1= new HashMap<Integer, Case>();
    Map<Integer,MotherBoard> MotherBoard1 = new HashMap<Integer, MotherBoard>();
    Map<Integer, OS> OS1 =new HashMap<Integer, OS>();
    Map<Integer, PowerSupply> PowerSupply1 =new HashMap<Integer, PowerSupply>();
    Map<Integer, RAM> RAM1 =new HashMap<Integer, RAM>();
    Map<Integer, Storage> Storage1 =new HashMap<Integer, Storage>();
    Map<Integer, VideoCard> VideoCard1 =new HashMap<Integer, VideoCard>();
CsvReader leerInventario = new CsvReader("Inventario.csv");
leerInventario.readHeaders();


// Mientras haya lineas obtendremos los datos del archivo 
while(leerInventario.readRecord()){
 if(leerInventario.get(0)=="a"){
     String ID1 = leerInventario.get(1);
    String Marca1 = leerInventario.get(2);
    String Modelo1 = leerInventario.get(3);
    String Precio1 = leerInventario.get(4);
    String Cantidad1 = leerInventario.get(5);
    String Potencia1 = leerInventario.get(6);
    String Frecuencia1 = leerInventario.get(7);
    String Nucleos1 = leerInventario.get(8);
    String Hilos1 = leerInventario.get(9);
    String Arquitectura1 = leerInventario.get(10);
    String Socket1 = leerInventario.get(11);
    String cache1 = leerInventario.get(12);
    
    CPU1.put(Integer.parseInt(ID1), new CPU(Frecuencia1, Nucleos1, Hilos1, Arquitectura1, Socket1, cache1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1))  ;// añade la informacion a la lista
    
 }
 else if(leerInventario.get(0)=="b"){
    String ID1 = leerInventario.get(1);
    String Marca1 = leerInventario.get(2);
    String Modelo1 = leerInventario.get(3);
    String Precio1 = leerInventario.get(4);
    String Cantidad1 = leerInventario.get(5);
    String Potencia1 = leerInventario.get(6);
    String Tipo1 = leerInventario.get(7);
    
    CPUCooler1.put(Integer.parseInt(ID1), new CPUCooler(Tipo1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
 
 }
 
 else if(leerInventario.get(0)=="c"){
    String ID1 = leerInventario.get(1);
    String Marca1 = leerInventario.get(2);
    String Modelo1 = leerInventario.get(3);
    String Precio1 = leerInventario.get(4);
    String Cantidad1 = leerInventario.get(5);
    String Potencia1 = leerInventario.get(6);
    String Tamano1 = leerInventario.get(7);
    String SlotStorage1 = leerInventario.get(8);
    String SlotVideoCard1 = leerInventario.get(9);
    String Fans1 = leerInventario.get(10);
    
    Case1.put(Integer.parseInt(ID1), new Case(Tamano1, SlotStorage1, SlotVideoCard1, Fans1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
   
 }
 else if(leerInventario.get(0)=="d"){
    String ID1 = leerInventario.get(1);
    String Marca1 = leerInventario.get(2);
    String Modelo1 = leerInventario.get(3);
    String Precio1 = leerInventario.get(4);
    String Cantidad1 = leerInventario.get(5);
    String Potencia1 = leerInventario.get(6);
    String Socket1 = leerInventario.get(7);
    String RAMSupported1 = leerInventario.get(8);
    String Tamano1 = leerInventario.get(9);
    String Overclock1 = leerInventario.get(10);
    String Chipset1 = leerInventario.get(11);
    String SLI1 = leerInventario.get(12);
    String Puertos1 = leerInventario.get(13);
    
  MotherBoard1.put(Integer.parseInt(ID1), new MotherBoard(Socket1, RAMSupported1, Tamano1, Overclock1, Chipset1, SLI1, Puertos1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
    
 
 }
 else if (leerInventario.get(0)=="e"){
    String ID1 = leerInventario.get(1);
    String Marca1 = leerInventario.get(2);
    String Modelo1 = leerInventario.get(3);
    String Precio1 = leerInventario.get(4);
    String Cantidad1 = leerInventario.get(5);
    String Potencia1 = leerInventario.get(6);
   
    OS1.put(Integer.parseInt(ID1), new OS(ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
   }
 
 else if (leerInventario.get(0)=="f"){
    String ID1 = leerInventario.get(1);
    String Marca1 = leerInventario.get(2);
    String Modelo1 = leerInventario.get(3);
    String Precio1 = leerInventario.get(4);
    String Cantidad1 = leerInventario.get(5);
    String Potencia1 = leerInventario.get(6);
    String Capacidad1 = leerInventario.get(7);
    String Certificacion1 = leerInventario.get(8);
    
    PowerSupply1.put(Integer.parseInt(ID1), new PowerSupply(Capacidad1, Certificacion1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
 }
 
 else if (leerInventario.get(0)=="g"){
    String ID1 = leerInventario.get(1);
    String Marca1 = leerInventario.get(2);
    String Modelo1 = leerInventario.get(3);
    String Precio1 = leerInventario.get(4);
    String Cantidad1 = leerInventario.get(5);
    String Potencia1 = leerInventario.get(6);
    String Gen1 = leerInventario.get(7);
    String Vel1 = leerInventario.get(8);
    String Capacidad1 = leerInventario.get(9);
    String Disipacion1 = leerInventario.get(10);
    
    RAM1.put(Integer.parseInt(ID1), new RAM(Gen1, Vel1, Capacidad1, Disipacion1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
 }
 
 else if (leerInventario.get(0)=="h"){
      String ID1 = leerInventario.get(1);
      String Marca1 = leerInventario.get(2);
      String Modelo1 = leerInventario.get(3);
      String Precio1 = leerInventario.get(4);
      String Cantidad1 = leerInventario.get(5);
      String Potencia1 = leerInventario.get(6);
      String Tipo1 = leerInventario.get(7);
      String Capacidad1 = leerInventario.get(8);
      String Vel_write1 = leerInventario.get(9);
      String Vel_Read1 = leerInventario.get(10);
      String BusType1 = leerInventario.get(11);
      
      Storage1.put(Integer.parseInt(ID1), new Storage(Tipo1, Capacidad1, Vel_write1, Vel_Read1, BusType1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
 
 }
 
 else if (leerInventario.get(0)=="i"){
     String ID1 = leerInventario.get(1);
      String Marca1 = leerInventario.get(2);
      String Modelo1 = leerInventario.get(3);
      String Precio1 = leerInventario.get(4);
      String Cantidad1 = leerInventario.get(5);
      String Potencia1 = leerInventario.get(6);
      String Arquitectura1 = leerInventario.get(7);
      String TipoBus1 = leerInventario.get(8);
      String Frecuencia1 = leerInventario.get(9);
      String Memoria1 = leerInventario.get(10);
      String TipoMem1 = leerInventario.get(11);
      String Largo1 = leerInventario.get(12);
      String Ancho1 = leerInventario.get(13);
      
      VideoCard1.put(Integer.parseInt(ID1), new VideoCard(Arquitectura1, TipoBus1, Frecuencia1, Memoria1, TipoMem1, Largo1, Ancho1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
 
 }




}
    



leerInventario.close();
}catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}

}
}
    

