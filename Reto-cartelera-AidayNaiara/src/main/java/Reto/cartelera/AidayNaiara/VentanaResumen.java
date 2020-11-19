package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;



public class VentanaResumen extends JFrame implements ActionListener{
   static VentanaResumen vtnres;
   private JLabel cartelerasabado,carteleradomingo, introducsalir, tituloresumen;
   private JButton si;
   private Color azulito;
   static public JTextField salirfield, tiempsab, tiempdom,s1parasab, s2parasab;
   
   public VentanaResumen(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        tituloresumen=new JLabel("RESUMÉN CARTELERAS");
        tituloresumen.setBounds(290,80,900,60);
        tituloresumen.setFont(tituloresumen.getFont().deriveFont(35f));
        add(tituloresumen);
        
        cartelerasabado=new JLabel("CARTELERA SÁBADO");
        cartelerasabado.setBounds(80,160,900,60);
        cartelerasabado.setFont(cartelerasabado.getFont().deriveFont(35f));
        add(cartelerasabado);
        
        
        cartelerasabado=new JLabel("CARTELERA SÁBADO");
        cartelerasabado.setBounds(80,160,900,60);
        cartelerasabado.setFont(cartelerasabado.getFont().deriveFont(35f));
        add(cartelerasabado);
        
        
        s1parasab = new JTextField();
        s1parasab.setBounds(80, 240, 360, 250);
        s1parasab.setEditable(false);
        add(s1parasab);
        
        String text = VentanaSabadoDomingo.s1parasab.getText();
        s1parasab.setText(text);
       		
        carteleradomingo=new JLabel("CARTELERA DOMINGO");
        carteleradomingo.setBounds(520,160,900,60);
        carteleradomingo.setFont(carteleradomingo.getFont().deriveFont(35f));
        add(carteleradomingo);
        
        
        introducsalir=new JLabel("Introduzca 0 si desea salir y 1 sí está de acuerdo con la cartelera:");
        introducsalir.setBounds(60,580,900,60);
        introducsalir.setFont(introducsalir.getFont().deriveFont(15f));
        add(introducsalir);
        
        salirfield = new JTextField();
        salirfield.setBounds(530, 595, 150, 30);
        salirfield.setEditable(true);
        add(salirfield);
        
        s2parasab = new JTextField();
        s2parasab.setBounds(530, 240, 360, 250);
        s2parasab.setEditable(false);
        add(s2parasab);  
        
        String text2 = VentanaSabadoDomingo.s2parasab.getText();
        s2parasab.setText(text2);
    
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
   
      
         /*SALIR*/
         if(salirfield.getText().equals("0") ) {
             
             VentanaBienvenida generos=new VentanaBienvenida();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Ventana Bienvenida");              
          }
         
         
         if(salirfield.getText().equals("1") ) {
             
             VentanaConfirmacion generos=new VentanaConfirmacion();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Ventana Confirmación");              
          }   
   }
    
      public static void main(String[] ar){
       
    	  VentanaResumen fin=new VentanaResumen();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana cartelera sábado");
           fin.setResizable(false);   
      }
        
}