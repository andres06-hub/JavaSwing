package Ejercicio1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
//SE CREAN LAS INTANCIAS DE LOS OBJETOS
	// VENTANA PRINCIPAL PANEL
	private JPanel contentPane;
	private JButton btnOcultarNombre;
	private JButton btnMostrarNombre;
	private JButton btnOcultarCiudad;
	private JButton btnMostrarCiudad;
	private JLabel etiNombre, etiCiudad;

	/**
	 * Create the frame.
	 * 
	 * -- Ventana Principal donde estaran todos los objetos
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Le damos las dimenciones al panel 
		setBounds(500, 100, 401, 406);
		// Se crea el panel, el objeto de tipo JPanel
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Contenido del panel
		contenidoVentanaPrincipal();
		
	}
	
	// Se crea un metodo
	public void contenidoVentanaPrincipal(){
		contentPane.setLayout(null);

		etiNombre = new JLabel("Andres Sierra");
		etiNombre.setBounds(27, 38, 152, 38);
		// Le damos diseño:color a la etiqueta  
		etiNombre.setBackground(Color.black);
		etiNombre.setForeground(Color.white);;
		etiNombre.setOpaque(true);
		etiNombre.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		// Se añade al panel
		contentPane.add(etiNombre);


		etiCiudad = new JLabel("Armenia");
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setFont(new Font("Ubuntu", Font.PLAIN, 20));
		// Le damos diseño:color a la etiqueta  
		etiCiudad.setBounds(215, 38, 143, 38);
		etiCiudad.setBackground(Color.black);
		etiCiudad.setForeground(Color.white);;
		etiCiudad.setOpaque(true);
		// Se añade al panel
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBounds(27, 201, 152, 25);
		contentPane.add(btnOcultarNombre);
		
		btnMostrarNombre = new JButton("MostrarNombre");
		btnMostrarNombre.setBounds(24, 248, 152, 25);
		contentPane.add(btnMostrarNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setBounds(206, 201, 152, 25);
		contentPane.add(btnOcultarCiudad);
		
		btnMostrarCiudad = new JButton("Mostrar Ciudad");
		btnMostrarCiudad.setBounds(206, 248, 152, 25);
		contentPane.add(btnMostrarCiudad);
		
		// Se guardaran los objetos botones en un array
		JButton[] btnList = { btnOcultarNombre, btnMostrarNombre, btnOcultarCiudad, btnMostrarCiudad };
		// Se itera por cada uno de ellos y hacer el llamado para el escuchador
		for (JButton jButton : btnList) {
			//Se pasa por cada uno
			jButton.addActionListener(this);
		}
		
	}
	
	

//	Metodo en el cual se implementa el click del mouse
	@Override
	public void actionPerformed(ActionEvent e) {
		// Se condiciona para el nombre
		if (e.getSource() == btnOcultarNombre){
			etiNombre.setVisible(false);
			
		}else if(e.getSource() == btnMostrarNombre){
			etiNombre.setVisible(true);
		}
		// se condiciona para la ciudad 
		if (e.getSource() == btnMostrarCiudad) {
			etiCiudad.setVisible(true);
			
		}else if(e.getSource() == btnOcultarCiudad){
			etiCiudad.setVisible(false);
		}
	}
}
