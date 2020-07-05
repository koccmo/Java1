package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class CalculatorTest5 {

    public static void main(String[] args) {
        CalculatorTest5 calculatorTest = new CalculatorTest5();
        calculatorTest.isEvenTest();
    }

    public void isEvenTest() {

        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(8);
        if (result) {
            System.out.println("Even test = OK ");
        } else {
            System.out.println("Even test = FAIL");
        }
    }
}

