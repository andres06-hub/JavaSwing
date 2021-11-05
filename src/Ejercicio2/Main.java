package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		// Se trata de crear el objeto
		try {			
			new VentanaPrincipal().setVisible(true);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
