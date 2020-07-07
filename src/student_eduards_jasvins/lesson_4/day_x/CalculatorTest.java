package student_eduards_jasvins.lesson_4.day_x;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
    }
    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);
        assertResult("Sum", actualResult, 75);
    }
    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sub(firstNumber, secondNumber);
        assertResult("Sub", actualResult, 20);
    }
    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.mul(firstNumber, secondNumber);
        assertResult("Mul", actualResult, 25);
    }
    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int actualResult = calculator.div(firstNumber, secondNumber);
        assertResult("div", actualResult, 5);
    }
    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(3);
        if (actualResult) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
    private void assertResult(String name, int actualResult, int expectedResult){
        if (actualResult == expectedResult) {
            System.out.println(name + " test = OK");
        } else {
            System.out.println(name + " test = FAIL");
        }
    }

}
