package student_aleksandra_maksimovic.lesson_6.level_1.task_1;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testIsEvenTrue();
        calculatorTest.testIsEvenFalse();
    }
    public void testIsEvenTrue() {
        Calculator calculator = new Calculator();

        if (calculator.isEven(8)) {
            System.out.println("Test is even : Passed");
        } else {
            System.out.println("Test is even : FAILED");
        }

    }

    public void testIsEvenFalse() {
        Calculator calculator = new Calculator();

        if (!calculator.isEven(7)) {
            System.out.println("Test is even : Passed");
        } else {
            System.out.println("Test is even : FAILED");
        }

    }
}

