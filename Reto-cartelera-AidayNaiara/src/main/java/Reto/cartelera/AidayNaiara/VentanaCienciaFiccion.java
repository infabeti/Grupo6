package Reto.cartelera.AidayNaiara;


import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class VentanaCienciaFiccion extends JFrame implements ActionListener{
   static VentanaCienciaFiccion vtnfic;
   private JLabel generodrama, sabado, domingo, peli1s, peli2s, peli3s, peli4s, peli1d, peli2d, peli3d, peli4d, 
   introducesab, introducedom, introducsalir;
   public JButton si;
   static public JTextField codigosab, codigodom, salirfield;
   public static String peli4parasab="",peli4paradom="";
   public static Integer codigotexto=0,codigotextodom=0 ;
   public static Double tiemponuevsab, tiemponuevdom;
   public Color azulito;
   
   
   public VentanaCienciaFiccion(){
        
        this.getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        setLayout(null);
        Color azulito = new Color(164, 190, 214);
        
        /* JLabels */
        
        generodrama=new JLabel("GÉNERO - CIENCIA FICCIÓN");
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
        
        peli1s=new JLabel("1. 2001: Odisea en el espacio 2 h 22 min");
        peli1s.setBounds(100,220,900,60);
        peli1s.setFont(peli1s.getFont().deriveFont(19f));
        add(peli1s);
        
        peli2s=new JLabel("2. La novia de Frankenstein: 1 h 15 min");
        peli2s.setBounds(100,280,900,60);
        peli2s.setFont(peli2s.getFont().deriveFont(19f));
        add(peli2s);
        
        peli3s=new JLabel("3. El planeta de los simios: 1 h 55 min");
        peli3s.setBounds(100,340,900,60);
        peli3s.setFont(peli3s.getFont().deriveFont(19f));
        add(peli3s);
        
        peli4s=new JLabel("4. Alien, el octavo pasajero: 1 h 57 min");
        peli4s.setBounds(100,400,900,60);
        peli4s.setFont(peli4s.getFont().deriveFont(19f));
        add(peli4s);
        
        /* JLabels de peliculas domingo */
        
        peli1d=new JLabel("1.2001: Odisea en el espacio 2 h 22 min");
        peli1d.setBounds(559,220,900,60);
        peli1d.setFont(peli1d.getFont().deriveFont(19f));
        add(peli1d);
        
        peli2d=new JLabel("2. La novia de Frankenstein: 1 h 15 min");
        peli2d.setBounds(559,280,900,60);
        peli2d.setFont(peli2d.getFont().deriveFont(19f));
        add(peli2d);
        
        peli3d=new JLabel("3. El planeta de los simios: 1 h 55 min");
        peli3d.setBounds(559,340,900,60);
        peli3d.setFont(peli3d.getFont().deriveFont(19f));
        add(peli3d);
        
        peli4d=new JLabel("4. Alien, el octavo pasajero: 1 h 57 min");
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
        
        introducsalir=new JLabel("Introduzca 0 si desea salir y 1 si desea volver a elegir género :");
        introducsalir.setBounds(60,580,900,60);
        introducsalir.setFont(introducsalir.getFont().deriveFont(15f));
        add(introducsalir);
        
        salirfield = new JTextField();
        salirfield.setBounds(530, 595, 150, 30);
        salirfield.setEditable(true);
        add(salirfield);
        
 
  
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
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             peli4parasab="";
             peli4paradom="";
             
             VentanaTerror.peli3parasab = "";
             VentanaTerror.peli3paradom = "";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";
             
             VentanaDrama.peli1parasab=""; 
             VentanaDrama.peli1paradom="";

             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaDrama.codigosab.setEditable(true);
             VentanaDrama.codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
          }
         
         
         if(codigosab.getText().equals("1") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             peli4parasab = peli4parasab + "1. 2001: Odisea en el espacio 2 h 22 min \n";

                          
             codigotexto = 1;
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
             
             tiemponuevsab= VentanaTerror.tiemponuevsab= VentanaTerror.tiemponuevsab - 2.22;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom);
          }
         
         if(codigosab.getText().equals("2") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             peli4parasab = peli4parasab + "\n 2. La novia de Frankenstein: 1 h 15 min";
             
             codigotexto = 2;
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
       
             tiemponuevsab= VentanaTerror.tiemponuevsab= VentanaTerror.tiemponuevsab - 1.15;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom);
          }
         
         if(codigosab.getText().equals("3") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             peli4parasab = peli4parasab + "3. El planeta de los simios: 1 h 55 min";
             
             codigotexto = 3;  
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
         
             tiemponuevsab= VentanaTerror.tiemponuevsab= VentanaTerror.tiemponuevsab - 1.55;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom);
         }
         
  
         if(codigosab.getText().equals("4") ) {
      
        	 VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
        	 drama.setBounds(0, 0, 1000, 700);
        	 drama.setVisible(true);
        	 this.setVisible(false);
        	 drama.setResizable(false);
        	 drama.setTitle("Ventana Cartelera Sábado - Domingo");   
      
        	 
        	 peli4parasab = peli4parasab + "4. Alien, el octavo pasajero: 1 h 57 min";
      
             
             codigotexto = 4; 
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
            
             tiemponuevsab= VentanaTerror.tiemponuevsab= VentanaTerror.tiemponuevsab - 1.57;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom);
         }
         
         /* -------------------------------- para domingo --------------------------------------------------- */
         if(codigodom.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida");  
             
             peli4parasab="";
             peli4paradom="";
             
             VentanaTerror.peli3parasab = "";
             VentanaTerror.peli3paradom = "";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";
             
             VentanaDrama.peli1parasab=""; 
             VentanaDrama.peli1paradom="";
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaDrama.codigosab.setEditable(true);
             VentanaDrama.codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
          }
         
         
         if(codigodom.getText().equals("1") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             peli4paradom = peli4paradom + "1. 2001: Odisea en el espacio 2 h 22 min \n";
             
             
             codigotextodom = 1; 
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
            
             tiemponuevdom= VentanaTerror.tiemponuevdom= VentanaTerror.tiemponuevdom - 2.22;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom); 
         }
         
         if(codigodom.getText().equals("2") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             peli4paradom = peli4paradom + "2. La novia de Frankenstein: 1 h 15 min \n";
             
             
             codigotextodom = 2; 
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
        
             tiemponuevdom= VentanaTerror.tiemponuevdom= VentanaTerror.tiemponuevdom - 1.15;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom); 
         }
         
         if(codigodom.getText().equals("3") ) {
             
             VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
             drama.setBounds(0, 0, 1000, 700);
             drama.setVisible(true);
             this.setVisible(false);
             drama.setResizable(false);
             drama.setTitle("Ventana Cartelera Sábado - Domingo");   
             
             peli4paradom = peli4paradom + "3. El planeta de los simios: 1 h 55 min \n";
             
             
             codigotextodom = 3; 
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
         
             tiemponuevdom= VentanaTerror.tiemponuevdom= VentanaTerror.tiemponuevdom - 1.55;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom); 
         }
         
  
         if(codigodom.getText().equals("4") ) {
      
        	 VentanaSabadoDomingo drama=new VentanaSabadoDomingo();
        	 drama.setBounds(0, 0, 1000, 700);
        	 drama.setVisible(true);
        	 this.setVisible(false);
        	 drama.setResizable(false);
        	 drama.setTitle("Ventana Cartelera Sábado - Domingo");   
      

        	 peli4paradom = peli4paradom + "4. Alien, el octavo pasajero: 1 h 57 min \n";
             
             
             codigotextodom = 4; 
             VentanaSabadoDomingo.s1parasab.setText(peli4parasab + VentanaDrama.peli1parasab + VentanaComedia.peli2parasab + VentanaTerror.peli3parasab);
             VentanaSabadoDomingo.s2parasab.setText(peli4paradom + VentanaDrama.peli1paradom + VentanaComedia.peli2paradom + VentanaTerror.peli3paradom); 
             
             tiemponuevdom= VentanaTerror.tiemponuevdom= VentanaTerror.tiemponuevdom - 1.57;
             VentanaSabadoDomingo.tiempsab.setText("" + tiemponuevsab);
             VentanaSabadoDomingo.tiempdom.setText("" + tiemponuevdom); 
            
            
         }
         
         
         /* 0 para salir a bienvenida DOMINGO */
         
         if(codigodom.getText().equals("0") ) {
             
             VentanaBienvenida salirdrama=new VentanaBienvenida();
             salirdrama.setBounds(0, 0, 1000, 700);
             salirdrama.setVisible(true);
             this.setVisible(false);
             salirdrama.setResizable(false);
             salirdrama.setTitle("Ventana Bienvenida");  
             
             peli4parasab="";
             peli4paradom="";
             
             VentanaTerror.peli3parasab = "";
             VentanaTerror.peli3paradom = "";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";
             
             VentanaDrama.peli1parasab=""; 
             VentanaDrama.peli1paradom="";
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaDrama.codigosab.setEditable(true);
             VentanaDrama.codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
          }
      
         if(salirfield.getText().equals("0") ) {
             
             VentanaBienvenida generos=new VentanaBienvenida();
             generos.setBounds(0, 0, 1000, 700);
             generos.setVisible(true);
             this.setVisible(false);
             generos.setResizable(false);
             generos.setTitle("Ventana Bienvenida"); 
             
             peli4parasab="";
             peli4paradom="";
             
             VentanaTerror.peli3parasab = "";
             VentanaTerror.peli3paradom = "";
             
             VentanaComedia.peli2parasab=""; 
             VentanaComedia.peli2paradom="";
             
             VentanaDrama.peli1parasab=""; 
             VentanaDrama.peli1paradom="";
             
             codigotexto=0; 
             codigotextodom=0 ;
             
             codigosab.setEditable(true);
             codigodom.setEditable(true);
             
             VentanaDrama.codigosab.setEditable(true);
             VentanaDrama.codigodom.setEditable(true);
             
             VentanaComedia.codigosab.setEditable(true);
             VentanaComedia.codigodom.setEditable(true);
             
             VentanaTerror.codigosab.setEditable(true);
             VentanaTerror.codigodom.setEditable(true);
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
       
    	   VentanaCienciaFiccion fin=new VentanaCienciaFiccion();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Género - Drama");
           fin.setResizable(false);   
      }
        
}
