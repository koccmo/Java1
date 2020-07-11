package student_jekaterina_loseva.lesson_4.level_x;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest(40);
    }

    // checkResult() - более лучшее название для этого метода
    public void isResult(String nameOfTest, boolean isOk) {
        if (isOk) {
            System.out.println(nameOfTest + " = OK");
        } else {
            System.out.println(nameOfTest + " = FAIL");
        }
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int result = calculator.sum(firstNumber, secondNumber);
        isResult("SumTest", result == 75);
    }
    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        int result = calculator.sub(firstNumber, secondNumber);
        isResult("SubTest", result == 20);
    }
    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int result = calculator.mul(firstNumber, secondNumber);
        isResult("mulTest", result == 25);
    }
    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        int result = calculator.div(firstNumber, secondNumber);
        isResult("divTest", result == 5);
    }
    public void isEvenTest(int testValue) {
        boolean result = calculator.isEven(testValue);
        isResult("isEvenTest", result);
    }

}
