package student_dmitrijs_jasvins.lesson_4.day_4;

// assert - utverzdenie(proverka)

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.resultAddition();
        calculatorTest.resultSubtraction();
        calculatorTest.resultMultiplication();
        calculatorTest.resultDivision();
        calculatorTest.isEvenOrNot();
        calculatorTest.maxOfTwoNumbers();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumberTest3();
        calculatorTest.maxOfThreeNumbersTest();
        calculatorTest.maxOfThreeNumberTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();

    }

    public void resultAddition() {

        int firstNumber = 5;
        int secondNumber = 5;

        Calculator calculator = new Calculator();
        int actualResult = calculator.addition(firstNumber, secondNumber);
        assertResult("Addition", actualResult, 10);
    }

    public void resultSubtraction() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtraction(firstNumber, secondNumber);
        assertResult("Subtraction", actualResult, 0);

    }

    public void resultMultiplication() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiplication(firstNumber, secondNumber);
        assertResult("Multiplication", actualResult, 25);

    }

    public void resultDivision() {
        double firstNumber = 5;
        double secondNumber = 5;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divison(firstNumber, secondNumber);
        assertResult("Division", actualResult, 1);

    }

    public void isEvenOrNot() {
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(3);
        if (actualResult) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 6;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        assertResult("maxOfTwoNumber", actualResult, 6);
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 4;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        assertResult("maxOfTwoNumberTest2", actualResult, 5);

    }

    public void maxOfTwoNumberTest3() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        assertResult("maxOfTwoNumberTest3", actualResult, 5);
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 7;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        assertResult("maxOfThreeNumbersTest", actualResult, 10);
    }

    public void maxOfThreeNumberTest2() {
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        assertResult("maxOfThreeNumbersTest2", actualResult, 10);
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        assertResult("maxOfThreeNumbersTest3", actualResult, 10);
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        assertResult("maxOfThreeNumbersTest4", actualResult, 2);
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 6;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        assertResult("maxOfThreeNumbersTest5", actualResult, 6);
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int actualResult = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        assertResult("maxOfThreeNumbersTest6", actualResult, 2);
    }

    private void assertResult(String name, int actualResult, int expectedResult) {
        if (actualResult == expectedResult) {
            System.out.println(name + " test = OK");
        } else {
            System.out.println(name + " test = FAIL");
        }
    }

    private void assertResult(String name, double actualResult, double expectedResult) {
        if (actualResult == expectedResult) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }
}