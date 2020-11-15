/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/*
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
*/
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Familia
 */
public class Ingreso extends javax.swing.JFrame {

    //private final HashMap<String,JPanel> paneles;
    
    public Ingreso() {
        initComponents();
        this.setLocationRelativeTo(null);        
        
        /*paneles = new HashMap<>();
        paneles.put("TipoArmado", new TipoArmado(this));
        paneles.put("Consultar", new Consultar(this));
        paneles.put("Editar", new Editar(this));
        paneles.put("ElementoConsultado", new ElementoConsultado(this));*/
        
        //add(paneles.get("Principal"));
        /*setTitle("ArmaloTuMismo");
        setIconImage(getIconImage());
        setSize(840, 550);
        setLocationRelativeTo(null); //Center the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);*/
        setVisible(true);
    }
    
    public Image getIconImage() {
        Image setValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/IconATM.png"));
        return setValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Salir = new javax.swing.JButton();
        IngresarButton = new javax.swing.JButton();
        ConsultarButton = new javax.swing.JButton();
        EditarButton = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        TipoArmado = new javax.swing.JPanel();
        TituloTA = new javax.swing.JLabel();
        Seleccione = new javax.swing.JLabel();
        PersonalizadoButton = new javax.swing.JButton();
        GenericoButton = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();
        Editar = new javax.swing.JPanel();
        TituloE = new javax.swing.JLabel();
        Pregunta = new javax.swing.JLabel();
        AgregarButton = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        ModificarButton = new javax.swing.JButton();
        Volver1 = new javax.swing.JButton();
        Fondo2 = new javax.swing.JLabel();
        Consultar = new javax.swing.JPanel();
        ConsultarC = new javax.swing.JLabel();
        CosultarComboBox = new javax.swing.JComboBox<>();
        inReferencia = new javax.swing.JTextField();
        BuscarButton = new javax.swing.JButton();
        Volver2 = new javax.swing.JButton();
        Fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.CardLayout());

        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(0, 0, 102));
        Salir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Principal.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        IngresarButton.setBackground(new java.awt.Color(0, 0, 102));
        IngresarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        IngresarButton.setForeground(new java.awt.Color(255, 255, 255));
        IngresarButton.setText("Ingresar");
        IngresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarButtonActionPerformed(evt);
            }
        });
        Principal.add(IngresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        ConsultarButton.setBackground(new java.awt.Color(0, 0, 102));
        ConsultarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ConsultarButton.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarButton.setText("Consultar");
        ConsultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarButtonActionPerformed(evt);
            }
        });
        Principal.add(ConsultarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        EditarButton.setBackground(new java.awt.Color(0, 0, 102));
        EditarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        EditarButton.setForeground(new java.awt.Color(255, 255, 255));
        EditarButton.setText("Editar");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });
        Principal.add(EditarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        Titulo.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("ARMALO TU MISMO");
        Principal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wallpaper.png"))); // NOI18N
        Principal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Principal, "card2");

        TipoArmado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloTA.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        TituloTA.setForeground(new java.awt.Color(255, 255, 255));
        TituloTA.setText("ARMALO TU MISMO");
        TipoArmado.add(TituloTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        Seleccione.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Seleccione.setForeground(new java.awt.Color(255, 255, 255));
        Seleccione.setText("Seleccione metodo:");
        TipoArmado.add(Seleccione, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        PersonalizadoButton.setBackground(new java.awt.Color(0, 0, 102));
        PersonalizadoButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        PersonalizadoButton.setForeground(new java.awt.Color(255, 255, 255));
        PersonalizadoButton.setText("Personalizado");
        TipoArmado.add(PersonalizadoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        GenericoButton.setBackground(new java.awt.Color(0, 0, 102));
        GenericoButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        GenericoButton.setForeground(new java.awt.Color(255, 255, 255));
        GenericoButton.setText("Generico");
        TipoArmado.add(GenericoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        Volver.setBackground(new java.awt.Color(0, 0, 102));
        Volver.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        TipoArmado.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wallpaper.png"))); // NOI18N
        TipoArmado.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(TipoArmado, "card3");

        Editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloE.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        TituloE.setForeground(new java.awt.Color(255, 255, 255));
        TituloE.setText("Editar");
        Editar.add(TituloE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        Pregunta.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        Pregunta.setText("¿Qué deseas hacer?");
        Editar.add(Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        AgregarButton.setBackground(new java.awt.Color(0, 0, 102));
        AgregarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        AgregarButton.setForeground(new java.awt.Color(255, 255, 255));
        AgregarButton.setText("Agregar");
        Editar.add(AgregarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        EliminarButton.setBackground(new java.awt.Color(0, 0, 102));
        EliminarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        EliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        EliminarButton.setText("Eliminar");
        Editar.add(EliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        ModificarButton.setBackground(new java.awt.Color(0, 0, 102));
        ModificarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        ModificarButton.setForeground(new java.awt.Color(255, 255, 255));
        ModificarButton.setText("Modificar");
        Editar.add(ModificarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        Volver1.setBackground(new java.awt.Color(0, 0, 102));
        Volver1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Volver1.setForeground(new java.awt.Color(255, 255, 255));
        Volver1.setText("Volver");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });
        Editar.add(Volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wallpaper.png"))); // NOI18N
        Editar.add(Fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Editar, "card4");

        Consultar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ConsultarC.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        ConsultarC.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarC.setText("Consultar Componente");
        Consultar.add(ConsultarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        CosultarComboBox.setBackground(new java.awt.Color(0, 0, 102));
        CosultarComboBox.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        CosultarComboBox.setForeground(new java.awt.Color(255, 255, 255));
        CosultarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPU", "Tarjeta Madre", "Memoria RAM", "Tarjeta Grafica", "Almacenamiento", "Refrigeracion", "Fuente de Poder", "Chasis", "Sistema Operativo" }));
        Consultar.add(CosultarComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        inReferencia.setBackground(new java.awt.Color(0, 0, 0));
        inReferencia.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        inReferencia.setForeground(new java.awt.Color(255, 255, 255));
        inReferencia.setText("Ingresa referencia del componente");
        Consultar.add(inReferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        BuscarButton.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        BuscarButton.setForeground(new java.awt.Color(255, 255, 255));
        BuscarButton.setText("Buscar");
        Consultar.add(BuscarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        Volver2.setBackground(new java.awt.Color(0, 0, 102));
        Volver2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Volver2.setForeground(new java.awt.Color(255, 255, 255));
        Volver2.setText("Volver");
        Volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver2ActionPerformed(evt);
            }
        });
        Consultar.add(Volver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wallpaper.png"))); // NOI18N
        Consultar.add(Fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(Consultar, "card5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void IngresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarButtonActionPerformed
        TipoArmado.setVisible(true);
        Principal.setVisible(false);
    }//GEN-LAST:event_IngresarButtonActionPerformed

    private void ConsultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarButtonActionPerformed
        Consultar.setVisible(true);
        Principal.setVisible(false);
    }//GEN-LAST:event_ConsultarButtonActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Principal.setVisible(true);
        TipoArmado.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        Principal.setVisible(true);
        Editar.setVisible(false);
    }//GEN-LAST:event_Volver1ActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        Editar.setVisible(true);
        Principal.setVisible(false);
    }//GEN-LAST:event_EditarButtonActionPerformed

    private void Volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver2ActionPerformed
        Principal.setVisible(true);
        Consultar.setVisible(false);
    }//GEN-LAST:event_Volver2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton;
    private javax.swing.JButton BuscarButton;
    private javax.swing.JPanel Consultar;
    private javax.swing.JButton ConsultarButton;
    private javax.swing.JLabel ConsultarC;
    private javax.swing.JComboBox<String> CosultarComboBox;
    private javax.swing.JPanel Editar;
    private javax.swing.JButton EditarButton;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JLabel Fondo2;
    private javax.swing.JLabel Fondo3;
    private javax.swing.JButton GenericoButton;
    private javax.swing.JButton IngresarButton;
    private javax.swing.JButton ModificarButton;
    private javax.swing.JButton PersonalizadoButton;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Seleccione;
    private javax.swing.JPanel TipoArmado;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloE;
    private javax.swing.JLabel TituloTA;
    private javax.swing.JButton Volver;
    private javax.swing.JButton Volver1;
    private javax.swing.JButton Volver2;
    private javax.swing.JTextField inReferencia;
    // End of variables declaration//GEN-END:variables
}
