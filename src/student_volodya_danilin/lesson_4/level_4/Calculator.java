package student_volodya_danilin.lesson_4.level_4;

import teacher.lesson_3.lessoncode.Phone;

public class Calculator {

    public int sum(int readNum1, int readNum2) {
        return readNum1 + readNum2;
    }

    public int difference(int readNum1, int readNum2) {
        return readNum1 - readNum2;
    }

    public int divide(int readNum1, int readNum2) {
        return readNum1 / readNum2;
    }
    public  int multiply(int readNum1, int readNum2) {
        return readNum1 * readNum2;
    }
    public boolean isEven(int readNum1) {
        if (readNum1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int maxOfTwoNumbers(int readNum1, int readNum2) {
        if (readNum1 > readNum2) {
            return readNum1;
        } else {
            return readNum2;
        }
    }

    public int maxOfThreeNumbers(int readNum1, int readNum2, int readNum3) {
        if ((readNum1 >= readNum2) && (readNum1 >= readNum3)) {
            return readNum1;
        } else if ((readNum2 >= readNum1) && (readNum2 >= readNum3)) {
            return readNum2;
        } else {
            return  readNum3;
        }
    }

}

class CalculatorTest {

    public static void main(String[] Args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        System.out.println();
        calculatorTest.maxOfTwoNumbersTest();
        System.out.println();
        calculatorTest.maxOfThreeNumbersTest();
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
    public void differenceTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.difference(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
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
        int result = calculator.divide(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Dicide test = FAIL");
        }

    }
    public void isEvenTest() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result == true) {
            System.out.println("Even/odd test = OK");
        } else {
            System.out.println("Even/odd test = FAIL");
        }
    }
    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;               // первое число больше второго
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("MaxOfTwoNumbers test1 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test2 = FAIL");
        }

        firstNumber = 10;                   // второе число больше первого
        secondNumber = 50;
        result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("MaxOfTwoNumbers test2 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test2 = FAIL");
        }

        firstNumber = 77;                   // оба числа равны
        secondNumber = 77;
        result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 77) {
            System.out.println("MaxOfTwoNumbers test3 = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test3 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 100;              // первое число больше второго и третьего
        int secondNumber = 20;
        int thirdNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 100) {
            System.out.println("MaxOfThreeNumbers test1 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test1 = FAIL");
        }

        firstNumber = 10;                   // второе число больше первого и третьего
        secondNumber = 120;
        thirdNumber = -10;
        result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 120) {
            System.out.println("MaxOfThreeNumbers test2 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test2 = FAIL");
        }

        firstNumber = 22;                   // третье число больше первого и второго
        secondNumber = 50;
        thirdNumber = 1000;
        result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 1000) {
            System.out.println("MaxOfThreeNumbers test3 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test3 = FAIL");
        }

        firstNumber = 100;                  // первые два равны и больше третьего
        secondNumber = 100;
        thirdNumber = 25;
        result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 100) {
            System.out.println("MaxOfThreeNumbers test4 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test4 = FAIL");
        }

        firstNumber = 500;                  // три числа равны
        secondNumber = 500;
        thirdNumber = 500;
        result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 500) {
            System.out.println("MaxOfThreeNumbers test5 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test5 = FAIL");
        }

        firstNumber = 33;                   // первое и третье числа равны
        secondNumber = 10;
        thirdNumber = 33;
        result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 33) {
            System.out.println("MaxOfThreeNumbers test6 = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test6 = FAIL");
        }
    }
}
