package Reto.cartelera.AidayNaiara;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaFinal extends JFrame implements ActionListener {
	
    static VentanaFinal fin;
    private JLabel gracias;
    
   
  
    public VentanaFinal(){
        
      this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));

        setLayout(null); 
       
        
       
                
        gracias=new JLabel("¡GRACIAS POR USAR NUESTRA CARTELERA!");
        gracias.setBounds(51,240,900,60);
        gracias.setFont(gracias.getFont().deriveFont(40f));
        add(gracias);
        
      
       
  
    }
    
    
    
      public static void main(String[] ar){
       
    	  VentanaFinal fin=new VentanaFinal();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana final");
           fin.setResizable(false);   
      }
        
}

