package Ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;

public class VentanaPrincipal extends JFrame implements MouseListener {

// Se crean las instancias de las clases para crear los objetos
	private JPanel contentPane;
	
	private JLabel etiPal2;
	private JLabel etiPal1;
	private JLabel etiPal3;
	private JLabel etiPal4;
	private JLabel etiOcultar;


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setBackground(UIManager.getColor("Button.light"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 376);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		contenidoVentana();
		
	}
	// Se crea metodo donde estaran los objetos de la ventana
	public void contenidoVentana() {
		
		etiPal1 = new JLabel("HOLA");
		etiPal1.setBackground(Color.LIGHT_GRAY);
		etiPal1.setOpaque(true);
		etiPal1.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal1.setBounds(12, 48, 131, 55);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel("HOLA");
		etiPal2.setOpaque(true);
		etiPal2.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal2.setBackground(Color.LIGHT_GRAY);
		etiPal2.setBounds(173, 48, 131, 55);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("HOLA");
		etiPal3.setOpaque(true);
		etiPal3.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal3.setBackground(Color.LIGHT_GRAY);
		etiPal3.setBounds(332, 48, 131, 55);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("HOLA");
		etiPal4.setOpaque(true);
		etiPal4.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal4.setBackground(Color.LIGHT_GRAY);
		etiPal4.setBounds(491, 48, 131, 55);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setBackground(UIManager.getColor("Button.focus"));
		etiOcultar.setOpaque(true);
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setBounds(176, 220, 287, 55);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
	}


	
//	Metodos del escuchador
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	

	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// Si pasa por encima de la itiqueta ocultar
		if(e.getSource() == etiOcultar) {
			// Se crea un array para guardar los objetos a ocultar
			JLabel[] etiList = {etiPal1, etiPal2, etiPal3, etiPal4};
			// Pasamos por cada objeto asignando 
			for (JLabel jLabel : etiList) {	
				// Las etiquetas se ocultaran		
				jLabel.setVisible(false);
			}
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// Si sale de la etiqueta 'Ocultar'
		if (e.getSource() == etiOcultar) {
			//// Se crea un array para guardar los objetos a ocultar
			JLabel[] etiList = {etiPal1, etiPal2, etiPal3, etiPal4};
			// Pasamos por cada objeto asignando 
			for (JLabel jLabel : etiList) {
				// Las etiquetas se mostran
				jLabel.setVisible(true);
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
