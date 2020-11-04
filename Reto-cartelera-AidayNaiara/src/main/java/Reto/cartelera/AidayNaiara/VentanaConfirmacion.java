package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaConfirmacion extends JFrame implements ActionListener{
    static VentanaConfirmacion conpago;
    private JLabel pagoconfirmado;
    private JButton NO, SI;
   private Color azulito;
  
    public VentanaConfirmacion(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        pagoconfirmado=new JLabel("¿ESTÁS DE ACUERDO CON LA CARTELERA?");
        pagoconfirmado.setBounds(60,180,900,60);
        pagoconfirmado.setFont(pagoconfirmado.getFont().deriveFont(40f));
        add(pagoconfirmado);
        
        
        NO=new JButton("NO");
        NO.setBounds(630,350, 160, 45);
        NO.setFont(NO.getFont().deriveFont(15f));
        NO.setVisible(true);
        add(NO);
        NO.addActionListener(this);
        NO.setBackground(azulito);
        NO.setForeground(Color.black);
        
        SI=new JButton("SÍ");
        SI.setBounds(200,350, 160, 45);
        SI.setFont(SI.getFont().deriveFont(15f));
        SI.setVisible(true);
        add(SI);
        SI.addActionListener(this);
        SI.setBackground(azulito);
        SI.setForeground(Color.black);
        
  
    }
    
    public void actionPerformed(ActionEvent e){
   
        
         if(e.getSource()==SI){
             
            VentanaFinal SI=new VentanaFinal();
            SI.setBounds(0, 0, 1000, 700);
            SI.setVisible(true);
            this.setVisible(false); 
            SI.setResizable(false);
            SI.setTitle("Final");  
         }
          
         if(e.getSource()==NO){
             
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