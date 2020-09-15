package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class CalculatorTest3 {

    public static void main(String[] args) {
        CalculatorTest3 calculatorTest = new CalculatorTest3();
        calculatorTest.multiplyTest();
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
}

