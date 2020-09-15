package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class CalculatorTest4 {

    public static void main(String[] args) {
        CalculatorTest4 calculatorTest = new CalculatorTest4();
        calculatorTest.divisionTest();
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }
}

