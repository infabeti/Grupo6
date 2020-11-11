package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaConfirmacion extends JFrame implements ActionListener{
   static VentanaConfirmacion conf;
   private JLabel confcartelera;
   private JButton no, si;
   private Color azulito;
  
    public VentanaConfirmacion(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        confcartelera=new JLabel("¿ESTÁS DE ACUERDO CON LA CARTELERA?");
        confcartelera.setBounds(60,180,900,60);
        confcartelera.setFont(confcartelera.getFont().deriveFont(40f));
        add(confcartelera);
        
        
        no=new JButton("NO");
        no.setBounds(630,350, 160, 45);
        no.setFont(no.getFont().deriveFont(15f));
        no.setVisible(true);
        add(no);
        no.addActionListener(this);
        no.setBackground(azulito);
        no.setForeground(Color.black);
        
        si=new JButton("SÍ");
        si.setBounds(200,350, 160, 45);
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
            SI.setTitle("Final");  
         }
          
         if(e.getSource()==no){
             
             VentanaBienvenida NO=new VentanaBienvenida();
             NO.setBounds(0, 0, 1000, 700);
             NO.setVisible(true);
             this.setVisible(false); 
             NO.setResizable(false);
             NO.setTitle("Bienvenida");  
          }
         
   }
    
      public static void main(String[] ar){
       
    	  VentanaConfirmacion fin=new VentanaConfirmacion();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana de confirmación");
           fin.setResizable(false);   
      }
        
}