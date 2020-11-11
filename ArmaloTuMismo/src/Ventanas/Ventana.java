/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    
    private final HashMap<String,JPanel> paneles;

    public Ventana() {
        paneles = new HashMap<>();
        paneles.put("Ingreso", new Ingreso(this));
        paneles.put("Principal", new TipoArmado(this));
        
        add(paneles.get("Ingreso"));
        setTitle("ARMALO TU MISMO");
        //setIconImage(loadImage("icon.jpg"));
        setSize(600, 450);
        setLocationRelativeTo(null); //Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
    public JPanel getPanel(String s) {
        return paneles.get(s);
    }
    
    //public static void main(String[] args) {
     //   Ventana atm = new Ventana();
   // }

    public void Cambiar_panel(String nuevo,String viejo){
        add(paneles.get(nuevo));
        paneles.get(viejo).setVisible(false);
        paneles.get(nuevo).setVisible(true);    
    }
    
    public HashMap<String, JPanel> getPaneles() {
        return paneles;
    }
    
}