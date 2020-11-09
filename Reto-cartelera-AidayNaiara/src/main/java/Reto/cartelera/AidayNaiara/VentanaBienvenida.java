package Reto.cartelera.AidayNaiara;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.Timer;

    
public class VentanaBienvenida extends JFrame implements ActionListener{
    static VentanaBienvenida fin;
    private JLabel gracias;
    private JButton continuar;
    
    
    public VentanaBienvenida(){
        
      this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));

        setLayout(null); 
        

        gracias=new JLabel("¡BIENVENIDO A CARTELERAS NAI&AI!");
        gracias.setBounds(120,240,900,60);
        gracias.setFont(gracias.getFont().deriveFont(40f));
        add(gracias);
        
       
        Timer timer = new Timer (3000, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
            	VentanaLogin tempo=new VentanaLogin();
            	tempo.setBounds(0, 0, 1000, 700);
            	tempo.setVisible(true);
                this.setVisible(false); 
                tempo.setResizable(false);
                tempo.setTitle("Final");  
                
                
             }

    		private void setVisible(boolean b) {
    			// TODO Auto-generated method stub
    			
    		}
    		
        });
   
        timer.start();  
        timer.setRepeats(false);
       
    }
    
       
      public static void main(String[] ar){
       
    	  VentanaBienvenida fin=new VentanaBienvenida();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana bienvenida");
           fin.setResizable(false); 
           
          
      }


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
      
}
