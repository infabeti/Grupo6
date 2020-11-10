package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaDrama extends JFrame implements ActionListener{
   static VentanaDrama vtndra;
   private JLabel generodrama;
   private JButton si;
   private Color azulito;
   
   public VentanaDrama(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        generodrama=new JLabel("GÉNERO - DRAMA");
        generodrama.setBounds(50,40,900,60);
        generodrama.setFont(generodrama.getFont().deriveFont(40f));
        add(generodrama);
        
        si=new JButton("CONTINUAR");
        si.setBounds(770, 590, 160, 45);
        si.setFont(si.getFont().deriveFont(15f));
        si.setVisible(true);
        add(si);
        si.addActionListener(this);
        si.setBackground(azulito);
        si.setForeground(Color.black);
        
  
    }
    
    public void actionPerformed(ActionEvent e){
   
        
         if(e.getSource()==si){
             
            VentanaFinal SI=new VentanaFinal();
            SI.setBounds(0, 0, 1000, 700);
            SI.setVisible(true);
            this.setVisible(false); 
            SI.setResizable(false);
            SI.setTitle("Género - Drama");  
         }
          
      
         
   }
    
      public static void main(String[] ar){
       
    	   VentanaDrama fin=new VentanaDrama();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Género - Drama");
           fin.setResizable(false);   
      }
        
}
