package teacher.lesson_13.lessoncode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add1() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		assertEquals(3, result);
	}

	@Test
	public void add2() {
		Calculator calculator = new Calculator();
		int result = calculator.add(7, 3);
		assertEquals(10, result);
	}

}