package student_dmitrijs_jasvins.lesson_4.day_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.resultAddition();
        calculatorTest.resultSubtraction();
        calculatorTest.resultMultiplication();
        calculatorTest.resultDivison();
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
        if (actualResult == 10) {
            System.out.println("Addition test = OK");
        } else {
            System.out.println("Addition test = FAIL");
        }
    }

    public void resultSubtraction() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtraction(firstNumber, secondNumber);
        if (actualResult == 0) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subraction test = FAIL");
        }
    }

    public void resultMultiplication() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiplication(firstNumber, secondNumber);
        if (actualResult == 25) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void resultDivison() {
        double firstNumber = 5;
        double secondNumber = 5;
        Calculator calculator = new Calculator();
        double actualResult = calculator.divison(firstNumber, secondNumber);
        if (actualResult == 1) {
            System.out.println("Divison test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
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
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 4;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int maxOfTwoNumbers = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (maxOfTwoNumbers == secondNumber) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void maxOfTwoNumberTest3() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int maxOfTwoNumbers = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (maxOfTwoNumbers == secondNumber) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 7;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int maxOfTwoNumbers = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (maxOfTwoNumbers == firstNumber && maxOfTwoNumbers > secondNumber && maxOfTwoNumbers > thirdNumber) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void maxOfThreeNumberTest2() {
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int maxOfThreeNumber = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumber == secondNumber && maxOfThreeNumber > firstNumber && maxOfThreeNumber > thirdNumber) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == thirdNumber && maxOfThreeNumbers > firstNumber && maxOfThreeNumbers > secondNumber) {
            System.out.println("Test 3 = OK ");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == firstNumber && maxOfThreeNumbers == secondNumber && maxOfThreeNumbers > thirdNumber) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 4;
        int secondNumber = 6;
        int thirdNumber = 6;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == secondNumber && maxOfThreeNumbers == thirdNumber && maxOfThreeNumbers > firstNumber) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int maxOfThreeNumbers = calculator.maxOfThreeNumber(firstNumber, secondNumber, thirdNumber);
        if (maxOfThreeNumbers == firstNumber && maxOfThreeNumbers == secondNumber && maxOfThreeNumbers == thirdNumber) {
            System.out.println("Test 6 = OK");
        } else {
            System.out.println("Test 6 = FAIL");
        }
    }
}