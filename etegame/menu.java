
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menu extends JFrame 
implements ActionListener  {
	private JPanel panel, panelfondo;
	private JButton empezar;
	private JLabel creditos;
	
	
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

	
		 Color morado   = new  Color (156,66,251);
		 Color fondo   = new  Color (21,145,255);
		 Font tipoLetra = new Font("Comic Sans",Font.ITALIC,12);


	empezar = new JButton("Empezar juego");
		empezar.setBounds(100,80,120,20);
		empezar.setBackground(morado);
		add(empezar);
		empezar.addActionListener(this);

	creditos=new JLabel("<html> <p>*Universidad Nacional Autonoma de México</p> <p>*Estudio Tecnico En Computación</p> <p>*ENP No°6: Antonio Caso</p> <p>*Profa. Adriana Vega Palos</p> <p>Creado por:</p><p>*Barrera Sanchez Alem Isaias</p> <p>*Ramírez Pedroza Alexei</p> <p>*2023-2024</p> </html>");
		add(creditos);
		creditos.setBounds(50,100,250,200);
		creditos.setBackground(morado);
		creditos.setFont(tipoLetra);

		panel = new JPanel();
		panel.setBounds(30, 40,270,240);
		panel.setBackground(fondo);
		add(panel);
		
		 panelfondo = new JPanel();
		panelfondo.setBounds(0, 0,350,350);
		panelfondo.setBackground(Color.BLACK);
		add(panelfondo);

		
	    }
	    
	    public void actionPerformed(ActionEvent event)
	 {
		Pacman newframe = new Pacman();
        newframe.setBounds(100,100,400,420);
		newframe.setVisible(true);
		  this.dispose();
		// dispose();
		// new prueba ();
	
     }
}	