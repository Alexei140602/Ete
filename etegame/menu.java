
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menu extends JFrame 
implements ActionListener  {
	private JPanel  panelfondo;
	private JButton empezar,botoncreditos, botoninstrucciones, botonregresar;
	private JLabel creditos, instrucciones;
	private ImageIcon iconpacman;
	
	
     public static void main(String[] args){
    	new menu();
		}	
        public menu() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      	 this.setLayout(null);
		 this.setSize(400, 420); //tamaño de ventana
		 this.setTitle("..:: pacman  :::.."); //título de la ventana 
		 this.setVisible(true);
		 this.setResizable(true);
		 this.setLocationRelativeTo(null);

		
		Color blanco= new Color(255,255,255);
		 Color morado   = new  Color (156,66,251);
		
		 Font tipoLetra = new Font("Comic Sans",Font.ITALIC,12);

	empezar = new JButton("Inserte moneda para iniciar");
		empezar.setBounds(95,80,190,20);
		empezar.setBackground(morado);
		add(empezar);
		empezar.addActionListener(this);

		botoncreditos = new JButton("Creditos");
		botoncreditos.setBounds(130,120,120,20);
		botoncreditos.setBackground(morado);
		add(botoncreditos);
		botoncreditos.addActionListener(this);

		botoninstrucciones = new JButton("Instrucciones");
		botoninstrucciones.setBounds(130,160,120,20);
		botoninstrucciones.setBackground(morado);
		add(botoninstrucciones);
		botoninstrucciones.addActionListener(this);

		botonregresar = new JButton("regresar al menu");
		botonregresar.setBounds(120,200,150,20);
		botonregresar.setBackground(morado);
		add(botonregresar);
		botonregresar.addActionListener(this);
		botonregresar.setVisible(false);

		creditos=new JLabel("<html> <p>*Universidad Nacional Autonoma de México</p> <p>*Estudio Tecnico En Computación</p> <p>*ENP No°6: Antonio Caso</p> <p>*Profa. Adriana Vega Palos</p> <p>Creado por:</p><p>*Barrera Sanchez Alem Isaias</p> <p>*Ramírez Pedroza Alexei</p> <p>*2023-2024</p> </html>");
		add(creditos);
		creditos.setBounds(50,0,250,200);
		creditos.setForeground(blanco);
		creditos.setBackground(blanco);
		creditos.setFont(tipoLetra);
		creditos.setVisible(false);

		instrucciones=new JLabel("<html> <p>*INSTRUCCIONES</p> <p>1.- INGRESAR MONEDA PARA ACCEDER AL JUEGO</p> <p>2.- PRESIONAR ESPACIO</p> <p>3.- COMER LA MAYOR CANTIDAD DE PUNTOS SIN SER ALCANZADO POR LOS FANTASMAS</p><p>4.- DIVERTIRSE</p></html>");
		add(instrucciones);
		instrucciones.setBounds(50,0,250,200);
		instrucciones.setForeground(blanco);
		instrucciones.setBackground(blanco);
		instrucciones.setFont(tipoLetra);
		instrucciones.setVisible(false);

		iconpacman = new ImageIcon(new ImageIcon("./images/pacma.jpg").getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT));
        JLabel lblpacman = new JLabel();
		lblpacman.setIcon( iconpacman);
		lblpacman.setBounds(0, 10, 400,400);
		add(lblpacman);
		
		
		
		 panelfondo = new JPanel();
		panelfondo.setBounds(0, 0,400,400);
		panelfondo.setBackground(Color.black);
		add(panelfondo);

		
	    }
	    
		public void actionPerformed(ActionEvent e) 
		{
		   
		   
		   if (e.getSource()==empezar) 
 		{   
		Pacman newframe = new Pacman();
        newframe.setBounds(100,100,400,420);
		newframe.setVisible(true);
		  this.dispose();
		// dispose();
		// new prueba ();
	
     }
	 else if (e.getSource()==botoncreditos) {

	
		botoninstrucciones.setVisible(false);
		botoncreditos.setVisible(false);
		botonregresar.setVisible(true);
		empezar.setVisible(false);
		creditos.setVisible(true);

	 }
	 else if (e.getSource()==botoninstrucciones) {
		botoninstrucciones.setVisible(false);
		botoncreditos.setVisible(false);
		botonregresar.setVisible(true);
		empezar.setVisible(false);
		instrucciones.setVisible(true);

	 }
	 else if (e.getSource()==botonregresar) {

		
		botoninstrucciones.setVisible(true);
		botoncreditos.setVisible(true);
		botonregresar.setVisible(false);
		empezar.setVisible(true);
		creditos.setVisible(false);
		instrucciones.setVisible(false);
	 }
}	
}