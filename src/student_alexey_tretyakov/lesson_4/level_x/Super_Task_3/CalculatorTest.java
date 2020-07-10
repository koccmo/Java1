package student_alexey_tretyakov.lesson_4.level_x.Super_Task_3;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest(35,40,75);
        calculatorTest.subTest(35,15,20);
        calculatorTest.mulTest(5,5,25);
        calculatorTest.divTest(40,8,5);
        calculatorTest.isEvenTest(40,true);
    }
    public void sumTest(int firstNumber,int secondNumber,int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        testResult (result == expectedResult,"Sum test - ");
    }

    public void subTest( int firstNumber,int secondNumber,int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        testResult (result == expectedResult,"Sub test - ");
    }
    public void mulTest(int firstNumber,int secondNumber,int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        testResult (result == expectedResult,"Mul test - ");
    }
    public void divTest(int firstNumber,int secondNumber,int expectedResult) {
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        testResult (result == expectedResult,"Div test - ");
    }
    public void isEvenTest(int testValue,boolean expectedResult) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(testValue);
        testResult (result == expectedResult,"isEven test - ");
    }
    private void testResult(boolean checkTest, String testingString ) {
        if (checkTest) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }
}
