package controlador;

import vista.Dashboard;
import vista.Ventana;

/**
 * Ejecuta la aplicaci�n.
 * @author Diego, Carlos y Andr�s
 *
 */
public class Ejecutador {

	/**
	 * M�todo main desde el cual se ejecutan las ventanas.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana ventana = new Ventana();
		ventana.cargarVentana(ventana);
	}

}
