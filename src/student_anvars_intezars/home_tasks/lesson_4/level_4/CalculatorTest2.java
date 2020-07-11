package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class CalculatorTest2 {

    public static void main(String[] args) {
        CalculatorTest2 calculatorTest = new CalculatorTest2();
        calculatorTest.subtractionTest();
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }
}
