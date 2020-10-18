/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import armalotumismo.LinkedList;
import Elementos.CPU;
import Elementos.CPUCooler;
import Elementos.Case;
import Elementos.Elemento;
import Elementos.Inventario;
import Elementos.MotherBoard;
import Elementos.OS;
import Elementos.PowerSupply;
import Elementos.RAM;
import Elementos.Storage;
import Elementos.VideoCard;
import armalotumismo.ShoppingCart;
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
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


/**
 *
 * @author Julian Medina
 */
public class Main {
    public static LinkedList lista = new LinkedList();
    
    //Modulos opciones del menu
    
            //Agregar componentes está incompleto COMPLETAR
 public static Elementos.Elemento AgregarComp(int i){
      Scanner sn = new Scanner(System.in);
      Elemento e = null;
      String ID;
      String marca;
      String modelo;
      String precio;
      String cantidad;
      String potencia;
     switch(i){
         case 1:
             System.out.print("Ingrese la frecuencia: ");
             String frec= sn.nextLine();
             System.out.print("Ingrese el numero de nucleos: ");
             String nucleos= sn.nextLine();
             System.out.print("Ingrese el numero de hilos: ");
             String hilos= sn.nextLine();
             System.out.print("Ingrese la arquitectura: ");
             String arqui= sn.nextLine();
             System.out.print("Ingrese el tipo de socket: ");
             String socket= sn.nextLine();
             System.out.print("Ingrese la cantidad de caché: ");
             String cache= sn.nextLine();
             System.out.print("Ingrese la ID del objeto: ");
             ID= sn.nextLine();
             System.out.print("Ingrese la Marca: ");
             marca= sn.nextLine();
             System.out.print("Ingrese el Modelo ");
             modelo= sn.nextLine();
             System.out.print("Ingrese el precio: ");
             precio= sn.nextLine();
             System.out.print("Ingrese la cantidad de unidades disponibles: ");
             cantidad= sn.nextLine();
             System.out.print("Ingrese la potencia: ");
             potencia= sn.nextLine();
             e =new CPU(frec, nucleos, hilos, arqui, socket, cache, ID, marca, modelo, precio, cantidad, potencia);
             return e;
         case 2:
             System.out.print("Ingrese el tipo de refrigeracion: ");
             String tipo= sn.nextLine();
             System.out.print("Ingrese la ID del objeto: ");
             ID= sn.nextLine();
             System.out.print("Ingrese la Marca: ");
             marca= sn.nextLine();
             System.out.print("Ingrese el Modelo ");
             modelo= sn.nextLine();
             System.out.print("Ingrese el precio: ");
             precio= sn.nextLine();
             System.out.print("Ingrese la cantidad de unidades disponibles: ");
             cantidad= sn.nextLine();
             System.out.print("Ingrese la potencia: ");
             potencia= sn.nextLine();
             e=new CPUCooler(tipo, ID, marca, modelo, precio, cantidad, potencia);
             return e;             
         case 3:
             System.out.print("Ingrese el maximo tamaño de motherboard: ");
             String tamano= sn.nextLine();
             System.out.print("Ingrese la cantidad de Slot para el almacenamiento: ");
             String SlotStorage= sn.nextLine();
             System.out.print("Ingrese la cantidad de slot para la tarjeta de video: ");
             String SlotVD= sn.nextLine();
             System.out.print("Ingrese la cantidad de ventiladores incorporados al case: ");
             String fans= sn.nextLine();
             System.out.print("Ingrese la ID del objeto: ");
             ID= sn.nextLine();
             System.out.print("Ingrese la Marca: ");
             marca= sn.nextLine();
             System.out.print("Ingrese el Modelo ");
             modelo= sn.nextLine();
             System.out.print("Ingrese el precio: ");
             precio= sn.nextLine();
             System.out.print("Ingrese la cantidad de unidades disponibles: ");
             cantidad= sn.nextLine();
             potencia= null;
             e=new Case(tamano, SlotStorage, SlotVD, fans, ID, marca, modelo, precio, cantidad, potencia);
             return e;
         case 4:
             System.out.print("Ingrese el socket del procesador: ");
             String socketM= sn.nextLine();
             System.out.print("Ingrese la cantidad de RAM soportada: ");
             String RAM= sn.nextLine();
             System.out.print("Ingrese el tamaño de la motherboard: (atx, mini atx, eatx, etc) ");
             String tamanoM= sn.nextLine();
             System.out.print("La motherboard es optima para hacer overclock (True o False) ");
             String overclock= sn.nextLine();
             System.out.print("La motherboard tiene soporte SLI o CrossFire (True o False)");
             String SLI= sn.nextLine();
             System.out.print("Ingrese la cantidad de puertos SATA/M.2: ");
             String puertos= sn.nextLine();
             System.out.print("Ingrese la ID del objeto: ");
             ID= sn.nextLine();
             System.out.print("Ingrese la Marca: ");
             marca= sn.nextLine();
             System.out.print("Ingrese el Modelo ");
             modelo= sn.nextLine();
             System.out.print("Ingrese el precio: ");
             precio= sn.nextLine();
             System.out.print("Ingrese la cantidad de unidades disponibles: ");
             cantidad= sn.nextLine();
             System.out.print("Ingrese la potencia: ");
             potencia= sn.nextLine();
             e= new MotherBoard(socketM, RAM, tamanoM, overclock, SLI, puertos, ID, marca, modelo, precio, cantidad, potencia);
             return e;
         case 5:
             return e;
         case 6:
             return e;
         case 7:
             return e;
         case 8:
             return e;
         case 9:
             return e;   
         default:
             System.out.println("Ingrese un numero valido");
             return e;
     }

     
 }
            //Eliminar COMPLETO
 public static void EliminarComp(Inventario in){
      Scanner sn = new Scanner(System.in);
      String Id;
      System.out.println("¿Que tipo de componente deseas eliminiar?\n\n1. CPU\n2. Cooler\n3. Case\n4. MotherBoard\n5. Sistema operativo"
                                    + "\n6. Fuente de poder\n7. RAM\n8. Almacenamiento\n9. Tarjeta de Video");
      int i=sn.nextInt();
      switch(i){
         case 1:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.CPU.remove(Id);
         break;
         
         case 2:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.cooler.remove(Id);
         break;
         case 3:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.Cases.remove(Id);
         break;
             
         case 4:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.MotherBoard.remove(Id);
         break;
             
         case 5:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.Os.remove(Id);
         break;
         
         case 6:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.Fuentes.remove(Id);
         break;
             
         case 7:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.RAM.remove(Id);
         break;
             
         case 8:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.Storage.remove(Id);
         break;
             
         case 9: 
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             in.VideoCard.remove(Id);
         break;
     
         default:
             System.out.println("Ingrese un valor valido");
     }
 }
            //Consultar COMPLETO
 public static void ConsultarComp(Inventario in){
      Scanner sn = new Scanner(System.in);
      String Id;
      System.out.println("¿Que tipo de componente deseas eliminiar?\n\n1. CPU\n2. Cooler\n3. Case\n4. MotherBoard\n5. Sistema operativo"
                                    + "\n6. Fuente de poder\n7. RAM\n8. Almacenamiento\n9. Tarjeta de Video");
      int i=sn.nextInt();
      switch(i){
         case 1:
             System.out.println("¿Qué ID deseas consultar? ");
             Id=sn.nextLine();
             System.out.println(in.CPU.get(Id).toString());
         break;
         
         case 2:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.cooler.get(Id).toString());
         break;
         case 3:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.Cases.get(Id).toString());
         break;
             
         case 4:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.MotherBoard.get(Id).toString());
         break;
             
         case 5:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.Os.get(Id).toString());
         break;
         
         case 6:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.Fuentes.get(Id).toString());
         break;
             
         case 7:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.RAM.get(Id).toString());
         break;
             
         case 8:
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.Storage.get(Id).toString());
         break;
             
         case 9: 
             System.out.println("¿Qué ID deseas eliminar? ");
             Id=sn.nextLine();
             System.out.println(in.VideoCard.get(Id).toString());
         break;
     
         default:
             System.out.println("Ingrese un valor valido");
     } 
 
 }
            //COMPLETAR CODIGO DE FILTROS
 public static void FiltrarComp(){
 
 
 }
            //HACER AGREGAR CARRITO
 public static void AgregarCarrito(){
 
 
 }
  
 
 
    
 public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    Inventario in =new Inventario();
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
   
   boolean valid=true;
   int opcion=0;
   ShoppingCart SC=new ShoppingCart();
   int key=0;
   ExportarCSVInventario(CPU1, CPUCooler1, Case1, MotherBoard1, OS1, PowerSupply1, RAM1, Storage1, VideoCard1);
       
   //Modulo del menu     
        while(valid){
            System.out.println("¿Qué desea hacer? Ingrese la opcion deseada: ");
            System.out.println("1. Agregar componente");
            System.out.println("2. Eliminar componente");
            System.out.println("3. Consultar componente");
            System.out.println("4. Filtrar componentes");
            System.out.println("5. Agregar al carrito");
            System.out.println("6. Salir");
            
            opcion=sn.nextInt();
            try{
            switch(opcion){
                case 1:
                        System.out.println("¿Que componente deseas agregar al inventario?");
                        int opcion1=0;
                        System.out.println("1. CPU\n2. Cooler\n3. Case\n4. MotherBoard\n5. Sistema operativo"
                                    + "\n6. Fuente de poder\n7. RAM\n8. Almacenamiento\n9. Tarjeta de Video");
                        opcion1=sn.nextInt();
                    Elemento e= AgregarComp(opcion1);
                    key=Integer.parseInt(e.getID());
                                 switch(opcion1){
                                                case 1:
                                                   CPU1.put(key, (CPU) e);
                                                   break;
                                                 case 2:
                                                   CPUCooler1.put(key, (CPUCooler) e);
                                                        break;
                                                    case 3:
                                                        Case1.put(key, (Case) e);
                                                        break;
                                                    case 4:
                                                        MotherBoard1.put(key, (MotherBoard) e);
                                                        break;
                                                    case 5:
                                                       OS1.put(key, (OS) e);
                                                        break;
                                                    case 6:
                                                       PowerSupply1.put(key, (PowerSupply) e);
                                                        break;
                                                    case 7:
                                                        RAM1.put(key, (RAM) e);
                                                        break;
                                                    case 8:
                                                        Storage1.put(key, (Storage) e);
                                                        break;
                                                    case 9:
                                                        VideoCard1.put(key, (VideoCard) e);
                                                        break;   
                                                    default:
                                                        System.out.println("Ingrese un numero valido");
                                                }
                    in.setCPU(CPU1); in.setCases(Case1);in.setCooler(CPUCooler1);in.setMotherBoard(MotherBoard1);in.setOs(OS1);in.setPower(PowerSupply1);
                    in.setRAM(RAM1);in.setStorage(Storage1);in.setVCard(VideoCard1);
                    
                    break;
                case 2:                    
                    EliminarComp(in);
                    CPU1=in.getCPU();Case1=in.getCase();CPUCooler1=in.getCooler();MotherBoard1=in.getMother();OS1=in.getOs();PowerSupply1=in.getPower();
                    RAM1=in.getRAM();Storage1=in.getStorage();VideoCard1=in.getVCard();
                    break;
                case 3:
                    ConsultarComp(in);
                    break;
                    
                case 4:
                    FiltrarComp();
                    break;
                    
                case 5:
                    AgregarCarrito();
                    break;
        
                case 6:
                    valid=false;
                    break;
                default:
                    System.out.println("Ingrese numeros validos");
            
            }}catch (InputMismatchException e){
                System.out.println("Debes ingresar solo numeros: ");
                sn.next();
            }
        }//FIN MENU

     Map<String, Elemento> Componentes = new HashMap<String, Elemento>();

        //datos prueba filtros
     /*Elemento CPU1 = new CPU("100", "8", "9","cuadrado", "8", "34", "14", "intel","2020", "15.000","90","124");
     Elemento CPU2 = new CPU("100", "8", "9","cuadrado", "8", "34", "14", "AMD","2020", "12.000","90","124");
     Elemento RAM1 = new RAM("100", "8", "9","cuadrado", "8", "34", "14", "hola","2020", "17.000");*/


     /*Componentes.put("C1", CPU1);
     Componentes.put("C2", CPU2);
     Componentes.put("R1", RAM1);*/

     Scanner sc = new Scanner(System.in);
     int count=0;
     char d = 0;

     System.out.println("Oprima el numero del componente del cual desea saber informacion:");
     System.out.println("1. CPU");
     System.out.println("2. RAM");
     String Busqueda = sc.next();

     switch (Busqueda){
         case "1":{
             d ='C';
             count = imprimir(Componentes, d);
             break;
         }
         case "2":{
             d ='R';
             count = imprimir(Componentes, d);
         }
     }

     System.out.println("Oprima el numero del tipo de filtro que desea aplicar:");
     System.out.println("1. Filtrar por referencia ");
     System.out.println("2. Filtrar por precio");
     String filt = sc.next();

     switch (filt)
     {
         case "1":
         {
             System.out.println("ingrese la referencia ");
             String ref = sc.next();
             resultado(ref, Componentes, d);
         }
         case "2":
         {
             int Mm=0;
             System.out.println("Oprima:");
             System.out.println("1. ordenar de mayor a menor ");
             System.out.println("2. ordenar de menor a mayor");
             String ord = sc.next();
             Mm = Integer.parseInt(ord);
             organizacion(Componentes, count, d, Mm);
             break;
         }
     }






 }

    public static int imprimir(Map<String, Elemento> Componentes, char tipCom){
        int count = 0;
        for (Entry<String, Elemento> CPU : Componentes.entrySet()){
            if(CPU.getKey().charAt(0) == tipCom) {
                System.out.println(CPU.getValue().getMarca());
                count++;
            }
        }
        return count;

    }

    public static void resultado(String Busqueda, Map<String, Elemento> Componentes, char tipCom){
        int tam1 = Busqueda.length();

        for (Entry<String, Elemento> CPU : Componentes.entrySet()){
            if(CPU.getKey().charAt(0) == tipCom) {
                String Bus2 = CPU.getValue().getMarca();

                if (tam1 <= Bus2.length()) {
                    int res=0;
                    for (int j = 0; j < tam1; j++) {

                        char a = Busqueda.charAt(j);
                        char b = Bus2.charAt(j);
                        int asc = (int) a;
                        int asc2 = (int) b;
                        int ran1 = 0;

                        if (asc2 <= 90 && asc2 >= 65){
                            ran1 = asc2 + 32;
                        }else if(asc2 <= 122 && asc2 >= 97){
                            ran1 = asc2 - 32;
                        }else if (asc2 == 209){
                            ran1 = 241;
                        }else if (asc2 == 241){
                            ran1 = 209;
                        }

                        if (asc == asc2 || asc == ran1) {
                            res++;
                        }
                    }
                    if (res == tam1){
                        lista.pushFront(CPU.getValue());
                    }
                }
            }


        }


        if (lista.size() == 0){
            System.out.println("NO SE ENCONTRARON RESULTADO");
        }else {
            System.out.print("NUMERO DE RESULTADOS ENCONTRADOS: " + lista.size());
            for (int b = 0; b < lista.size(); b++) {
                Elemento Filtro = (Elemento) lista.get(b);
                System.out.println("");
                System.out.print(Filtro.getMarca());

            }
        }

    }

    public static  void organizacion(Map<String, Elemento> Componentes, int count, char tipCom, int MaoMe){
        Elemento [] Compon = new Elemento[count];
        int co=0;
        for (Entry<String, Elemento> CPU : Componentes.entrySet()){
            if(CPU.getKey().charAt(0) == tipCom) {
                Compon [co] = CPU.getValue();
                co++;
            }
        }

        if (Compon.length == 0){
            System.out.println("NO SE ENCONTRARON RESULTADO");
        }else {
            if (MaoMe == 1){
                for (int i = 0; i < Compon.length; i++) {
                    for (int j = 0; j < Compon.length-i-1; j++) {
                        float pres = Float.parseFloat(Compon[j].getPrecio());
                        float prox = Float.parseFloat(Compon[j+1].getPrecio());
                        if( pres < prox){
                            Elemento tmp = Compon[j+1];
                            Compon[j+1] = Compon[j];
                            Compon[j] = tmp;
                        }
                    }
                }
            }else {
                for (int i = 0; i < Compon.length; i++) {
                    for (int j = 0; j < Compon.length-i-1; j++) {
                        float pres = Float.parseFloat(Compon[j].getPrecio());
                        float prox = Float.parseFloat(Compon[j+1].getPrecio());
                        if( pres > prox){
                            Elemento tmp = Compon[j+1];
                            Compon[j+1] = Compon[j];
                            Compon[j] = tmp;
                        }
                    }
                }
            }

            System.out.print("NUMERO DE RESULTADOS ENCONTRADOS: " + Compon.length);
            for (int b = 0; b < Compon.length; b++) {
                System.out.println("");
                System.out.print(Compon[b].getMarca() + " " + Compon[b].getPrecio());

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
    String SLI1 = leerInventario.get(11);
    String Puertos1 = leerInventario.get(12);
    
  MotherBoard1.put(Integer.parseInt(ID1), new MotherBoard(Socket1, RAMSupported1, Tamano1, Overclock1, SLI1, Puertos1, ID1, Marca1, Modelo1, Precio1, Cantidad1, Potencia1));// añade la informacion a la lista
    
 
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
    

