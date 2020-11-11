package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaSabadoDomingo extends JFrame implements ActionListener{
   static VentanaSabadoDomingo vtnsab;
   private JLabel cartelerasabado,carteleradomingo,menusalir,
   menugenerodrama,menugenerocomedia, menugeneroterror, menugenerosf, introducegener,
   tiemporestsab, tiemporestdom;
   private JButton si;
   private Color azulito;
   static public JTextField campogeneros, tiempsab, tiempdom;
   
   public VentanaSabadoDomingo(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        cartelerasabado=new JLabel("CARTELERA SÁBADO");
        cartelerasabado.setBounds(80,160,900,60);
        cartelerasabado.setFont(cartelerasabado.getFont().deriveFont(35f));
        add(cartelerasabado);
        
        
        carteleradomingo=new JLabel("CARTELERA DOMINGO");
        carteleradomingo.setBounds(520,160,900,60);
        carteleradomingo.setFont(carteleradomingo.getFont().deriveFont(35f));
        add(carteleradomingo);
        
        
        introducegener=new JLabel("Introduce el número de género deseado:");
        introducegener.setBounds(87,65,900,60);
        introducegener.setFont(introducegener.getFont().deriveFont(15f));
        add(introducegener);
        
        campogeneros = new JTextField();
        campogeneros.setBounds(390, 80, 150, 30);
        campogeneros.setEditable(true);
        add(campogeneros);
        
       
        /*LISTA DE GÉNEROS Y SALIR*/
        menusalir=new JLabel("0.Salir");
        menusalir.setBounds(650,65,900,60);
        menusalir.setFont(menusalir.getFont().deriveFont(14f));
        add(menusalir);
        
        menugenerodrama=new JLabel("1.Drama");
        menugenerodrama.setBounds(750,35,900,60);
        menugenerodrama.setFont(menugenerodrama.getFont().deriveFont(14f));
        add(menugenerodrama);
        
        menugenerocomedia=new JLabel("2.Comedia");
        menugenerocomedia.setBounds(750,55,900,60);
        menugenerocomedia.setFont(menugenerocomedia.getFont().deriveFont(14f));
        add(menugenerocomedia);
        
        menugeneroterror=new JLabel("3.Terror");
        menugeneroterror.setBounds(750,75,900,60);
        menugeneroterror.setFont(menugeneroterror.getFont().deriveFont(14f));
        add(menugeneroterror);
        
        menugenerosf=new JLabel("4.Ciencia Ficción");
        menugenerosf.setBounds(750,95,900,60);
        menugenerosf.setFont(menugenerosf.getFont().deriveFont(14f));
        add(menugenerosf);
        
        /*TIEMPO RESTANTE DE CADA DÍA*/
        
        tiemporestsab=new JLabel("TIEMPO RESTANTE SÁBADO");
        tiemporestsab.setBounds(80,510,900,60);
        tiemporestsab.setFont(tiemporestsab.getFont().deriveFont(14f));
        add(tiemporestsab);
        
        tiempsab = new JTextField("8h");
        tiempsab.setBounds(290, 525, 160, 30);
        tiempsab.setEditable(false);
        add(tiempsab);
        
        
        tiemporestdom=new JLabel("TIEMPO RESTANTE DOMINGO");
        tiemporestdom.setBounds(550,510,900,60);
        tiemporestdom.setFont(tiemporestdom.getFont().deriveFont(14f));
        add(tiemporestdom);
        
        tiempdom = new JTextField("6h");
        tiempdom.setBounds(770, 525, 160, 30);
        tiempdom.setEditable(false);
        add(tiempdom);
        
        
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
   
      
         /*LISTA DE GÉNEROS*/
         if(campogeneros.getText().equals("0") ) {
             
             VentanaBienvenida generos=new VentanaBienvenida();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Ventana Bienvenida");              
          }
         
         /*1.drama*/
         if(campogeneros.getText().equals("1") ) {
             
        	 VentanaDrama generos=new VentanaDrama();
        	 generos.setBounds(0, 0, 1000, 700);
        	 generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Drama");               
          }
         
         /*2.comedia*/
         if(campogeneros.getText().equals("2") ) {
             
             VentanaComedia generos=new VentanaComedia();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Comedia");              
          }
         
         /*3.terror*/
         if(campogeneros.getText().equals("3") ) {
             
             VentanaTerror generos=new VentanaTerror();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Terror");               
          }
         
         /*4.ciencia ficcion*/
         if(campogeneros.getText().equals("4") ) {
             
             VentanaCienciaFiccion generos=new VentanaCienciaFiccion();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Ciencia Ficción");               
          }
                   
   }
    
      public static void main(String[] ar){
       
    	  VentanaSabadoDomingo fin=new VentanaSabadoDomingo();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana cartelera sábado");
           fin.setResizable(false);   
      }
        
}