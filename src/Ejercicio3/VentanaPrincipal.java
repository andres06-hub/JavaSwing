package Ejercicio3;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements ActionListener,KeyListener{

// Se instancian las clases para asi crear los objetos
	private JPanel contentPanel;
	private JTextField txtTexto;
	private JButton btnVaciar;
	private JLabel etiTexto1;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 362);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);

		// Se llama el metodo que contiene los objetos del panel
		contenidoPanel();
		
	}
	
	public void contenidoPanel(){
		
		txtTexto = new JTextField();
		txtTexto.setBackground(Color.LIGHT_GRAY);
		txtTexto.setFont(new Font("Dialog", Font.PLAIN, 19));
		txtTexto.setBounds(78, 37, 369, 32);
		contentPanel.add(txtTexto);
		// Asignamos el escuchador para que nos escuche el evento
		txtTexto.addKeyListener(this);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setBackground(Color.GRAY);
		etiTexto1.setOpaque(true);
		etiTexto1.setBounds(88, 124, 347, 32);
		contentPanel.add(etiTexto1);
		
		btnVaciar = new JButton("vaciar");
		btnVaciar.setBounds(189, 235, 117, 25);
		// Escuchador
		btnVaciar.addActionListener(this);
		contentPanel.add(btnVaciar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// condicionamos
		if (e.getSource() == btnVaciar) {
			etiTexto1.setText("");
			txtTexto.setText("");
		}
		
	}

//	
	@Override
	public void keyPressed(KeyEvent e) {
		// Condicionamos
		if (e.getSource() == txtTexto) {
			etiTexto1.setText(txtTexto.getText());
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
