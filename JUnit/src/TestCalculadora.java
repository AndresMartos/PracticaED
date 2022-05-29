import junit.framework.TestCase;
/**
 * Clase que testea la calculadora para ver que hace bien sus m�todos.
 * @author Andr�s, Diego, Carlos
 *
 */
public class TestCalculadora extends TestCase{
	/**
	 * M�todo que comprueba que la suma est� bien.
	 */
	public void testSuma() {
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.sumar(2, 2)==(2+2));
	}
	/**
	 * M�todo que comprueba que la resta est� bien.
	 */
	public void testResta() {
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.resta(2, 2)==0);
	}
}
