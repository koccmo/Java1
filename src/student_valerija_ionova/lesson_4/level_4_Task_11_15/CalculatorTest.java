package student_valerija_ionova.lesson_4.level_4_Task_11_15;

/*Task12
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Test13 Добавьте в класс CalculatorTest тесты для этого метода.

Task14 Добавьте в класс CalculatorTest тесты для этого метода.
}*/

class CalculatorTest {
    public static void main(String[] args) {

        //Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.substractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTestTrue();
        calculatorTest.isEvenTestFalse();
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
        calculatorTest.maxOfThreeNumbersTest11();
        calculatorTest.maxOfThreeNumbersTest12();
        calculatorTest.maxOfThreeNumbersTest13();
        calculatorTest.maxOfThreeNumbersTest14();

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

    public void substractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.substract(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Substract test = OK");
        } else {
            System.out.println("Substract test = FAIL");
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

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        double result = calculator.divide(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void isEvenTestTrue() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("iSEven test = FAIL");
        }
    }

    public void isEvenTestFalse() {
        int secondNumber = 5;
        Calculator calculator = new Calculator();

        boolean result = calculator.isEven(secondNumber);
        if (!result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("iSEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers 1 test = OK");
        } else {
            System.out.println("maxOfTwoNumbers 1 test = FAIL");
        }


    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(secondNumber, firstNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers 2 test = OK");
        } else {
            System.out.println("maxOfTwoNumbers 2 test = FAIL");
        }

    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, 10);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers 3 test = OK");
        } else {
            System.out.println("maxOfTwoNumbers 3 test = FAIL");
        }

    }

    public void maxOfThreeNumbersTest1() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(1, 2, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber 1 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 1 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(1, 1, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber 2 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 2 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(1, 1, 1);
        if (result == 1) {
            System.out.println("maxOfThreeNumber 3 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 3 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest4() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(1, 0, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber 4 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 4 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest5() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(1, 3, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber 5 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 5 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest6() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(3, 1, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber 6 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 6 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest7() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(5, 1, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber 7 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 7 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest8() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(5, 5, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber 8 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 8 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest9() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(5, 4, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber 9 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 9 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest10() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(5, 3, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber 10 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 10 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest11() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(1, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber 11 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 11 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest12() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(8, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber 12 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 12 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest13() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(10, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber 13 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 13 test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest14() {
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(3, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber 14 test = OK");
        } else {
            System.out.println("maxOfThreeNumbers 14 test = FAIL");
        }
    }


    }

