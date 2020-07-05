package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class CalculatorTest6 {

    public static void main(String[] args) {
        CalculatorTest6 calculatorTest = new CalculatorTest6();
        calculatorTest.maxOfTwoNumbersTest();
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 5;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {

            System.out.println("maxOfTwoNumbers test = OK ");
        } else {
            System.out.println("maxOfTwoNumbers = FAIL");
        }
    }
}

