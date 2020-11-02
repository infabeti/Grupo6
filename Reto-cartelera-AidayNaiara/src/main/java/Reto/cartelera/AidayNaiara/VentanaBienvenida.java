package Reto.cartelera.AidayNaiara;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


import java.util.Timer;
import java.util.TimerTask;
    
public class VentanaBienvenida extends JFrame implements ActionListener{
    static VentanaBienvenida fin;
    private JLabel gracias;
    private JButton continuar;
   
    
    
    
  
    public VentanaBienvenida(){
        
      this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));

        setLayout(null); 
        Color azul = new Color(182, 205, 222);
        
       
                
        gracias=new JLabel("¡BIENVENIDO A CARTELERAS NAI&AI!");
        gracias.setBounds(120,240,900,60);
        gracias.setFont(gracias.getFont().deriveFont(40f));
        add(gracias);
        
      
        continuar=new JButton("CONTINUAR");
        continuar.setBounds(750,600, 190, 35);
        continuar.setVisible(true);
        add(continuar);
        continuar.addActionListener(this);
        continuar.setBackground(azul);
        continuar.setForeground(Color.black);
        
        
  
    }
    
 
         
      public static void main(String[] ar){
       
    	  VentanaBienvenida fin=new VentanaBienvenida();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana bienvenida");
           fin.setResizable(false);   
      }



	
        
}
