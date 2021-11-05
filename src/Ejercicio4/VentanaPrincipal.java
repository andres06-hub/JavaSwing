package Ejercicio4;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;

	private JTextField txtNombre;
	private JTextField txtCiudad;

	private JButton btnAceptar;
	private JButton btnDesactivar;
	private JButton btnActivar;

	private JLabel lblNombre;
	private JLabel lblCiudad;
	private JLabel txtFrase;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Llamamos el contenido de la ventana
		contenidoVentana();

	}

	// MEtodo que contendra el contenido del programa
	public void contenidoVentana() {

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(174, 12, 70, 27);
		contentPane.add(lblNombre);

		lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(177, 85, 70, 16);
		contentPane.add(lblCiudad);

		txtNombre = new JTextField();
		txtNombre.setBackground(Color.LIGHT_GRAY);
		txtNombre.setBounds(65, 39, 299, 34);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBackground(Color.LIGHT_GRAY);
		txtCiudad.setBounds(65, 113, 299, 34);
		contentPane.add(txtCiudad);

		txtFrase = new JLabel("");
		txtFrase.setHorizontalAlignment(SwingConstants.CENTER);
		txtFrase.setBackground(Color.LIGHT_GRAY);
		txtFrase.setBounds(12, 180, 423, 34);
		txtFrase.setOpaque(true);
		contentPane.add(txtFrase);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(35, 257, 117, 25);
		contentPane.add(btnAceptar);

		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setBounds(174, 257, 117, 25);
		contentPane.add(btnDesactivar);

		btnActivar = new JButton("Activar");
		btnActivar.setBounds(318, 257, 117, 25);
		contentPane.add(btnActivar);

		// Se guardan los objetos btn en un array
		JButton[] btnList = { btnAceptar, btnActivar, btnDesactivar };
		// Pasamos por cada uno y lo hacemos escuchar
		for (JButton jButton : btnList) {
			jButton.addActionListener(this);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Condicionamos

		if (e.getSource() == btnAceptar) {
			// Obtenemos el dato recibido de txtNombre
			String datoNombre = txtNombre.getText();
			// Obtenemos el dato recibido de txtCiudad
			String datoCiudad = txtCiudad.getText();
			
			// Validamos si NO ingreso datos vacios
			if (datoNombre.length() > 0 && datoCiudad.length() > 0) {
				// Asignamos el mensaje a moctrar 
				txtFrase.setText("Su nombre es '"+datoNombre+"' y vive en '"+datoCiudad+"'");
				txtFrase.setForeground(Color.BLACK);
			
			}else{// Si los datos estan vacios
				txtFrase.setText("XXX Datos vacios XXX");
				txtFrase.setForeground(Color.RED);
			}
		}


		// Si da click en el boton desactivar
		if (e.getSource() == btnDesactivar) {
			// DESACTIVAMOS las entradas de datos
			txtNombre.setEnabled(false);
			txtNombre.setBackground(Color.BLACK);
			txtCiudad.setEnabled(false);
			txtCiudad.setBackground(Color.BLACK);
			System.out.println("-- Desactivado : El ingreso de datos --");
			// Si da click en el boton Activar
		} else if (e.getSource() == btnActivar) {
			// ACTIVAMOS las entradas de datos
			txtNombre.setEnabled(true);
			txtNombre.setBackground(Color.LIGHT_GRAY);
			txtCiudad.setEnabled(true);
			txtCiudad.setBackground(Color.LIGHT_GRAY);
			System.out.println("** Activado : El ingreso de datos **");
		}

	}
}
