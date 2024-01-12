import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;   //NUEVA BIBLIOTECA

public class prueba extends JFrame 
implements ActionListener  {
	private JPanel panel, panelfondo;
	private JButton empezar;
	private JLabel creditos;
	
	
    
        public static void main(String args[]){
            new prueba (); //Llamo a la clase 
        }
     
        public prueba(){ //sal es el parámetro, la variable cantidad. 
           
            this.setLayout(null);
            this.setSize(350, 350); //tamaño de ventana
            this.setTitle("..:: prueba  :::.."); //título de la ventana 
            this.setVisible(true);
            this.setResizable(true);
            this.setLocationRelativeTo(null);
      

		creditos=new JLabel ("creditos ");
		add(creditos);
		creditos.setBounds(100,20,100,25);
		creditos.setBackground(Color.cyan);	
		
		empezar = new JButton("Empezar juego");
		empezar.setBounds(100,80,120,20);
		empezar.setBackground(Color.white);
		add(empezar);
		empezar.addActionListener(this);

		panel = new JPanel();
		panel.setBounds(30, 40,270,240);
		panel.setBackground(Color.red);
		add(panel);

		panelfondo = new JPanel();
		panelfondo.setBounds(0, 0,350,350);
		panelfondo.setBackground(Color.black);
		add(panelfondo);

		
		// PERMITE CREAR UN NUEVO PANEL EN LA APLICACI�N

		
	    }
	    
	    public void actionPerformed(ActionEvent event)
	 {
     }
}	