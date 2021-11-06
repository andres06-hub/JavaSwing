package Ejercicio11;
// package domain;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
// SE IMPORTA LOS ESCUCHADORES DEL MOUSE
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
// ***************************************
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPrincipal extends JFrame implements MouseListener{

//	SE CREAN LAS INSTANCIAS PARA LA CREACION DE LOS OBJETOS
	private JPanel contentPane;
	private JTextField textSalida;
	private JLabel lblTitle;
	private JLabel lblCero;
	private JLabel lblUno;
	private JLabel lblDos;
	private JLabel lblTres;
	private JLabel lblCuatro;
	private JLabel lblCinco;
	private JLabel lblSeis;
	private JLabel lblSiete;
	private JLabel lblOcho;
	private JLabel lblNueve;
	private JButton btnBorrar;
	

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		// Se crea el objeto
		contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 444);
		contentPane.setToolTipText("");
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// SE CREA EL OBJETO Titulo
		lblTitle = new JLabel("Ejemplo 11");
		// 
		lblTitle.setBounds(133, 28, 276, 26);
		lblTitle.setFont(new Font("OCR A Extended", Font.PLAIN, 24));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle);
		
		// SE CREA EL OBJETO Numero '0'
		lblCero = new JLabel("0");
		lblCero.setBounds(264, 272, 22, 22);
		lblCero.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblCero.setToolTipText("");
		lblCero.setForeground(Color.BLACK);
		contentPane.add(lblCero);
		
		lblUno = new JLabel("1");
		lblUno.setBounds(97, 220, 15, 26);
		lblUno.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblUno.setToolTipText("");
		lblUno.setForeground(Color.BLACK);
		contentPane.add(lblUno);
		
		lblDos = new JLabel("2");
		lblDos.setBounds(264, 220, 22, 22);
		lblDos.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblDos.setToolTipText("");
		lblDos.setForeground(Color.BLACK);
		contentPane.add(lblDos);
		
		lblTres = new JLabel("3");
		lblTres.setBounds(429, 220, 22, 22);
		lblTres.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblTres.setToolTipText("");
		lblTres.setForeground(Color.BLACK);
		contentPane.add(lblTres);
		
		lblCuatro = new JLabel("4");
		lblCuatro.setBounds(97, 168, 15, 22);
		lblCuatro.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblCuatro.setToolTipText("");
		lblCuatro.setForeground(Color.BLACK);
		contentPane.add(lblCuatro);
		
		lblCinco = new JLabel("5");
		lblCinco.setBounds(264, 168, 22, 22);
		lblCinco.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblCinco.setToolTipText("");
		lblCinco.setForeground(Color.BLACK);
		contentPane.add(lblCinco);
		
		lblSeis = new JLabel("6");
		lblSeis.setBounds(429, 168, 22, 22);
		lblSeis.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblSeis.setToolTipText("");
		lblSeis.setForeground(Color.BLACK);
		contentPane.add(lblSeis);
		
		lblSiete = new JLabel("7");
		lblSiete.setBounds(97, 118, 22, 22);
		lblSiete.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblSiete.setToolTipText("");
		lblSiete.setForeground(Color.BLACK);
		contentPane.add(lblSiete);
		
		lblOcho = new JLabel("8");
		lblOcho.setBounds(264, 118, 22, 22);
		lblOcho.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblOcho.setToolTipText("");
		lblOcho.setForeground(Color.BLACK);
		contentPane.add(lblOcho);
		
		lblNueve = new JLabel("9");
		lblNueve.setBounds(429, 118, 22, 22);
		lblNueve.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		lblNueve.setToolTipText("");
		lblNueve.setForeground(Color.BLACK);
		contentPane.add(lblNueve);
		
		textSalida = new JTextField();
		textSalida.setBounds(22, 335, 328, 42);
		textSalida.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		contentPane.add(textSalida);
		textSalida.setColumns(10);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(360, 334, 91, 42);
		contentPane.add(btnBorrar);
		btnBorrar.addMouseListener(this);
		
		
		// SE CREA UN ARRAY PARA QUE EL MOUSELISTENER ESCUCHE LOS OBJETOS
		JLabel[] listObjetos= { lblCero, lblUno, lblDos, lblTres, lblCuatro, lblCinco, lblSeis, lblSiete, lblOcho, lblNueve };
		
		// PASAMOS POR CADA UNO Y AGREGAMOS EL ESCUCHADOR
		for (JLabel objeto : listObjetos) {
			// SE PASA POR CADA UNO DE LOS ELEMENTOS DEL ARRAY
			objeto.addMouseListener(this);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == btnBorrar) {
			textSalida.setText("");
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


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

		// Se simplifica lo que hay abajo
		if(e.getSource().getClass() == JLabel.class) {
			JLabel label = (JLabel)e.getSource();
			textSalida.setText(textSalida.getText() + label.getText());
		}

		// Validamos cada numero, cada Jlabel en el cual el mouse se puede parar

		/* if (e.getSource() == lblCero) {
			System.out.println("0");
			textSalida.setText(textSalida.getText() + "0");
		}else if (e.getSource() == lblUno) {
			System.out.println("1");
			textSalida.setText(textSalida.getText() + "1");
		}else if (e.getSource() == lblDos) {
			System.out.println("2");
			textSalida.setText(textSalida.getText() + "2");
		}else if (e.getSource() == lblTres) {
			System.out.println("3");
			textSalida.setText(textSalida.getText() + "3");
		}else if (e.getSource() == lblCuatro) {
			System.out.println("4");
			textSalida.setText(textSalida.getText() + "4");
		}else if (e.getSource() == lblCinco) {
			System.out.println("5");
			textSalida.setText(textSalida.getText() + "5");
		}else if (e.getSource() == lblSeis) {
			System.out.println("6");
			textSalida.setText(textSalida.getText() + "6");
		}else if (e.getSource() == lblSiete) {
			System.out.println("7");
			textSalida.setText(textSalida.getText() + "7");
		}else if (e.getSource() == lblOcho) {
			System.out.println("8");
			textSalida.setText(textSalida.getText() + "8");
		}else if (e.getSource() == lblNueve) {
			System.out.println("9");
			textSalida.setText(textSalida.getText() + "9");
		} */
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
