package student_roberts_kupcs.lesson_4.homework.level_4;

class CalculatorTest {
    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();

        calculatorTest.isEvenTestIsEven();
        calculatorTest.isEvenTestIsOdd();

        calculatorTest.maxTwoNumber1();
        calculatorTest.maxTwoNumber2();
        calculatorTest.maxTwoNumber3();

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

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 4;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 20) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTestIsEven() {

        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(12);

        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }

    public void isEvenTestIsOdd() {

        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(7);

        if (!result) {
            System.out.println("isOdd test = OK");
        } else {
            System.out.println("isOdd test = FAIL");
        }
    }

    public void maxTwoNumber1() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxTwoNumber(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("первое число больше второго maxTwoNumber test = OK");
        } else {
            System.out.println("первое число больше второго maxTwoNumber test = FAIL");
        }

    }
    public void maxTwoNumber2() {
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxTwoNumber(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("второе число больше первого maxTwoNumber test = OK");
        } else {
            System.out.println("второе число больше первого maxTwoNumber test = FAIL");
        }

    }
    public void maxTwoNumber3() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxTwoNumber(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("оба числа равны maxTwoNumber test = OK");
        } else {
            System.out.println("оба числа равны maxTwoNumber test = FAIL");
        }

    }

}
