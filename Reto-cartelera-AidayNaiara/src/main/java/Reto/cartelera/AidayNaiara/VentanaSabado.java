package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaSabado extends JFrame implements ActionListener{
   static VentanaSabado vtnsab;
   private JLabel cartelerasabado,menusalir,menugenerodrama,menugenerocomedia, menugeneroterror, menugenerosf, introducegener;
   private JButton SI;
   private Color azulito;
   static public JTextField campogeneros;
   
   public VentanaSabado(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        cartelerasabado=new JLabel("CARTELERA SÁBADO");
        cartelerasabado.setBounds(50,40,900,60);
        cartelerasabado.setFont(cartelerasabado.getFont().deriveFont(40f));
        add(cartelerasabado);
        
        
        introducegener=new JLabel("Introduce el número de género deseado:");
        introducegener.setBounds(50,160,900,60);
        introducegener.setFont(introducegener.getFont().deriveFont(15f));
        add(introducegener);
        
        /*LISTA DE GÉNEROS Y SALIR*/
        menusalir=new JLabel("0.Salir");
        menusalir.setBounds(170,200,900,60);
        menusalir.setFont(menusalir.getFont().deriveFont(14f));
        add(menusalir);
        
        menugenerodrama=new JLabel("1.Drama");
        menugenerodrama.setBounds(170,220,900,60);
        menugenerodrama.setFont(menugenerodrama.getFont().deriveFont(14f));
        add(menugenerodrama);
        
        menugenerocomedia=new JLabel("2.Comedia");
        menugenerocomedia.setBounds(170,240,900,60);
        menugenerocomedia.setFont(menugenerocomedia.getFont().deriveFont(14f));
        add(menugenerocomedia);
        
        menugeneroterror=new JLabel("3.Terror");
        menugeneroterror.setBounds(170,260,900,60);
        menugeneroterror.setFont(menugeneroterror.getFont().deriveFont(14f));
        add(menugeneroterror);
        
        menugenerosf=new JLabel("4.Ciencia Ficción");
        menugenerosf.setBounds(170,280,900,60);
        menugenerosf.setFont(menugenerosf.getFont().deriveFont(14f));
        add(menugenerosf);
        
        campogeneros = new JTextField();
        campogeneros.setBounds(350, 175, 150, 30);
        campogeneros.setEditable(true);
        add(campogeneros);
        
        
        SI=new JButton("CONTINUAR");
        SI.setBounds(770, 590, 160, 45);
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
          
      
         
   }
    
      public static void main(String[] ar){
       
    	  VentanaSabado fin=new VentanaSabado();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana cartelera sábado");
           fin.setResizable(false);   
      }
        
}