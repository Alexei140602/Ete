import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;   //NUEVA BIBLIOTECA

public class Pacman_pac extends JFrame 
implements ActionListener  {
	private JPanel panel;
	private JButton empezar;
	private JLabel creditos;
	
	
     public static void main(String[] args){
    	 Pacman_pac marco = new Pacman_pac();
        marco.setSize(350, 350);
        marco.crearGUI();
        marco.setVisible(true);
        marco.setTitle("Juego Piedra, Papel o tijera");         // Permite crear el titulo del marco
        marco.getContentPane().setBackground(Color.darkGray); // permite asignarle un color al marco
		}	
		
        public void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      

		panel = new JPanel();
		panel.setBounds(30, 50,270,220);
		panel.setBackground(Color.blue);
		add(panel);
		
		// PERMITE CREAR UN NUEVO PANEL EN LA APLICACIÓN
		empezar = new JButton("Empezar juego");
		empezar.setBounds(100,80,120,20);
		add(empezar);
		empezar.setBackground(Color.cyan);
		empezar.addActionListener(this);
		
		creditos = new JLabel ("lago");
		creditos.setBounds(100,80,50,100);
		creditos.setBackground(Color.cyan);
		add(creditos);
	    }
	    
	    public void actionPerformed(ActionEvent event)
	 {
	    	
     }
}	