import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class sumar_Test {
	Calculadora calc;
	@Before
	public void inicio(){
		calc=new Calculadora();
	}

	@Test
	public void testSuma() {
		assertEquals(5, calc.sumar(2, 3), 0);
	}
	
	@Test
	public void testSumaNegativa() {
		assertTrue(calc.sumar(-5, -7)<0);
	}
	
	@Test
	public void testMaxValue(){
		assertEquals(Double.MAX_VALUE+1, calc.sumar(Double.MAX_VALUE, 20), 0);
	}
	
	@Test
	public void testPositivoNegativo(){
		double a=15;
		double b=-9;
		assertTrue(calc.sumar(a, b)<a);
	}
}
