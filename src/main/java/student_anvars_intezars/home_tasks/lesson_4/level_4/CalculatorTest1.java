package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class CalculatorTest1 {

    public static void main(String[] args) {
        CalculatorTest1 calculatorTest = new CalculatorTest1();
        calculatorTest.sumTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }



}


