package student_sandra_arniece.lesson_4.level_4; //Task 12,13,14,15

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionWithPositiveNumbersTest();
        calculatorTest.additionWithNegativeNumberTest();
        calculatorTest.additionWithTwoNegativeNumbersTest();
        calculatorTest.additionWithZeroTest();
        calculatorTest.divisionWithPositiveNumbersTest();
        calculatorTest.divisionWithNegativeNumberTest();
        calculatorTest.divisionWithTwoNegativeNumbersTest();
        calculatorTest.subtractionWithPositiveNumbersTest();
        calculatorTest.subtractionWithNegativeNumberTest();
        calculatorTest.subtractionWithTwoNegativeNumbersTest();
        calculatorTest.subtractionWithZeroTest();
        calculatorTest.multiplicationTestWithPositiveNumbers();
        calculatorTest.multiplicationTestWithNegativeNumber();
        calculatorTest.multiplicationTestWithTwoNegativeNumbers();
        calculatorTest.multiplicationTestWithZero();
        calculatorTest.evenTestWithEvenNumber();
        calculatorTest.evenTestWithOddNumber();
        calculatorTest.evenTestWithZeroNumber();
        calculatorTest.maxOfTwoTest1();
        calculatorTest.maxOfTwoTest2();
        calculatorTest.maxOfTwoTest3();
        calculatorTest.maxOfThreeTest1();
        calculatorTest.maxOfThreeTest2();
        calculatorTest.maxOfThreeTest3();
        calculatorTest.maxOfThreeTest4();
        calculatorTest.maxOfThreeTest5();
        calculatorTest.maxOfThreeTest6();
        calculatorTest.maxOfThreeTest7();
    }

    public void additionWithPositiveNumbersTest() {
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstInteger, secondInteger);
        if (result == 15) {
            System.out.println("OK on Addition with positive numbers test");
        } else {
            System.out.println("FAIL on Addition with positive numbers test");
        }
    }

    public void additionWithNegativeNumberTest() {
        int firstInteger = 10;
        int secondInteger = -5;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstInteger, secondInteger);
        if (result == 5) {
            System.out.println("OK on Addition with negative number test");
        } else {
            System.out.println("FAIL on Addition with negative number test");
        }
    }

    public void additionWithTwoNegativeNumbersTest() {
        int firstInteger = -10;
        int secondInteger = -5;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstInteger, secondInteger);
        if (result == -15) {
            System.out.println("OK on Addition with two negative numbers test");
        } else {
            System.out.println("FAIL on Addition with two negative numbers test");
        }
    }

    public void additionWithZeroTest() {
        int firstInteger = 10;
        int secondInteger = 0;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstInteger, secondInteger);
        if (result == 10) {
            System.out.println("OK on Addition with zero test");
        } else {
            System.out.println("FAIL on Addition with zero test");
        }
    }

    public void divisionWithPositiveNumbersTest() {
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstInteger, secondInteger);
        if (result == 2) {
            System.out.println("OK on Division with positive numbers test");
        } else {
            System.out.println("FAIL on Division with positive numbers test");
        }
    }

    public void divisionWithNegativeNumberTest() {
        int firstInteger = -10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstInteger, secondInteger);
        if (result == -2) {
            System.out.println("OK on Division with negative number test");
        } else {
            System.out.println("FAIL on Division with negative number test");
        }
    }

    public void divisionWithTwoNegativeNumbersTest() {
        int firstInteger = -10;
        int secondInteger = -5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstInteger, secondInteger);
        if (result == 2) {
            System.out.println("OK on Division with two negative number test");
        } else {
            System.out.println("FAIL on Division with two negative number test");
        }
    }

    public void subtractionWithPositiveNumbersTest() {
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstInteger, secondInteger);
        if (result == 5) {
            System.out.println("OK on Subtraction with positive number test");
        } else {
            System.out.println("FAIL on Subtraction with positive number test");
        }
    }

    public void subtractionWithNegativeNumberTest() {
        int firstInteger = 10;
        int secondInteger = -5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstInteger, secondInteger);
        if (result == 15) {
            System.out.println("OK on Subtraction with negative number test");
        } else {
            System.out.println("FAIL on Subtraction with negative number test");
        }
    }

    public void subtractionWithTwoNegativeNumbersTest() {
        int firstInteger = -5;
        int secondInteger = -10;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstInteger, secondInteger);
        if (result == 5) {
            System.out.println("OK on Subtraction with two negative numbers test");
        } else {
            System.out.println("FAIL on Subtraction with two negative numbers test");
        }
    }

    public void subtractionWithZeroTest() {
        int firstInteger = 10;
        int secondInteger = 0;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstInteger, secondInteger);
        if (result == 10) {
            System.out.println("OK on Subtraction with zero test");
        } else {
            System.out.println("FAIL on Subtraction with zero test");
        }
    }

    public void multiplicationTestWithPositiveNumbers() {
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstInteger, secondInteger);
        if (result == 50) {
            System.out.println("OK on Multiplication with positive number test");
        } else {
            System.out.println("FAIL on Multiplication with positive number test");
        }
    }

    public void multiplicationTestWithNegativeNumber() {
        int firstInteger = 10;
        int secondInteger = -5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstInteger, secondInteger);
        if (result == -50) {
            System.out.println("OK on Multiplication with negative number test");
        } else {
            System.out.println("FAIL on Multiplication with negative number test");
        }
    }

    public void multiplicationTestWithTwoNegativeNumbers() {
        int firstInteger = -10;
        int secondInteger = -5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstInteger, secondInteger);
        if (result == 50) {
            System.out.println("OK on Multiplication with two negative number test");
        } else {
            System.out.println("FAIL on Multiplication with two negative number test");
        }
    }

    public void multiplicationTestWithZero() {
        int firstInteger = 0;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstInteger, secondInteger);
        if (result == 0) {
            System.out.println("OK on Multiplication with zero test");
        } else {
            System.out.println("FAIL on Multiplication with zero test");
        }
    }

    public void evenTestWithEvenNumber() {
        int integer = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.even(integer);
        if (result) {
            System.out.println("OK on Even test with even number");
        } else {
            System.out.println("FAIL on Even test with even number");
        }
    }

    public void evenTestWithOddNumber() {
        int integer = -5;
        Calculator calculator = new Calculator();
        boolean result = calculator.even(integer);
        if (!result) {
            System.out.println("OK on Even test with odd number");
        } else {
            System.out.println("FAIL on Even test with odd number");
        }
    }

    public void evenTestWithZeroNumber() {
        int integer = 0;
        Calculator calculator = new Calculator();
        boolean result = calculator.even(integer);
        if (result) {
            System.out.println("OK on Even test with zero number");
        } else {
            System.out.println("FAIL on Even test with zero number");
        }
    }

    public void maxOfTwoTest1() {
        int firstInteger = 10;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(firstInteger, secondInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfTwo test 1");
        } else {
            System.out.println("FAIL on MaxOfTwo test 1");
        }
    }

    public void maxOfTwoTest2() {
        int firstInteger = 5;
        int secondInteger = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(firstInteger, secondInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfTwo test 2");
        } else {
            System.out.println("FAIL on MaxOfTwo test 2");
        }
    }

    public void maxOfTwoTest3() {
        int firstInteger = 5;
        int secondInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwo(firstInteger, secondInteger);
        if (result == 5) {
            System.out.println("OK on MaxOfTwo test 3");
        } else {
            System.out.println("FAIL on MaxOfTwo test 3");
        }
    }

    public void maxOfThreeTest1() {
        int firstInteger = 10;
        int secondInteger = 5;
        int thirdInteger = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfThree test 1");
        } else {
            System.out.println("FAIL on MaxOfThree test 1");
        }
    }

    public void maxOfThreeTest2() {
        int firstInteger = 5;
        int secondInteger = 10;
        int thirdInteger = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfThree test 2");
        } else {
            System.out.println("FAIL on MaxOfThree test 2");
        }
    }

    public void maxOfThreeTest3() {
        int firstInteger = 1;
        int secondInteger = 5;
        int thirdInteger = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfThree test 3");
        } else {
            System.out.println("FAIL on MaxOfThree test 3");
        }
    }

    public void maxOfThreeTest4() {
        int firstInteger = 10;
        int secondInteger = 10;
        int thirdInteger = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfThree test 4");
        } else {
            System.out.println("FAIL on MaxOfThree test 4");
        }
    }

    public void maxOfThreeTest5() {
        int firstInteger = 10;
        int secondInteger = 5;
        int thirdInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfThree test 5");
        } else {
            System.out.println("FAIL on MaxOfThree test 5");
        }
    }

    public void maxOfThreeTest6() {
        int firstInteger = 10;
        int secondInteger = 5;
        int thirdInteger = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if (result == 10) {
            System.out.println("OK on MaxOfThree test 6");
        } else {
            System.out.println("FAIL on MaxOfThree test 6");
        }
    }

    public void maxOfThreeTest7() {
        int firstInteger = 5;
        int secondInteger = 5;
        int thirdInteger = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThree(firstInteger, secondInteger, thirdInteger);
        if (result == 5) {
            System.out.println("OK on MaxOfThree test 7");
        } else {
            System.out.println("FAIL on MaxOfThree test 7");
        }
    }

}
