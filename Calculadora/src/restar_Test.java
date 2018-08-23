import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class restar_Test {
	Calculadora calc;
	@Before
	public void inicio(){
		calc=new Calculadora();
	}
	
	@Test
	public void testResta() {
		assertTrue(calc.restar(12, 4)>0);
	}
	
	@Test
	public void testResta2() {
		assertTrue(calc.restar(10, 15)<0);
	}
	
	@Test
	public void testRestaNegativo() {
		assertTrue(calc.restar(-10, -5)<0);
	}
}