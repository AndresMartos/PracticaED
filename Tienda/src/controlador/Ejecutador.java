package controlador;

import vista.Dashboard;
import vista.Ventana;

/**
 * Ejecuta la aplicación.
 * @author Diego, Carlos y Andrés
 *
 */
public class Ejecutador {

	/**
	 * Método main desde el cual se ejecutan las ventanas.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana ventana = new Ventana();
		ventana.cargarVentana(ventana);
	}

}
