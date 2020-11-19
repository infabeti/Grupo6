package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaDrama extends JFrame implements ActionListener{
   static VentanaDrama vtndra;
   public JLabel generodrama, sabado, domingo, peli1s, peli2s, peli3s, peli4s, peli1d, peli2d, peli3d, peli4d, 
   introducesab, introducedom, introducsalir;
   public JButton si;
   public static JTextField codigosab, codigodom, salirfield;
   public static String peli1parasab="",peli1paradom="";
   public static Integer codigotexto=0,codigotextodom=0 ;
   public Color azulito;
   
   
   public VentanaDrama(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        /* JLabels */
        
        generodrama=new JLabel("G�NERO - DRAMA");
        generodrama.setBounds(287,40,900,60);
        generodrama.setFont(generodrama.getFont().deriveFont(40f));
        add(generodrama);
        
        sabado=new JLabel("PEL�CULAS S�BADO");
        sabado.setBounds(100,140,900,60);
        sabado.setFont(sabado.getFont().deriveFont(30f));
        add(sabado);
        
        domingo=new JLabel("PEL�CULAS DOMINGO");
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
        
        introducesab=new JLabel("Introduzca el c�digo: ");
        introducesab.setBounds(590,505,900,60);
        introducesab.setFont(introducesab.getFont().deriveFont(15f));
        add(introducesab);
        
       
        
        introducedom=new JLabel("Introduzca el c�digo: ");
        introducedom.setBounds(92,505,900,60);
        introducedom.setFont(introducedom.getFont().deriveFont(15f));
        add(introducedom);
        
        
        /* JTextFields para meter el c�digo de la peli */
        
        codigosab = new JTextField();
        codigosab.setBounds(270, 520, 160, 32);
        codigosab.setEditable(true);
        add(codigosab);
        
        /*--------------------------------------------------------- */
        
        if (codigotexto== 1  || codigotexto== 2 || codigotexto== 3 || codigotexto== 4) {
        	
     	   codigosab.setEditable(false);
     	
        }
        
        codigodom = new JTextField();
        codigodom.setBounds(775, 520, 160, 32);
        codigodom.setEditable(true);
        add(codigodom);
        
        if (codigotextodom== 1  || codigotextodom== 2 || codigotextodom== 3 || codigotextodom== 4) {
        	
      	   codigodom.setEditable(false);
      	
         }
        
        /* Boton */
        
        si=new JButton("CONTINUAR");
        si.setBounds(770, 590, 160, 45);
        si.setFont(si.getFont().deriveFont(15f));
        si.setVisible(true);
        add(si);
        si.addActionListener(this);
        si.setBackground(azulito);
        si.setForeground(Color.black);
        
        introducsalir=new JLabel("Introduzca 0 si desea salir y 1 si desea volver a elegir g�nero :");
        introducsalir.setBounds(60,580,900,60);
        introducsalir.setFont(introducsalir.getFont().deriveFont(15f));
        add(introducsalir);
        
        salirfield = new JTextField();
        salirfield.setBounds(530, 595, 150, 30);
        salirfield.setEditable(true);
        add(salirfield);
        
 
  
    }
    
    public void actionPerformed(ActionEvent e){
   
              
         /* 0 para salir a bienvenida S�BADO */
          
         if(codigosab.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida"); 
             
             peli1parasab=""; 
             peli1paradom="";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";

             VentanaTerror.peli3parasab=""; 
             VentanaTerror.peli3paradom="";
             
             VentanaCienciaFiccion.peli4parasab=""; 
             VentanaCienciaFiccion.peli4paradom="";
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
             
             VentanaCienciaFiccion.codigosab.setEditable(true);
             VentanaCienciaFiccion.codigodom.setEditable(true);
          }
         
         
         if(codigosab.getText().equals("1") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera S�bado - Domingo");   
             
             peli1parasab = peli1parasab + "1. Handia 1h 56min \n";
                                      
             codigotexto = 1;
             
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom);  //todas las varaiables de cada ventana para que las coja.
             
          }
         
         if(codigosab.getText().equals("2") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera S�bado - Domingo");   
             
             peli1parasab = peli1parasab + "\n 2. La lista de Schindler: 3h 17 min";
             
             codigotexto = 2;
   
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom); 
                   
          }
         
         if(codigosab.getText().equals("3") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera S�bado - Domingo");   
             
             peli1parasab = peli1parasab + "3. Cadena Perpetua: 2h 22 min";

             codigotexto = 3;  
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom); 

          }
         
  
         if(codigosab.getText().equals("4") ) {
      
        	 VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
        	 drama.setBounds(0, 0, 1000, 700);
        	 drama.setVisible(true);
        	 this.setVisible(false);
        	 drama.setResizable(false);
        	 drama.setTitle("Ventana Cartelera S�bado - Domingo");   
      
        	 
        	 peli1parasab = peli1parasab + "4. Million Dollar Baby: 2h 13 min";
             
             codigotexto = 4; 
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom); 
 
            
         }
         
         /* -------------------------------- para domingo --------------------------------------------------- */
         if(codigodom.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida"); 
             
             peli1parasab=""; 
             peli1paradom="";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";

             VentanaTerror.peli3parasab=""; 
             VentanaTerror.peli3paradom="";
             
             VentanaCienciaFiccion.peli4parasab=""; 
             VentanaCienciaFiccion.peli4paradom="";
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
             
             VentanaCienciaFiccion.codigosab.setEditable(true);
             VentanaCienciaFiccion.codigodom.setEditable(true);
          }
         
         
         if(codigodom.getText().equals("1") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera S�bado - Domingo");   
             
             peli1paradom = peli1paradom + "1. Handia 1h 56min \n";           
                       
             codigotextodom = 1; 
             
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom); 
          }
         
         if(codigodom.getText().equals("2") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera S�bado - Domingo");   
             
             peli1paradom = peli1paradom + "2. La lista de Schindler: 3h 17 min \n";             
             
             codigotextodom = 2; 
             
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom); 
          }
         
         if(codigodom.getText().equals("3") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera S�bado - Domingo");   
             
             peli1paradom = peli1paradom + "3. Cadena Perpetua: 2h 22 min \n";            
             
             codigotextodom = 3; 
             
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom); 
          }
         
  
         if(codigodom.getText().equals("4") ) {
      
        	 VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
        	 drama.setBounds(0, 0, 1000, 700);
        	 drama.setVisible(true);
        	 this.setVisible(false);
        	 drama.setResizable(false);
        	 drama.setTitle("Ventana Cartelera S�bado - Domingo");   
      

             peli1paradom = peli1paradom + "4. Million Dollar Baby: 2h 13 min \n";
                          
             codigotextodom = 4; 
             VentanaSabadoDomingo.s1parasab.setText(peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab + VentanaCienciaFiccion.peli4parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom + VentanaCienciaFiccion.peli4paradom); 
             
            
            
         }
         
         
         /* 0 para salir a bienvenida DOMINGO */
         
         if(codigodom.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida");  
             
             peli1parasab=""; 
             peli1paradom="";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";

             VentanaTerror.peli3parasab=""; 
             VentanaTerror.peli3paradom="";
             
             VentanaCienciaFiccion.peli4parasab=""; 
             VentanaCienciaFiccion.peli4paradom="";
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
             
             VentanaCienciaFiccion.codigosab.setEditable(true);
             VentanaCienciaFiccion.codigodom.setEditable(true);
          }
      
         if(salirfield.getText().equals("0") ) {
             
             VentanaBienvenida generos=new VentanaBienvenida();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Ventana Bienvenida"); 
             
             peli1parasab=""; 
             peli1paradom="";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";

             VentanaTerror.peli3parasab=""; 
             VentanaTerror.peli3paradom="";
             
             VentanaCienciaFiccion.peli4parasab=""; 
             VentanaCienciaFiccion.peli4paradom="";
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
             
             VentanaCienciaFiccion.codigosab.setEditable(true);
             VentanaCienciaFiccion.codigodom.setEditable(true);
          }
         
         
         if(salirfield.getText().equals("1") ) {
             
             VentanaSabadoDomingo generos=new VentanaSabadoDomingo();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Ventana Sabado Domingo");              
          }    
   }
    
      public static void main(String[] ar){
       
    	   VentanaDrama fin=new VentanaDrama();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("G�nero - Drama");
           fin.setResizable(false);   
      }
        
}
