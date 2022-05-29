import junit.framework.TestCase;
/**
 * Clase que testea la calculadora para ver que hace bien sus métodos.
 * @author Andrés, Diego, Carlos
 *
 */
public class TestCalculadora extends TestCase{
	/**
	 * Método que comprueba que la suma esté bien.
	 */
	public void testSuma() {
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.sumar(2, 2)==(2+2));
	}
	/**
	 * Método que comprueba que la resta esté bien.
	 */
	public void testResta() {
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.resta(2, 2)==0);
	}
}
