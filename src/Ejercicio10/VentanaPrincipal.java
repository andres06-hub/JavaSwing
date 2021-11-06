package Ejercicio10;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame implements ActionListener {

	// Se crean las instancias de las clases
	private JPanel contentPane;
	
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JTextField etiTexto;
	
	private JButton btnConcatena;
	private JLabel lblTexto1;
	private JLabel lblTexto2;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		//Contenido del panel
		contenidoVentana();
	}
	
	// Se crea metodo que contendra le contenido e la ventana
	public void contenidoVentana() {
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtPalabra1.setBounds(28, 104, 242, 45);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(296, 104, 250, 45);
		contentPane.add(txtPalabra2);
		
		btnConcatena = new JButton("Concatena");
		btnConcatena.setBounds(221, 193, 145, 35);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
		etiTexto = new JTextField();
		etiTexto.setFont(new Font("Dialog", Font.PLAIN, 25));
		etiTexto.setBounds(28, 273, 518, 45);
		contentPane.add(etiTexto);
		etiTexto.setColumns(10);
		
		lblTexto1 = new JLabel("Texto ");
		lblTexto1.setBounds(101, 66, 79, 26);
		contentPane.add(lblTexto1);
		
		lblTexto2 = new JLabel("Texto ");
		lblTexto2.setBounds(370, 66, 79, 26);
		contentPane.add(lblTexto2);
		
	}

	// Se hara el proceso de concatenar
	public void procesoConcatenar(){

		// Obtenemos los datos ingresados por el usuario
		String primeraPalabra = txtPalabra1.getText();
		String segundaPalabra = txtPalabra2.getText();

		// Le pasamos las palabras a etiTexto(salida)
		// y las concatenamos
		etiTexto.setText(primeraPalabra+segundaPalabra);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnConcatena) {
			// Llamamos el metodo de concatenar
			procesoConcatenar();
		}
		
	}

}
