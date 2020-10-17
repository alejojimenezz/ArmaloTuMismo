/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import armalotumismo.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;


/**
 *
 * @author Julian Medina
 */
public class Main {

    public static void main(String[] args) {
   List<Usuario> usuarios = new ArrayList<Usuario>();
   usuarios.add(new Usuario("1","julian","cedula9906","21","true"));
 
        ExportarCSV(usuarios);
        ImportarCSV();
    }

public static void ExportarCSV(List<Usuario> usuarios){
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


public static void ImportarCSV(){
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
}
    

