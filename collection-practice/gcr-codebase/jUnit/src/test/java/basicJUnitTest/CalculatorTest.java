package basicJUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class CalculatorTest {
	Calculator calc = new Calculator();

	@Test
	public void add() {
		assertEquals(10, calc.add(6, 4));
	}
	
	@Test
	public void subtract() {
		assertEquals(2, calc.subtract(6, 4));
	}
	
	@Test
	public void multiply() {
		assertEquals(24, calc.multiply(6, 4));
	}
	
	@Test
	public void divide() {
		assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
		assertEquals(3, calc.divide(6, 2));
	}
	
}
