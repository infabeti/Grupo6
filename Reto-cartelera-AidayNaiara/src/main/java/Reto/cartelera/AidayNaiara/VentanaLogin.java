package Reto.cartelera.AidayNaiara;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class VentanaLogin extends JFrame implements ActionListener {
	
	static VentanaLogin login;
	
    private JLabel nombre, contra, inicie;
    
    private JButton iniciarsesion;
    
    static public JTextField fnombre, fcontra;
    
    private Color azulito;
    
    
    
public VentanaLogin () {
	
	this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
	
	setLayout(null);
	
	Color azulito = new Color(164, 190, 214);
	
	
	nombre = new JLabel("Nombre: ");
	nombre.setBounds(120, 210, 900, 60);
	nombre.setFont(nombre.getFont().deriveFont(20f));
    add(nombre);
    
    contra = new JLabel("Contraseña: ");
    contra.setBounds(120, 310, 900, 60);
    contra.setFont(contra.getFont().deriveFont(20f));
    add(contra);
    
    inicie = new JLabel("INICIE SESIÓN ");
    inicie.setBounds(335, 50, 900, 60);
    inicie.setFont(inicie.getFont().deriveFont(45f));
    add(inicie);
	
   
    fnombre = new JTextField();
    fnombre.setBounds(270, 227, 150, 30);
    fnombre.setEditable(true);
    add(fnombre);
    
    fcontra = new JPasswordField();
    fcontra.setBounds(270, 327, 150, 30);
    fcontra.setEditable(true);
    add(fcontra);
	
	
    iniciarsesion = new JButton("INICIAR");
    iniciarsesion.setBounds(770, 590, 160, 45);
    iniciarsesion.setFont(iniciarsesion.getFont().deriveFont(15f));
    iniciarsesion.setVisible(true);
    add(iniciarsesion);
    iniciarsesion.addActionListener(this); // para
    iniciarsesion.setBackground(azulito); // el
    iniciarsesion.setForeground(Color.black); // color
	
}

public void actionPerformed(ActionEvent e) {
	 
    
    if(fnombre.getText().equals("naiarayaida") && fcontra.getText().equals("12345") ) {
       
       VentanaSabadoDomingo iniciarsesion=new VentanaSabadoDomingo();
       iniciarsesion.setBounds(0, 0, 1000, 700);
       iniciarsesion.setVisible(true);
       this.setVisible(false);
       iniciarsesion.setResizable(false);
       iniciarsesion.setTitle("Login");  
       
    } else {
    	
  	  VentanaLogin iniciarsesion=new VentanaLogin();
        iniciarsesion.setBounds(0, 0, 1000, 700);
        iniciarsesion.setVisible(true);
        this.setVisible(false);
        iniciarsesion.setResizable(false);
        iniciarsesion.setTitle("Login");  
  	
  }
    }
    


public static void main(String[] args) {

	VentanaLogin iniciarses = new VentanaLogin();
    iniciarses.setBounds(150, 16, 1000, 700);
    iniciarses.setVisible(true);
    iniciarses.setTitle("Login");
    iniciarses.setResizable(false);
}
}
