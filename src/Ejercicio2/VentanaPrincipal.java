package Ejercicio2;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;


public class VentanaPrincipal extends JFrame implements ActionListener{

// se instancia las clases para poder crear los objetos
	private JPanel contentPane;
	
	private JTextField txtEntrada;
	
	private JLabel etiTexto1;
	private JLabel lblNumeracionTxt1;
	private JLabel etiTexto2;
	private JLabel lblNumeracionTxt2;

	private JButton btnTraspasa1;
	private JButton btnTraspasa2;
	private JLabel lblEntrada;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        // Llamamos el metodo que contiene el contemido del panel
        contenidoVentana();
	}
    
    public void contenidoVentana(){
        
    	lblEntrada = new JLabel("Entrada");
        lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
        lblEntrada.setFont(new Font("Dialog", Font.BOLD, 20));
        lblEntrada.setBounds(175, 12, 123, 32);
        contentPane.add(lblEntrada);

        txtEntrada = new JTextField();
        txtEntrada.setBounds(24, 56, 484, 42);
		txtEntrada.setFont(new Font("OCR A Extended", Font.PLAIN, 25));
		contentPane.add(txtEntrada);

        etiTexto1 = new JLabel("");
        etiTexto1.setBackground(Color.LIGHT_GRAY);
        etiTexto1.setOpaque(true);
        etiTexto1.setFont(new Font("Dialog", Font.BOLD, 18));
        etiTexto1.setHorizontalAlignment(SwingConstants.CENTER);
        etiTexto1.setBounds(118, 127, 312, 34);
        contentPane.add(etiTexto1);
        
        lblNumeracionTxt1 = new JLabel("Texto 1 >>");
        lblNumeracionTxt1.setBounds(24, 127, 97, 28);
        contentPane.add(lblNumeracionTxt1);
        
        etiTexto2 = new JLabel("");
        etiTexto2.setOpaque(true);
        etiTexto2.setHorizontalAlignment(SwingConstants.CENTER);
        etiTexto2.setFont(new Font("Dialog", Font.BOLD, 18));
        etiTexto2.setBackground(Color.LIGHT_GRAY);
        etiTexto2.setBounds(118, 173, 312, 34);
        contentPane.add(etiTexto2);
        
        lblNumeracionTxt2 = new JLabel("Texto 2 >>");
        lblNumeracionTxt2.setBounds(24, 173, 97, 28);
        contentPane.add(lblNumeracionTxt2);
        
        btnTraspasa1 = new JButton("Traspasa 1");
        btnTraspasa1.setBounds(42, 232, 117, 25);
        contentPane.add(btnTraspasa1);
        
        btnTraspasa2 = new JButton("Traspasa 2");
        btnTraspasa2.setBounds(368, 232, 117, 25);
        contentPane.add(btnTraspasa2);
        
        // Guardamos los objetos en un array
        
        JButton[] btnList = {btnTraspasa1, btnTraspasa2};
        // Pasamos por cada uno asignandole el escuchador
        for (JButton jButton : btnList) {
			jButton.addActionListener(this);
		}
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// condionamos 
		if (e.getSource() == btnTraspasa1) {
			String cadenaIngresada = txtEntrada.getText();
			etiTexto1.setText(cadenaIngresada);
		}else if(e.getSource() == btnTraspasa2){
			String cadenaIngresada = txtEntrada.getText();
			etiTexto2.setText(cadenaIngresada);

        }
		
	}
}
