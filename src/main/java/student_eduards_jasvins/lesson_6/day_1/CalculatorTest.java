package student_eduards_jasvins.lesson_6.day_1;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testIsEven();
        calculatorTest.testIsNotEven();
    }

    public void testIsEven() {
        Calculator calculator = new Calculator();
        if (calculator.isEven(4)){
            System.out.println("Test1 = OK");
        } else {
            System.out.println("Test1 = FAIL");
        }
    }
    public void testIsNotEven() {
        Calculator calculator = new Calculator();
        if (calculator.isEven(5)) {
            System.out.println("Test2 = OK");
        }else {
            System.out.println("Test2 = FAIL");
        }
    }





}
