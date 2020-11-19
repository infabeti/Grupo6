package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;



public class VentanaSabadoDomingo extends JFrame implements ActionListener{
   static VentanaSabadoDomingo vtnsab;
   public JLabel cartelerasabado,carteleradomingo,menusalir,
   menugenerodrama,menugenerocomedia, menugeneroterror, menugenerosf, introducegener,
   tiemporestsab, tiemporestdom, contfin;
   public JButton si;
   public Color azulito;
   static public JTextField campogeneros, tiempsab, tiempdom,s1parasab, s2parasab;
   static public Double tiemposabado, tiempodomingo;
   
   public VentanaSabadoDomingo(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        cartelerasabado=new JLabel("CARTELERA SÁBADO");
        cartelerasabado.setBounds(80,160,900,60);
        cartelerasabado.setFont(cartelerasabado.getFont().deriveFont(35f));
        add(cartelerasabado);
        
        
        s1parasab = new JTextField();
        s1parasab.setBounds(80, 240, 360, 250);
        s1parasab.setEditable(false);
        add(s1parasab);
        
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
        
        s2parasab = new JTextField();
        s2parasab.setBounds(530, 240, 360, 250);
        s2parasab.setEditable(false);
        add(s2parasab);
        
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
        
        contfin=new JLabel("5. Finalizar");
        contfin.setBounds(750,115,900,60);
        contfin.setFont(contfin.getFont().deriveFont(14f));
        add(contfin);
        
        /*TIEMPO RESTANTE DE CADA DÍA*/
        
        tiemporestsab=new JLabel("HORAS RESTANTES SÁBADO");
        tiemporestsab.setBounds(80,510,900,60);
        tiemporestsab.setFont(tiemporestsab.getFont().deriveFont(14f));
        add(tiemporestsab);
        
        tiempsab = new JTextField();
        tiempsab.setBounds(290, 525, 160, 30);
        tiempsab.setEditable(false);
        add(tiempsab);
        
        
        tiemposabado=8.00;
        tiempsab.setText(""+tiemposabado);        
        tiempsab.setText("" +VentanaCienciaFiccion.tiemponuevsab);//nuevo tiempo restando horas de peliculas
        
        /*------------domingo---------*/
        
        tiemporestdom=new JLabel("HORAS RESTANTES DOMINGO");
        tiemporestdom.setBounds(550,510,900,60);
        tiemporestdom.setFont(tiemporestdom.getFont().deriveFont(14f));
        add(tiemporestdom);
        

        tiempdom = new JTextField();
        tiempdom.setBounds(770, 525, 160, 30);
        tiempdom.setEditable(false);
        add(tiempdom);

        
        tiempodomingo=6.00;
        tiempdom.setText(""+tiempodomingo);
        tiempdom.setText("" +VentanaCienciaFiccion.tiemponuevdom);//nuevo tiempo restando horas de peliculas
        
        
        
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
             
             VentanaDrama.peli1parasab=""; 
             VentanaDrama.peli1paradom="";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";

             VentanaTerror.peli3parasab=""; 
             VentanaTerror.peli3paradom="";
             
             VentanaCienciaFiccion.peli4parasab=""; 
             VentanaCienciaFiccion.peli4paradom="";
             

             
             VentanaCienciaFiccion.codigosab.setEditable(true);
             VentanaCienciaFiccion.codigodom.setEditable(true);
             
             VentanaDrama.codigosab.setEditable(true);
             VentanaDrama.codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
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
         
         /*SALIR*/
         if(campogeneros.getText().equals("5") ) {
             
             VentanaResumen generos=new VentanaResumen();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Resumen");               
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