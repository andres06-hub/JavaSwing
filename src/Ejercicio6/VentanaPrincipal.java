package Ejercicio6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener, MouseListener {

	private JPanel contentPanel;
	private JLabel etiNombre;
	private JButton btnEsquina;
	private JButton btnCentro;
	private JButton btnAgrandar;
	private JButton btnAchicar;

	
	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setBackground(UIManager.getColor("EditorPane.caretForeground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 468);
		contentPanel = new JPanel();
		contentPanel.setBackground(UIManager.getColor("RadioButton.disabledText"));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		// Se llama el contenido de la ventana
		contenidoVentana();
	}
	
	// Se crea metodo que contendra el contenido del panel
	public void contenidoVentana() {
		
		etiNombre = new JLabel("Andres Sierra");
		etiNombre.setBackground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		etiNombre.setOpaque(true);
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(228, 24, 152, 40);
		contentPanel.add(etiNombre);
		
		// Se crean los botones
		btnEsquina = new JButton("Esquina");
		btnEsquina.setBounds(42, 342, 117, 40);
		contentPanel.add(btnEsquina);
		
		btnCentro = new JButton("Centro");
		btnCentro.setBounds(189, 342, 117, 40);
		contentPanel.add(btnCentro);
		
		btnAgrandar = new JButton("Agrandar");
		btnAgrandar.setBounds(327, 342, 117, 40);
		contentPanel.add(btnAgrandar);
		
		btnAchicar = new JButton("Achicar");
		btnAchicar.setBounds(468, 342, 117, 40);
		contentPanel.add(btnAchicar);
		
		// Se guardan los botones en un array
		JButton[] btnList = {btnEsquina, btnCentro, btnAgrandar, btnAchicar};		
		// Pasamos por cada elemento
		for(JButton boton : btnList){
			// 
			boton.addActionListener(this);
			boton.addMouseListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// 
		if(e.getSource() == btnEsquina){
			// La etiqueta cambiara de posicion "Esquina" 

			/**
			 * -> setLocation()
			 * Este metodo le da la posicion al objeto 
			 *
			 */
			// etiNombre.setLocation(465, 0);
			etiNombre.setLocation(0, 0);

		}else if(e.getSource() == btnCentro){
			// La etiqueta cambiara de posicion "Centro"
			etiNombre.setLocation(217, 171);

		}else if(e.getSource() == btnAgrandar){
			// La etiqueda cambiara de tamaño -"Agrandar"
			/**
			 * -> setSize()
			 * Le da el tamaño al objeto
			 * 
			 */
			etiNombre.setSize(200, 100);

		}else if(e.getSource() == btnAchicar){
			// La etiqueta cambiara de posicion "Centro"
			etiNombre.setSize(117, 40);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Cuando el cursor pase por encima 

		// Boton "Esquina"
		if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(125, 50);
			// btnEsquina.preferredSize(200, 100);

		// Boton "Centro"
		}else if(e.getSource() == btnCentro){
			btnCentro.setSize(125,50);

		// Boton "Agrandar"
		}else if(e.getSource() == btnAgrandar){
			btnAgrandar.setSize(125, 50);

		// Boton "Achicar"
		}else if(e.getSource() == btnAchicar){
			btnAchicar.setSize(125, 50);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Cuando el cursor salga del boton 

		// Boton "Esquina"
		if (e.getSource() == btnEsquina) {
			btnEsquina.setSize(117, 40);
			// btnEsquina.preferredSize(200, 100);

		// Boton "Centro"
		}else if(e.getSource() == btnCentro){
			btnCentro.setSize(117, 40);

		// Boton "Agrandar"
		}else if(e.getSource() == btnAgrandar){
			btnAgrandar.setSize(117, 40);

		// Boton "Achicar"
		}else if(e.getSource() == btnAchicar){
			btnAchicar.setSize(117, 40);
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
