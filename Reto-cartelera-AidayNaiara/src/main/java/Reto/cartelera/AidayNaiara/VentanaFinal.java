package Reto.cartelera.AidayNaiara;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.Timer;

public class VentanaFinal extends JFrame implements ActionListener {
	
    static VentanaFinal fin;
    private JLabel gracias;
    
   
  
    public VentanaFinal(){
        
      this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));

        setLayout(null); 
       
        
       
                
        gracias=new JLabel("¡GRACIAS POR USAR NUESTRA CARTELERA!");
        gracias.setBounds(51,240,900,60);
        gracias.setFont(gracias.getFont().deriveFont(40f));
        add(gracias);
        
        Timer timer = new Timer (3000, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
            	VentanaBienvenida tempof=new VentanaBienvenida();
            	tempof.setBounds(0, 0, 1000, 700);
            	tempof.setVisible(true);
                this.setVisible(false); 
                tempof.setResizable(false);
                tempof.setTitle("Bienvenida");  
                
                
             }

    		private void setVisible(boolean b) {
    			// TODO Auto-generated method stub
    			
    		}
    		
        });
   
        timer.start();  
        timer.setRepeats(false);
       
    }
    
    
    
      public static void main(String[] ar){
       
    	  VentanaFinal fin=new VentanaFinal();
           fin.setBounds(150,16,1000,700);
           fin.setVisible(true);
           fin.setTitle("Ventana final");
           fin.setResizable(false);   
      }



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

       
}
