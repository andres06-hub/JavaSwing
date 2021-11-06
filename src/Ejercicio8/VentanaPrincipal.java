package Ejercicio8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaPrincipal extends JFrame implements ActionListener{
	
// Se Instanca las clases para si poder crear despues los objetos
	private JPanel contentPane;

	private JLabel etiTexto;
	
	private JButton btnAzul;
	private JButton btnRojo;
	private JButton btnFondoRojo;
	private JButton btnFondoAzul;
	private JButton btnVerde;
	private JButton btnFondoVerder;
	private JButton btnTransparente;
	private JButton btnOpaca;


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// llamamos el metodo
		contenidoVentana();
	}
	
	// Metodo que contendra el contenido de la ventana
	public void contenidoVentana(){
		// 
		etiTexto = new JLabel("HOLII");
		etiTexto.setFont(new Font("Courier 10 Pitch", Font.BOLD, 27));
		etiTexto.setOpaque(true);
		etiTexto.setVerticalAlignment(SwingConstants.BOTTOM);
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(235, 41, 155, 37);
		contentPane.add(etiTexto);
		
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(104, 181, 117, 33);
		contentPane.add(btnAzul);
		
		btnRojo = new JButton("Rojo");
		btnRojo.setBounds(263, 181, 117, 33);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(415, 181, 130, 33);
		contentPane.add(btnVerde);
		
		btnFondoAzul = new JButton("Fondo Azul");
		btnFondoAzul.setBounds(104, 246, 117, 37);
		contentPane.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("Fondo Rojo");
		btnFondoRojo.setBounds(263, 246, 117, 37);
		contentPane.add(btnFondoRojo);
		
		btnFondoVerder = new JButton("Fondo Verder");
		btnFondoVerder.setBounds(415, 246, 130, 37);
		contentPane.add(btnFondoVerder);
		
		btnTransparente = new JButton("Transparente");
		btnTransparente.setBounds(174, 313, 141, 37);
		contentPane.add(btnTransparente);
		
		btnOpaca = new JButton("Opaca");
		btnOpaca.setBounds(361, 313, 130, 37);
		contentPane.add(btnOpaca);
		
		// Hacemos los escuchadores
		// Guardamos los botones en un array
		JButton[] btnList = {btnAzul, btnRojo, btnVerde, btnFondoAzul, btnFondoRojo, btnFondoVerder, btnTransparente, btnOpaca};
		// Pasamos por cada elemento del array asignandole el escuchador
		for(JButton boton : btnList){
			boton.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAzul){
			etiTexto.setForeground(Color.BLUE);
		}
		if(e.getSource() == btnRojo){
			etiTexto.setForeground(Color.RED);
		}
		if (e.getSource() == btnVerde) {
			etiTexto.setForeground(Color.GREEN);
		}
		if(e.getSource() == btnFondoAzul){
			//
			// etiTexto.setOpaque(true);
			etiTexto.setBackground(Color.BLUE);
		}
		if(e.getSource() == btnFondoRojo){
			//
			// etiTexto.setOpaque(true);
			etiTexto.setBackground(Color.RED);
		}
		if(e.getSource() == btnFondoVerder){
			//
			// etiTexto.setOpaque(true);
			etiTexto.setBackground(Color.GREEN);
		}
		if(e.getSource() == btnTransparente){
			// La etiqueta dejara de ser Opaqua
			etiTexto.setOpaque(false);
		}
		if (e.getSource() == btnOpaca) {
			// La etiqueta se vuelve opaca
			etiTexto.setOpaque(true);
		}
	}
}
