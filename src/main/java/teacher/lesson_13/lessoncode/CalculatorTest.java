package teacher.lesson_13.lessoncode;

public class CalculatorTest {

	public static void main(String[] args) {
		CalculatorTest test = new CalculatorTest();
		test.add();
	}

	public void add() {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		if (result == 3) {
			System.out.println("OK");
		} else {
			System.out.println("FAIL");
		}
	}

}
