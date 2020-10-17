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
   
   
   
   CPU c=new CPU("1800", "2", "4", "Zen", "Am4", "16", "1", "AMD", "dasd", "50000", "5", "15");
   
   
   CPU1.put(1, c);
   
   
  
   
   usuarios.add(new Usuario("1","julian","cedula9906","21","true"));
        ExportarCSVInventario(CPU1, CPUCooler1, Case1, MotherBoard1, OS1, PowerSupply1, RAM1, Storage1, VideoCard1);
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
File archivoUsuarios = new File(salidaArchivo);
archivoUsuarios.delete();
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
CsvReader leerUsuarios = new CsvReader("Inventario.csv");
leerUsuarios.readHeaders();


// Mientras haya lineas obtendremos los datos del archivo 
while(leerUsuarios.readRecord()){
 if(leerUsuarios.get(0)=="a"){
     String userid = leerUsuarios.get(0);
    String nombre = leerUsuarios.get(1);
    String password = leerUsuarios.get(2);
    String age = leerUsuarios.get(3);
    String modificar = leerUsuarios.get(4);

     
 }






}
    
 //   usuarios.add(new Usuario(userid,nombre,password,age,modificar)); // añade la informacion a la lista



}catch(FileNotFoundException e){
e.printStackTrace();
}catch(IOException e){
e.printStackTrace();
}

}
}
    

