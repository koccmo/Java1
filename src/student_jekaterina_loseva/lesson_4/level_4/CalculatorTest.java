package student_jekaterina_loseva.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
        calculatorTest.maxOfThreeNumbersTest8();
        calculatorTest.maxOfThreeNumbersTest9();
        calculatorTest.maxOfThreeNumbersTest10();
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

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
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

    public void isEvenTest() {
        int number = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers test1 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test1 = FAIL");
        }
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers test2 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test2 = FAIL");
        }
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers test3 = OK");
        } else {
            System.out.println("maxOfTwoNumbers test3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test1 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test1 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test2 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test2 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test3 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 15;
        int secondNumber = 15;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test4 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test4 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test5 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test5 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 15;
        int secondNumber = 15;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test6 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test6 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest7() {
        int firstNumber = 15;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test7 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test7 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest8() {
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test8 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test8 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest9() {
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test9 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test9 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest10() {
        int firstNumber = 15;
        int secondNumber = 15;
        int thirdNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 15) {
            System.out.println("maxOfThreeNumbers test10 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test10 = FAIL");
        }
    }
}


