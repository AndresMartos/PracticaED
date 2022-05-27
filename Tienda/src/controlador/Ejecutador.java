package controlador;

import vista.Dashboard;
import vista.Ventana;

/**
 * 
 * @author Diego, Carlos y Andrés
 *
 */
public class Ejecutador {

	/**
	 * Clase principal del programa, donde se ejecutan el resto de acciones.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana ventana = new Ventana();
		ventana.cargarVentana(ventana);
	}

}
