

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticTest {
	
	@Test
	public void shouldSumTwoNumbers() throws Exception {
		Arithmetic arithmetic = new Arithmetic(1, 2);
		
		long actual = arithmetic.calculate("+");
		
		assertEquals(3, actual);
	}

}
