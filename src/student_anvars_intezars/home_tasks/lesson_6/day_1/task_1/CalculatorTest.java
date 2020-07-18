package student_anvars_intezars.home_tasks.lesson_6.day_1.task_1;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
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
