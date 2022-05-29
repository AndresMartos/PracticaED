import junit.framework.TestCase;

public class TestCalculadora extends TestCase{
	
	public void testSuma() {
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.sumar(2, 2)==(2+2));
	}
	
	public void testResta() {
		Calculadora calculadora = new Calculadora();
		assertTrue(calculadora.resta(2, 2)==0);
	}
}
