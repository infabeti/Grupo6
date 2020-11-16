package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaDrama extends JFrame implements ActionListener{
   static VentanaDrama vtndra;
   private JLabel generodrama, sabado, domingo, peli1s, peli2s, peli3s, peli4s, peli1d, peli2d, peli3d, peli4d, 
   introducesab, introducedom;
   private JButton si;
   static public JTextField codigosab, codigodom;
   public static String peli1parasab;
   private Color azulito;
   
   
   public VentanaDrama(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        /* JLabels */
        
        generodrama=new JLabel("GÉNERO - DRAMA");
        generodrama.setBounds(287,40,900,60);
        generodrama.setFont(generodrama.getFont().deriveFont(40f));
        add(generodrama);
        
        sabado=new JLabel("PELÍCULAS SÁBADO");
        sabado.setBounds(100,140,900,60);
        sabado.setFont(sabado.getFont().deriveFont(30f));
        add(sabado);
        
        domingo=new JLabel("PELÍCULAS DOMINGO");
        domingo.setBounds(560,140,900,60);
        domingo.setFont(domingo.getFont().deriveFont(30f));
        add(domingo);
        
        /* JLabels de peliculas sabado */
        
        peli1s=new JLabel("1. Handia: 1h 56 min");
        peli1s.setBounds(100,220,900,60);
        peli1s.setFont(peli1s.getFont().deriveFont(19f));
        add(peli1s);
        
        peli2s=new JLabel("2. La lista de Schindler: 3h 17 min");
        peli2s.setBounds(100,280,900,60);
        peli2s.setFont(peli2s.getFont().deriveFont(19f));
        add(peli2s);
        
        peli3s=new JLabel("3. Cadena Perpetua: 2h 22 min");
        peli3s.setBounds(100,340,900,60);
        peli3s.setFont(peli3s.getFont().deriveFont(19f));
        add(peli3s);
        
        peli4s=new JLabel("4. Million Dollar Baby: 2h 13 min");
        peli4s.setBounds(100,400,900,60);
        peli4s.setFont(peli4s.getFont().deriveFont(19f));
        add(peli4s);
        
        /* JLabels de peliculas domingo */
        
        peli1d=new JLabel("1. Handia: 1h 56 min");
        peli1d.setBounds(559,220,900,60);
        peli1d.setFont(peli1d.getFont().deriveFont(19f));
        add(peli1d);
        
        peli2d=new JLabel("2. La lista de Schindler: 3h 17 min");
        peli2d.setBounds(559,280,900,60);
        peli2d.setFont(peli2d.getFont().deriveFont(19f));
        add(peli2d);
        
        peli3d=new JLabel("3. Cadena Perpetua: 2h 22 min");
        peli3d.setBounds(559,340,900,60);
        peli3d.setFont(peli3d.getFont().deriveFont(19f));
        add(peli3d);
        
        peli4d=new JLabel("4. Million Dollar Baby: 2h 13 min");
        peli4d.setBounds(559,400,900,60);
        peli4d.setFont(peli4d.getFont().deriveFont(19f));
        add(peli4d);
        
        /* JLabels de "introduce el codigo" */
        
        introducesab=new JLabel("Introduzca el código: ");
        introducesab.setBounds(590,505,900,60);
        introducesab.setFont(introducesab.getFont().deriveFont(15f));
        add(introducesab);
        
        introducedom=new JLabel("Introduzca el código: ");
        introducedom.setBounds(92,505,900,60);
        introducedom.setFont(introducedom.getFont().deriveFont(15f));
        add(introducedom);
        
        
        /* JTextFields para meter el código de la peli */
        
        codigosab = new JTextField();
        codigosab.setBounds(270, 520, 160, 32);
        codigosab.setEditable(true);
        add(codigosab);
        
        codigodom = new JTextField();
        codigodom.setBounds(775, 520, 160, 32);
        codigodom.setEditable(true);
        add(codigodom);
        
        /* Boton */
        
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
   
              
         /* 0 para salir a bienvenida SÁBADO */
          
         if(codigosab.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida");              
          }
         
         
         if(codigosab.getText().equals("1") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             VentanaSabadoDomingo.s1parasab.setText("1. Handia 1h 56min");
                   
          }
         
         if(codigosab.getText().equals("2") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             VentanaSabadoDomingo.s1parasab.setText("2. La lista de Schindler: 3h 17 min");
                   
          }
         
         if(codigosab.getText().equals("3") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             VentanaSabadoDomingo.s1parasab.setText("3. Cadena Perpetua: 2h 22 min");
                   
          }
         
  
         if(codigosab.getText().equals("4") ) {
      
        	 VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
        	 drama.setBounds(0, 0, 1000, 700);
        	 drama.setVisible(true);
        	 this.setVisible(false);
        	 drama.setResizable(false);
        	 drama.setTitle("Ventana Cartelera Sábado - Domingo");   
      
        	 VentanaSabadoDomingo.s1parasab.setText("4. Million Dollar Baby: 2h 13 min");
            
         }
         
         /* -------------------------------- para domingo --------------------------------------------------- */
         if(codigodom.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida");              
          }
         
         
         if(codigodom.getText().equals("1") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             VentanaSabadoDomingo.s2parasab.setText("1. Handia 1h 56min");
                   
          }
         
         if(codigodom.getText().equals("2") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             VentanaSabadoDomingo.s2parasab.setText("2. La lista de Schindler: 3h 17 min");
                   
          }
         
         if(codigodom.getText().equals("3") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             VentanaSabadoDomingo.s2parasab.setText("3. Cadena Perpetua: 2h 22 min");
                   
          }
         
  
         if(codigodom.getText().equals("4") ) {
      
        	 VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
        	 drama.setBounds(0, 0, 1000, 700);
        	 drama.setVisible(true);
        	 this.setVisible(false);
        	 drama.setResizable(false);
        	 drama.setTitle("Ventana Cartelera Sábado - Domingo");   
      
        	 VentanaSabadoDomingo.s2parasab.setText("4. Million Dollar Baby: 2h 13 min");
            
         }
         
         
         /* 0 para salir a bienvenida DOMINGO */
         
         if(codigodom.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida");              
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
