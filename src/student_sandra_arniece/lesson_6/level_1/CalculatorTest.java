package student_sandra_arniece.lesson_6.level_1;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.calculatorEvenNumberTest();
        calculatorTest.calculatorOddNumberTest();
        calculatorTest.calculatorNegativeNumberTest();
        calculatorTest.calculatorMaxNumberTest();
        calculatorTest.calculatorZeroTest();
    }

    public void calculatorEvenNumberTest() {
        int number = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(10);
        if (result) {
            System.out.println("OK on even");
        } else {
            System.out.println("FAIL on even");
        }
    }

    public void calculatorOddNumberTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(5);
        if (!result) {
            System.out.println("OK on odd");
        } else {
            System.out.println("FAIL on odd");
        }
    }

    public void calculatorNegativeNumberTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(-5);
        if (!result) {
            System.out.println("OK on negative");
        } else {
            System.out.println("FAIL on negative");
        }
    }

    public void calculatorMaxNumberTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(2147483647);
        if (!result) {
            System.out.println("OK on Max int");
        } else {
            System.out.println("FAIL on Max int");
        }
    }

    public void calculatorZeroTest() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(0);
        if (result) {
            System.out.println("OK on zero");
        } else {
            System.out.println("Fail on zero");
        }
    }

}
