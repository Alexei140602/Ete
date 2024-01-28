/***
*Programa: Ejemplo2Variables.java
*Autor:    Adriana Vega Palos
*Fecha:    dd/mm/AAAA
*Descripcion: Inicia POO Manejo de objetos y eventos tipos de datos, 2 objetos cajas de texto y etiquetas
*             dos métodos setBouns (localizar objetos en la pantalla y setEditable
*
***/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practica2Prestamos extends JFrame implements ActionListener {

    private JLabel etiquetaBienvenida;
    private JTextField campoCodigo, campoTextoResultado;
    private JButton botoncalcular;
   

    public static void main(String[] args) {
        Practica2Prestamos demo = new Practica2Prestamos ();
        demo.setSize(350,250);
        demo.crearGUI();
        demo.setTitle("Variables en Java");
        demo.setVisible(true);
    }

    private void crearGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

        etiquetaBienvenida = new JLabel("Escriba su sueldo, solo números");
        ventana.add(etiquetaBienvenida);

        campoCodigo = new JTextField(10);
        campoCodigo.setBounds(9, 10, 30, 30);
        ventana.add(campoCodigo);

        campoTextoResultado = new JTextField(25);
        campoTextoResultado.setBounds(2, 30, 30, 30);
        
        campoTextoResultado.setEditable(false);  // no permite editar
        campoTextoResultado.setEnabled(false);   // no lo deja disponible
        ventana.add(campoTextoResultado);
        
        botoncalcular = new JButton("abrir");
        ventana.add(botoncalcular);
        botoncalcular.setBounds(2, 20, 30, 30);
        botoncalcular.addActionListener(this);

        
        
        
    }

    public void actionPerformed(ActionEvent event) {
    	Object origen= event.getSource(); //permite trabajar con mas de un botón
    	if (origen == botoncalcular) {	
           String cadenaCodigo;  // variable tipo texto
           int codigo;            //variable tipo entero
          

           cadenaCodigo = campoCodigo.getText();   //recibe el valor de la caja de texto en la variable
           codigo = Integer.parseInt(cadenaCodigo);//utiliza la variable de cadena para cambiarla a numérica
           codigo = codigo*1;                      /*si el valor es decimal sera Double.parseDouble
                                                     o Float.parseFloat    */
           
                                //valida la variable entera
           
               campoTextoResultado.setText("el monto a pagar es igual a " + codigo);//enviando un cadena de datos a la caja de texto
               
             
    	}
 
    	     else {
    	    	 System.exit(0);// Sale del Sistema
    	}
    }
}