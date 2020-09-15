package student_jekaterina_loseva.lesson_6.level_1.task_1;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.testCalculator();
    }

    public void testCalculator() {
        Calculator calculator = new Calculator();
        int number = 4;
        if(number % 2 == 0) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FAIL");
        }
    }

}
