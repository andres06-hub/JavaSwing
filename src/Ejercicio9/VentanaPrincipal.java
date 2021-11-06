package Ejercicio9;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;

public class VentanaPrincipal extends JFrame implements ActionListener {

//	Se instancian las clases para la creacion de objetos
	private JPanel contentPane;

	private JTextField txtPrimerTrimestre;
	private JTextField txtSegundoTrimestre;
	private JTextField txtTercerTrimestre;
	private JLabel etiNotaFinal;
	private JLabel etiResultado;
	private JButton btnCalcular;
	private JLabel lbltrimestre1;
	private JLabel lbltrimestre3;
	private JLabel lbltrimestre2;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Se llama el metodo que contendra el contenido
		contenidoVentana();
		
	}
	
	//	Se crea metodo donde contendra el contenido del panel
	public void contenidoVentana() {
		
		// Objetos del panel
		lbltrimestre1 = new JLabel("1) Trimestre");
		lbltrimestre1.setBounds(117, 37, 85, 34);
		contentPane.add(lbltrimestre1);
		
		lbltrimestre3 = new JLabel("3) Trimestre");
		lbltrimestre3.setBounds(117, 149, 85, 34);
		contentPane.add(lbltrimestre3);
		
		lbltrimestre2 = new JLabel("2) Trimestre");
		lbltrimestre2.setBounds(117, 95, 85, 34);
		contentPane.add(lbltrimestre2);
		
		txtPrimerTrimestre = new JTextField();
		txtPrimerTrimestre.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtPrimerTrimestre.setBounds(242, 37, 107, 34);
		contentPane.add(txtPrimerTrimestre);
		txtPrimerTrimestre.setColumns(10);
		
		txtSegundoTrimestre = new JTextField();
		txtSegundoTrimestre.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtSegundoTrimestre.setBounds(242, 94, 107, 35);
		contentPane.add(txtSegundoTrimestre);
		txtSegundoTrimestre.setColumns(10);
		
		txtTercerTrimestre = new JTextField();
		txtTercerTrimestre.setFont(new Font("Dialog", Font.PLAIN, 20));
		txtTercerTrimestre.setBounds(242, 149, 107, 34);
		contentPane.add(txtTercerTrimestre);
		txtTercerTrimestre.setColumns(10);
		
		etiNotaFinal = new JLabel("Nota Final");
		etiNotaFinal.setFont(new Font("Dialog", Font.BOLD, 16));
		etiNotaFinal.setVerticalAlignment(SwingConstants.BOTTOM);
		etiNotaFinal.setHorizontalAlignment(SwingConstants.CENTER);
		etiNotaFinal.setBounds(66, 212, 136, 34);
		contentPane.add(etiNotaFinal);
		
		etiResultado = new JLabel("Resultado");
		etiResultado.setFont(new Font("Dialog", Font.BOLD, 16));
		etiResultado.setVerticalAlignment(SwingConstants.BOTTOM);
		etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
		etiResultado.setBounds(308, 212, 198, 34);
		contentPane.add(etiResultado);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(230, 320, 117, 34);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Validamos
		if(e.getSource() == btnCalcular){
			// Se llama el metodo procesos
			proceso();
		}
		
	}
	
//	Metodo donde se hara todo el proceso (LOGICA)
	public void proceso(){
		
		// Creamos las variables globales
		double notaTrimestre1 = 0;
		double notaTrimestre2 = 0;
		double notaTrimestre3 = 0;

		/**
		 * Obtenemos los datos ingresados por el usuario
		 * 
		 * Como todo loq ue entra entra c
		 * omo String
		 * Entonces los datos los tratamos de pasar tipo numerico (DOUBLE)
		 */
		try {
			notaTrimestre1 = Double.parseDouble(txtPrimerTrimestre.getText());
			notaTrimestre2 = Double.parseDouble(txtSegundoTrimestre.getText());
			notaTrimestre3 = Double.parseDouble(txtTercerTrimestre.getText()); 
		} catch (Exception exc) {
			System.out.println("Hubo un error Al convertir los datos");
		}
		// Calculamos el promedio
		double media = (notaTrimestre1 + notaTrimestre2 + notaTrimestre3) / 3;
		
		// Definimos en la rtiqueta "Nota Final" la nota final
		etiNotaFinal.setText(media+"");

		// Validamos
		if(media >= 5){
			// Asignamos lo siguiente
			etiNotaFinal.setForeground(Color.BLACK);
			etiResultado.setText("APROBADO");
			etiResultado.setForeground(Color.BLACK);
		}else{
			// De caso contrario 
			// Asignamos lo siguiente
			etiNotaFinal.setForeground(Color.RED);
			etiResultado.setText("SUSPENSO");
			etiResultado.setForeground(Color.RED);
		}
	}


}
