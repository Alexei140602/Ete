import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class despachador extends JFrame 
    implements ActionListener {
	
    private ButtonGroup bg;
    private JRadioButton radiochetos, radiochips,radiochokis, radiococa, radiocrujitos, radiodelaware, radiomundet, radiopepsi, radiosangria, radiosponch;
    private JLabel lblResultado, lblchetos, lblchips, lblchokis,lblcoca, lblcrujitos, lbldelaware, lblmundet, lblpepsi, lblsangria, lblsponch, lblMensaje,lblMensaje2,lblMensaje3,lblMensaje4,lblMensaje5,lblMensaje6,lblMensaje7 ;
    private JButton botoncarro, botonTermina, botoncuenta,boton20, boton10, boton5, boton2, boton1;
	private ImageIcon iconchetos, iconchips, iconchokis, iconcoca,iconcrujitos, icondelaware, iconmundet, iconpepsi, iconsangria,iconsponch, icon1, icon2, icon5, icon10, icon20; // Objeto para manejar imagenes
	int v11, maximo ;
    private double acumulaOperaciones, costo=0, cuenta=0, intoperaciones; 
    private int veinte, diez, cinco, dos=0, uno=0;
    private String varResultado, varacumulacion;
	
    public static void main(String[] ar) 
    {
    	despachador formulario1=new despachador();
        formulario1.setBounds(50,50,680,550);
        formulario1.setVisible(true);
    } 
       
    public despachador
    () 
    {
        setLayout(null); //nota:sin esta linea el boton se pone como fondo
        
        Color rojo = new  Color (198, 17, 50);
    	Color morado   = new  Color (143, 17, 198);
    	Font tipoLetra2 = new Font("Comic Sans",Font.ITALIC,11);

        bg=new ButtonGroup();
        
        lblResultado=new JLabel("Se mostrara el Resultado");
        lblResultado.setBounds(200,80,150,30);
        add(lblResultado);
        
        
        //aqui va boton de chetos
        radiochetos=new JRadioButton("chetos--20$");
        radiochetos.setBounds(10,110,120,30);		
        bg.add(radiochetos); 
        radiochetos.setFont(tipoLetra2);
        add(radiochetos);
        iconchetos = new ImageIcon(new ImageIcon("chetos.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblchetos = new JLabel();
		lblchetos.setIcon(iconchetos);
		lblchetos.setBounds(30, 110, 100, 110);
		add(lblchetos);
		radiochetos.setBackground(rojo);
		radiochetos.setForeground(morado);
        
		
		//aqui va boton de chips
        radiochips=new JRadioButton("chips--22$");
        radiochips.setBounds(10,210,100,30);
        bg.add(radiochips); 
        radiochips.setFont(tipoLetra2);
        add(radiochips);
        iconchips = new ImageIcon(new ImageIcon("chips.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblchips = new JLabel();
        lblchips.setIcon(iconchips);
  		lblchips.setBounds(30, 210, 100, 110);
  		add(lblchips);
  		radiochips.setBackground(rojo);
  		radiochips.setForeground(morado);
  		
        //aqui va boton de chokis
        radiochokis=new JRadioButton("chokis--15$");
        radiochokis.setBounds(10,310,100,30);
        bg.add(radiochokis); 
        radiochokis.setFont(tipoLetra2);
        add(radiochokis);
        iconchokis = new ImageIcon(new ImageIcon("chokis.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblchokis = new JLabel();
        lblchokis.setIcon(iconchokis);
  		 lblchokis.setBounds(30, 310, 100, 110);
  		add(lblchokis);
  		radiochokis.setBackground(rojo);
  		radiochokis.setForeground(morado);
  		
        //aqui va boton de coca
        radiococa=new JRadioButton("coca--16$");
        radiococa.setBounds(10,410,120,30);
        bg.add(radiococa); 
        radiococa.setFont(tipoLetra2);
        add(radiococa);
        iconcoca = new ImageIcon(new ImageIcon("coca.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblcoca = new JLabel();

        lblcoca.setIcon(iconcoca);
  		lblcoca.setBounds(30, 410, 100, 110);
  		add(lblcoca);
  		radiococa.setBackground(rojo);
  		radiococa.setForeground(morado);

         //aqui va boton de crujitos
        radiocrujitos=new JRadioButton("crujitos--21$");
        radiocrujitos.setBounds(170,110,120,30);
        bg.add(radiocrujitos); 
        radiocrujitos.setFont(tipoLetra2);
        add(radiocrujitos);
        iconcrujitos = new ImageIcon(new ImageIcon("crujitos.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblcrujitos = new JLabel();
  		lblcrujitos.setBounds(190, 110, 100, 110);
  		lblcrujitos.setIcon(iconcrujitos);
  		add(lblcrujitos);
  		radiocrujitos.setBackground(rojo);
  		radiocrujitos.setForeground(morado);

         //aqui va boton de delaware
        radiodelaware=new JRadioButton("delaware--17$");
        radiodelaware.setBounds(170,210,120,30);
        bg.add(radiodelaware); 
        radiodelaware.setFont(tipoLetra2);
        add(radiodelaware);
        icondelaware = new ImageIcon(new ImageIcon("delaware.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lbldelaware = new JLabel();

  		lbldelaware.setBounds(190, 210, 100, 110);
  		lbldelaware.setIcon(icondelaware);
  		add(lbldelaware);
  		radiodelaware.setBackground(rojo);
  		radiodelaware.setForeground(morado);
        
          //aqui va boton de mundet
        radiomundet=new JRadioButton("mundet--18$");
        radiomundet.setBounds(170,310,120,30);
        bg.add(radiomundet); 
        radiomundet.setFont(tipoLetra2);
        add(radiomundet);
        iconmundet = new ImageIcon(new ImageIcon("mundet.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));       
        JLabel lblmundet = new JLabel();
  		lblmundet.setBounds(190, 310, 100, 110);
  		lblmundet.setIcon(iconmundet);
  		add(lblmundet);
  		radiomundet.setBackground(rojo);
  		radiomundet.setForeground(morado);

                //aqui va boton de pepsi
        radiopepsi=new JRadioButton("pepsi--19$");
        radiopepsi.setBounds(170,410,120,30);
        bg.add(radiopepsi); 
        radiopepsi.setFont(tipoLetra2);
        add(radiopepsi);
        iconpepsi = new ImageIcon(new ImageIcon("pepsi.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblpepsi = new JLabel();
  		lblpepsi.setBounds(190, 410, 100, 110);
  		lblpepsi.setIcon(iconpepsi);
  		add(lblpepsi);
  		radiopepsi.setBackground(rojo);
  		radiopepsi.setForeground(morado);
      
            //aqui va boton de sangria
        radiosangria=new JRadioButton("sangria--23$");
        radiosangria.setBounds(350,110,120,30);
        bg.add(radiosangria); 
        radiosangria.setFont(tipoLetra2);
        add(radiosangria);
        iconsangria = new ImageIcon(new ImageIcon("sangria.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblsangria = new JLabel();
  		lblsangria.setBounds(370, 110, 100, 110);
  		lblsangria.setIcon(iconsangria);
  		add(lblsangria);
  		radiosangria.setBackground(rojo);
  		radiosangria.setForeground(morado);

          //aqui va boton de sponch
        radiosponch=new JRadioButton("sponch--26$");
        radiosponch.setBounds(350,210,120,30);
        bg.add(radiosponch); 
        radiosponch.setFont(tipoLetra2);
        add(radiosponch);
        iconsponch = new ImageIcon(new ImageIcon("sponch.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        JLabel lblsponch = new JLabel();
  		lblsponch.setBounds(370, 210, 100, 110);
  		lblsponch.setIcon(iconsponch);
  		add(lblsponch);
  		radiosponch.setBackground(rojo);
  		radiosponch.setForeground(morado);
      
        
        //aqui va boton para agarrar al carrito los articulos
        botoncarro=new JButton("Agregar al carro");
        botoncarro.setBounds(480,100,160,30);
        botoncarro.addActionListener(this);
        add(botoncarro);
        botoncarro.setBackground(rojo);
        botoncarro.setForeground(morado);
        
       
        
        //aqui va boton para sacar la cuenta
        botoncuenta = new JButton("Cuenta ");
        botoncuenta.setBounds(480, 200, 160, 30);
        add(botoncuenta);
        botoncuenta.addActionListener( this);
        botoncuenta.setBackground(rojo);
        botoncuenta.setForeground(morado);
        
        //aqui va boton para cerrar la aplicacion
        botonTermina = new JButton("Cerrar Aplicacion ");
        botonTermina.setBounds(480, 400, 160, 30);
      
        add(botonTermina);
        botonTermina.addActionListener( this);
        botonTermina.setBackground(rojo);
        botonTermina.setForeground(morado);

        boton20 = new JButton("");
        boton20.setBounds(10, 20, 120, 50);
        icon20 = new ImageIcon(new ImageIcon("20.jpg").getImage().getScaledInstance(110, 50, Image.SCALE_DEFAULT));
        boton20.setIcon(icon20);
        add(boton20);
        boton20.addActionListener( this);
        boton20.setBackground(rojo);
        boton20.setForeground(morado);
        boton20.setVisible(false);

        boton10 = new JButton("");
        boton10.setBounds(135, 20, 120, 50);
        icon10 = new ImageIcon(new ImageIcon("10.jpg").getImage().getScaledInstance(110, 50, Image.SCALE_DEFAULT));
        boton10.setIcon(icon10);
        add(boton10);
        boton10.addActionListener( this);
        boton10.setBackground(rojo);
        boton10.setForeground(morado);
        boton10.setVisible(false);

        boton5 = new JButton("");
        boton5.setBounds(260, 20, 100, 50);
        icon5 = new ImageIcon(new ImageIcon("5.jpg").getImage().getScaledInstance(110, 50, Image.SCALE_DEFAULT));
        boton5.setIcon(icon5);
        add(boton5);
        boton5.addActionListener( this);
        boton5.setBackground(rojo);
        boton5.setForeground(morado);
        boton5.setVisible(false);

        boton2 = new JButton("");
        boton2.setBounds(370, 20, 120, 50);
        icon2 = new ImageIcon(new ImageIcon("2.jpg").getImage().getScaledInstance(110, 50, Image.SCALE_DEFAULT));
        boton2.setIcon(icon2);
        add(boton2);
        boton2.addActionListener( this);
        boton2.setBackground(rojo);
        boton2.setForeground(morado);
        boton2.setVisible(false);

        boton1 = new JButton("");
        boton1.setBounds(500, 20, 120, 50);
        icon1 = new ImageIcon(new ImageIcon("1.jpg").getImage().getScaledInstance(110, 50, Image.SCALE_DEFAULT));
        boton1.setIcon(icon1);
        add(boton1);
        boton1.addActionListener( this);
        boton1.setBackground(rojo);
        boton1.setForeground(morado);
        boton1.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e) 
     {
        
    	
		if (e.getSource()==botoncarro) 
    	 {
    		cuenta=0;
            if (radiochetos.isSelected()) 
             {
            	    costo=20;
            	    acumulaOperaciones=acumulaOperaciones + costo;
            	    cuenta=cuenta + costo;
                 
            } 
            if (radiochips.isSelected()) 

             {
            	costo=22;
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;   
             }             
            if (radiochokis.isSelected()) 
             {             
            	costo=15;          
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;
             }
            if (radiococa.isSelected()) 
             {
            	costo=16;
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;
             }
             
            if (radiocrujitos.isSelected()) 
             {             
            	costo=21;                    
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;
             }
             
            if (radiodelaware.isSelected())
             {                  
            	costo=17;                    
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;
             }
            if (radiomundet.isSelected()) 
             {             
            	costo=18;                    
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;    
             }
            if (radiopepsi.isSelected()) 
             {
            	costo=19;
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;
             }
            if (radiosangria.isSelected()) 
             {
            	costo=23;
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;
             }
            if (radiosponch.isSelected()) 
             {
            	costo=26;                       
            	acumulaOperaciones=acumulaOperaciones + costo;
            	cuenta=cuenta + costo;
             }
            
             
            intoperaciones=acumulaOperaciones;
            setTitle(String.valueOf(cuenta));
            setTitle(String.valueOf(acumulaOperaciones));
            varResultado=Double.toString(acumulaOperaciones);            
            varacumulacion=Double.toString(acumulaOperaciones);  
            JOptionPane.showMessageDialog(null, "el precio a pagar es " + varResultado);
            lblResultado.setText("el precio a pagar es " + varResultado);
            
        }
      
        else if (e.getSource()==botoncuenta) {
        	JOptionPane.showMessageDialog(null, "favor de indicar las monedas para pagar(acepta 20,10,5,1)");
        	lblResultado.setText("el precio a pagar es " + varacumulacion);
        	radiochips.setEnabled(false);
        	radiochetos.setEnabled(false);
        	radiochokis.setEnabled(false);
        	radiococa.setEnabled(false);
        	radiocrujitos.setEnabled(false);
        	radiodelaware.setEnabled(false);
        	radiomundet.setEnabled(false);
        	radiopepsi.setEnabled(false);
        	radiosangria.setEnabled(false);
        	radiosponch.setEnabled(false);
        	
            boton20.setVisible(true);
            boton10.setVisible(true);
            boton5.setVisible(true);
            boton2.setVisible(true);
            boton1.setVisible(true);


           
        }
        else if (e.getSource()== boton20)
        {
                     v11=20;
                     maximo=maximo+20;
                 if (maximo<=35)
                 {
        		    if ((intoperaciones-v11)<=0 )
        			{
        		    	intoperaciones=(intoperaciones-v11);
        		    	intoperaciones=(intoperaciones*-1);
                        
        		    
                        if (((intoperaciones)-20)>=0) {
                        	intoperaciones=intoperaciones-20;
                            veinte=1;
                        }
                        if (((intoperaciones)-10)>=0) {
                        	intoperaciones=intoperaciones-10;
                            diez=1;
                        }
                        if (((intoperaciones)-5)>=0) {
                        	intoperaciones=intoperaciones-5;
                            cinco=1;
                        }
                        if (((intoperaciones)-2)>=0) {
                        	intoperaciones=intoperaciones-2;
                            dos=1;
                        }
                        
                        if (((intoperaciones)-1)>=0) {
                        	intoperaciones=intoperaciones-1;
                            uno=1;
                        }
                        if (((intoperaciones)-1)>=0) {
                        	intoperaciones=intoperaciones-1;
                            uno=2;
                        }
        				JOptionPane.showMessageDialog(null, "la cuenta esta pagada,favor de recoger su producto,"
        						+ " el cambio es de :");

                        lblMensaje3=new JLabel(" billetes de 20: "+ veinte);
                        lblMensaje4=new JLabel(" monedas de 10: "+ diez);
                        lblMensaje5=new JLabel(" monedas de 5: "+ cinco);
                        lblMensaje6=new JLabel(" monedas de 2: "+ dos);
                        lblMensaje7=new JLabel(" monedas de 1: "+ uno);
        				
                        lblMensaje3.setBounds(40,75,400,20);
                        lblMensaje4.setBounds(145,75,400,20);
                        lblMensaje5.setBounds(260,75,400,20);
                        lblMensaje6.setBounds(375,75,400,20);
                        lblMensaje7.setBounds(485,75,400,20);
        				
                     
                        lblMensaje3.setVisible(true);
                        lblMensaje4.setVisible(true);
                        lblMensaje5.setVisible(true);
                        lblMensaje6.setVisible(true);
                        lblMensaje7.setVisible(true);
                        add(lblMensaje3);
                        add(lblMensaje4);
                        add(lblMensaje5);
                        add(lblMensaje6);
                        add(lblMensaje7);
                       
                     }
                     else if ((intoperaciones-v11)>0)
        			{
        			intoperaciones=intoperaciones-v11;
        				JOptionPane.showMessageDialog(null,"la cuenta restante es "+ intoperaciones);
        				lblMensaje=new JLabel("la cuenta restante es "+ intoperaciones);
        				lblMensaje.setBounds(10,35,400,20);
        				add(lblMensaje);
        			}
                 }
                     else if (maximo>35)
                     {
                    	 JOptionPane.showMessageDialog(null,"se alcanzo el limite de deposito, favor de volver a intentar");
                    		System.exit(0);
                     }
        		}
        		  else if (e.getSource()== boton10)
        	        {
        	            
        	        
        	                     v11=10;
        	                     maximo=maximo+10;
        	                     if (maximo<=35)
        	                     {
        	         		    if ((intoperaciones-v11)<=0)
        	        			{
        	        		    	intoperaciones=(intoperaciones-v11);
        	        		    	intoperaciones=(intoperaciones*-1);
        	                        
        	        		    
        	                        if (((intoperaciones)-20)>=0) {
        	                        	intoperaciones=intoperaciones-20;
        	                            veinte=1;
        	                        }
        	                        if (((intoperaciones)-10)>=0) {
        	                        	intoperaciones=intoperaciones-10;
        	                            diez=1;
        	                        }
        	                        if (((intoperaciones)-5)>=0) {
        	                        	intoperaciones=intoperaciones-5;
        	                            cinco=1;
        	                        }
        	                        if (((intoperaciones)-2)>=0) {
        	                        	intoperaciones=intoperaciones-2;
        	                            dos=1;
        	                        }
        	                        
        	                        if (((intoperaciones)-1)>=0) {
        	                        	intoperaciones=intoperaciones-1;
        	                            uno=1;
        	                        }
        	                        if (((intoperaciones)-1)>=0) {
        	                        	intoperaciones=intoperaciones-1;
        	                            uno=2;
        	                        }
        	        				JOptionPane.showMessageDialog(null, "la cuenta esta pagada,favor de recoger su producto, el cambio es de :");

        	                        lblMensaje3=new JLabel(" billetes de 20: "+ veinte);
        	                        lblMensaje4=new JLabel(" monedas de 10: "+ diez);
        	                        lblMensaje5=new JLabel(" monedas de 5: "+ cinco);
        	                        lblMensaje6=new JLabel(" monedas de 2: "+ dos);
        	                        lblMensaje7=new JLabel(" monedas de 1: "+ uno);
        	        				
        	                        lblMensaje3.setBounds(40,75,400,20);
        	                        lblMensaje4.setBounds(145,75,400,20);
        	                        lblMensaje5.setBounds(260,75,400,20);
        	                        lblMensaje6.setBounds(375,75,400,20);
        	                        lblMensaje7.setBounds(485,75,400,20);
        	        				
        	                   
        	                        add(lblMensaje3);
        	                        add(lblMensaje4);
        	                        add(lblMensaje5);
        	                        add(lblMensaje6);
        	                        add(lblMensaje7);
        	                        lblMensaje3.setVisible(true);
        	                        lblMensaje4.setVisible(true);
        	                        lblMensaje5.setVisible(true);
        	                        lblMensaje6.setVisible(true);
        	                        lblMensaje7.setVisible(true);
        	                     }
        	                     else if ((intoperaciones-v11)>0)
        	        			{
        	        			intoperaciones=intoperaciones-v11;
        	        				JOptionPane.showMessageDialog(null,"la cuenta restante es "+ intoperaciones);
        	        				lblMensaje=new JLabel("la cuenta restante es "+ intoperaciones);
        	        				lblMensaje.setBounds(10,35,400,20);
        	        				add(lblMensaje);
        	        			}
        	                     }
        	                     else if (maximo>35)
        	                     {
        	                    	 JOptionPane.showMessageDialog(null,"se alcanzo el limite de deposito, favor de volver a intentar ");
        	                    		System.exit(0);
        	                     }
        	        		}
        	        		  else if (e.getSource()== boton5)
        	        	        {
        	        	            
        	        	        	
        	        	        	  
        	        	                     v11=5;
        	        	                     maximo=maximo+5;
        	        	                     if (maximo<=35)
        	        	                     {
        	        	         		    if ((intoperaciones-v11)<=0)
        	        	        			{
        	        	        		    	intoperaciones=(intoperaciones-v11);
        	        	        		    	intoperaciones=(intoperaciones*-1);
        	        	                        
        	        	        		    
        	        	                        if (((intoperaciones)-20)>=0) {
        	        	                        	intoperaciones=intoperaciones-20;
        	        	                            veinte=1;
        	        	                        }
        	        	                        if (((intoperaciones)-10)>=0) {
        	        	                        	intoperaciones=intoperaciones-10;
        	        	                            diez=1;
        	        	                        }
        	        	                        if (((intoperaciones)-5)>=0) {
        	        	                        	intoperaciones=intoperaciones-5;
        	        	                            cinco=1;
        	        	                        }
        	        	                        if (((intoperaciones)-2)>=0) {
        	        	                        	intoperaciones=intoperaciones-2;
        	        	                            dos=1;
        	        	                        }
        	        	                        
        	        	                        if (((intoperaciones)-1)>=0) {
        	        	                        	intoperaciones=intoperaciones-1;
        	        	                            uno=1;
        	        	                        }
        	        	                        if (((intoperaciones)-1)>=0) {
        	        	                        	intoperaciones=intoperaciones-1;
        	        	                            uno=2;
        	        	                        }
        	        	        				JOptionPane.showMessageDialog(null, "la cuenta esta pagada,favor de recoger su producto, el cambio es de :");

        	        	                        lblMensaje3=new JLabel(" billetes de 20: "+ veinte);
        	        	                        lblMensaje4=new JLabel(" monedas de 10: "+ diez);
        	        	                        lblMensaje5=new JLabel(" monedas de 5: "+ cinco);
        	        	                        lblMensaje6=new JLabel(" monedas de 2: "+ dos);
        	        	                        lblMensaje7=new JLabel(" monedas de 1: "+ uno);
        	        	        				
        	        	                        lblMensaje3.setBounds(40,75,400,20);
        	        	                        lblMensaje4.setBounds(145,75,400,20);
        	        	                        lblMensaje5.setBounds(260,75,400,20);
        	        	                        lblMensaje6.setBounds(375,75,400,20);
        	        	                        lblMensaje7.setBounds(485,75,400,20);
        	        	        				
        	        	                   
        	        	                        add(lblMensaje3);
        	        	                        add(lblMensaje4);
        	        	                        add(lblMensaje5);
        	        	                        add(lblMensaje6);
        	        	                        add(lblMensaje7);
        	        	                        lblMensaje3.setVisible(true);
        	        	                        lblMensaje4.setVisible(true);
        	        	                        lblMensaje5.setVisible(true);
        	        	                        lblMensaje6.setVisible(true);
        	        	                        lblMensaje7.setVisible(true);
        	        	                     }
        	        	                     else if ((intoperaciones-v11)>0)
        	        	        			{
        	        	        			intoperaciones=intoperaciones-v11;
        	        	        				JOptionPane.showMessageDialog(null,"la cuenta restante es "+ intoperaciones);
        	        	        				lblMensaje=new JLabel("la cuenta restante es "+ intoperaciones);
        	        	        				lblMensaje.setBounds(10,35,400,20);
        	        	        				add(lblMensaje);
        	        	        			}
        	        	                     }
        	        	                     else if (maximo>35)
        	        	                     {
        	        	                    	 JOptionPane.showMessageDialog(null,"se alcanzo el limite de deposito, favor de volver a intentar");
        	        	                    		System.exit(0);
        	        	                     }
        	        	        		}
        	        	        		  else if (e.getSource()== boton2)
        	        	        	        {
        	        	        	            
        	        	        	        	
        	        	        	        	  
        	        	        	                     v11=2;
        	        	        	                     maximo=maximo+2;
        	        	        	                     if (maximo<=35)
        	        	        	                     {
        	        	        	         		    if ((intoperaciones-v11)<=0)
        	        	        	        			{
        	        	        	        		    	intoperaciones=(intoperaciones-v11);
        	        	        	        		    	intoperaciones=(intoperaciones*-1);
        	        	        	                        
        	        	        	        		    
        	        	        	                        if (((intoperaciones)-20)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-20;
        	        	        	                            veinte=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-10)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-10;
        	        	        	                            diez=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-5)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-5;
        	        	        	                            cinco=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-2)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-2;
        	        	        	                            dos=1;
        	        	        	                        }
        	        	        	                        
        	        	        	                        if (((intoperaciones)-1)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-1;
        	        	        	                            uno=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-1)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-1;
        	        	        	                            uno=2;
        	        	        	                        }
        	        	        	        				JOptionPane.showMessageDialog(null, "la cuenta esta pagada,favor de recoger su producto, el cambio es de :");

        	        	        	                        lblMensaje3=new JLabel(" billetes de 20: "+ veinte);
        	        	        	                        lblMensaje4=new JLabel(" monedas de 10: "+ diez);
        	        	        	                        lblMensaje5=new JLabel(" monedas de 5: "+ cinco);
        	        	        	                        lblMensaje6=new JLabel(" monedas de 2: "+ dos);
        	        	        	                        lblMensaje7=new JLabel(" monedas de 1: "+ uno);
        	        	        	        				
        	        	        	                        lblMensaje3.setBounds(40,75,400,20);
        	        	        	                        lblMensaje4.setBounds(145,75,400,20);
        	        	        	                        lblMensaje5.setBounds(260,75,400,20);
        	        	        	                        lblMensaje6.setBounds(375,75,400,20);
        	        	        	                        lblMensaje7.setBounds(485,75,400,20);
        	        	        	        				
        	        	        	                        
        	        	        	                        add(lblMensaje3);
        	        	        	                        add(lblMensaje4);
        	        	        	                        add(lblMensaje5);
        	        	        	                        add(lblMensaje6);
        	        	        	                        add(lblMensaje7);
        	        	        	                        lblMensaje3.setVisible(true);
        	        	        	                        lblMensaje4.setVisible(true);
        	        	        	                        lblMensaje5.setVisible(true);
        	        	        	                        lblMensaje6.setVisible(true);
        	        	        	                        lblMensaje7.setVisible(true);
        	        	        	                     }
        	        	        	                     else if ((intoperaciones-v11)>0)
        	        	        	        			{
        	        	        	        			intoperaciones=intoperaciones-v11;
        	        	        	        				JOptionPane.showMessageDialog(null,"la cuenta restante es "+ intoperaciones);
        	        	        	        				lblMensaje=new JLabel("la cuenta restante es "+ intoperaciones);
        	        	        	        				lblMensaje.setBounds(10,35,400,20);
        	        	        	        				add(lblMensaje);
        	        	        	        			}
        	        	        	                     }
        	        	        	                     else if (maximo>35)
        	        	        	                     {
        	        	        	                    	 JOptionPane.showMessageDialog(null,"se alcanzo el limite de deposito, favor de volver a intentar");
        	        	        	                    		System.exit(0);
        	        	        	                     }
        	        	        	        		}
        	        	        	        		  else if (e.getSource()== boton1)
        	        	        	        	        {
        	        	        	        	            
        	        	        	        	        	
        	        	        	        	        	  

        	        	        	                      v11=1;
        	        	        	                      maximo=maximo+1;
        	         	        	                     if (maximo<=35)
        	         	        	                     {
        	        	        	                  
        	        	        	          		    if ((intoperaciones-v11)<=0)
        	        	        	        			{
        	        	        	        		    	intoperaciones=(intoperaciones-v11);
        	        	        	        		    	intoperaciones=(intoperaciones*-1);
        	        	        	        			
        	        	        	        		    
        	        	        	                        if (((intoperaciones)-20)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-20;
        	        	        	                            veinte=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-10)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-10;
        	        	        	                            diez=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-5)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-5;
        	        	        	                            cinco=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-2)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-2;
        	        	        	                            dos=1;
        	        	        	                        }
        	        	        	                        
        	        	        	                        if (((intoperaciones)-1)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-1;
        	        	        	                            uno=1;
        	        	        	                        }
        	        	        	                        if (((intoperaciones)-1)>=0) {
        	        	        	                        	intoperaciones=intoperaciones-1;
        	        	        	                            uno=2;
        	        	        	                        }
        	        	        	                        
        	        	        	        				JOptionPane.showMessageDialog(null, "la cuenta esta pagada,favor de recoger su producto, el cambio es de :");

        	        	        	                        lblMensaje3=new JLabel(" billetes de 20: "+ veinte);
        	        	        	                        lblMensaje4=new JLabel(" monedas de 10: "+ diez);
        	        	        	                        lblMensaje5=new JLabel(" monedas de 5: "+ cinco);
        	        	        	                        lblMensaje6=new JLabel(" monedas de 2: "+ dos);
        	        	        	                        lblMensaje7=new JLabel(" monedas de 1: "+ uno);
        	        	        	        				
        	        	        	                        lblMensaje3.setBounds(40,75,400,20);
        	        	        	                        lblMensaje4.setBounds(145,75,400,20);
        	        	        	                        lblMensaje5.setBounds(260,75,400,20);
        	        	        	                        lblMensaje6.setBounds(375,75,400,20);
        	        	        	                        lblMensaje7.setBounds(485,75,400,20);
        	        	        	        				
        	        	        	                   
        	        	        	                        add(lblMensaje3);
        	        	        	                        add(lblMensaje4);
        	        	        	                        add(lblMensaje5);
        	        	        	                        add(lblMensaje6);
        	        	        	                        add(lblMensaje7);
        	        	        	                        lblMensaje3.setVisible(true);
        	        	        	                        lblMensaje4.setVisible(true);
        	        	        	                        lblMensaje5.setVisible(true);
        	        	        	                        lblMensaje6.setVisible(true);
        	        	        	                        lblMensaje7.setVisible(true);
        	        	        	                     }
        	        	        	                     else if ((intoperaciones-v11)>0)
        	        	        	        			{
        	        	        	        			intoperaciones=intoperaciones-v11;
        	        	        	        				JOptionPane.showMessageDialog(null,"la cuenta restante es "+ intoperaciones);
        	        	        	        				lblMensaje=new JLabel("la cuenta restante es "+ intoperaciones);
        	        	        	        				lblMensaje.setBounds(10,35,400,20);
        	        	        	        				add(lblMensaje);
        	        	        	        			}
        	         	        	                    }
        	        	        	                     else if (maximo>35)
        	        	        	                     {
        	        	        	                    	 JOptionPane.showMessageDialog(null,"se alcanzo el limite de deposito, favor de volver a intentar");
        	        	        	                    		System.exit(0);
        	        	        	                     }
        	        	        	        		}

        else   

        {
        	System.exit(0);
        }
     }
     
}


