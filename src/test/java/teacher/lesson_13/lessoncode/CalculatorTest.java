package teacher.lesson_13.lessoncode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void init() {
		calculator = new Calculator();
	}

	@Test
	public void add1() {
		int result = calculator.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void add2() {
		int result = calculator.add(7, 3);
		assertEquals(10, result);
	}

	@Test
	public void assertTrueExample() {
		boolean result = true;
		assertEquals(true, result);

		assertTrue(result);
		//assertFalse(result);
	}

}