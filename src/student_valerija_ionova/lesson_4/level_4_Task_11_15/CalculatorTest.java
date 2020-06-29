package student_valerija_ionova.lesson_4.level_4_Task_11_15;

/*Task12
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Test13 Добавьте в класс CalculatorTest тесты для этого метода.

Task14 Добавьте в класс CalculatorTest тесты для этого метода.
}*/

public class CalculatorTest {
    public static void main(String[] args) {

        //Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.substractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
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

    public void isEvenTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("iSEven test = FAIL");
        }

        result = calculator.isEven(secondNumber);
        if (!result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("iSEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }

        result = calculator.maxOfTwoNumbers(secondNumber, firstNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }

        result = calculator.maxOfTwoNumbers(firstNumber, 10);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }

    }

    public void maxOfThreeNumbersTest() {
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(1, 2, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(1, 1, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(1, 1, 1);
        if (result == 1) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(1, 0, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(1, 3, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(3, 1, 3);
        if (result == 3) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(5, 1, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(5, 5, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(5, 4, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(5, 3, 3);
        if (result == 5) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(1, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(8, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(10, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }

        result = calculator.maxOfThreeNumbers(3, 10, 3);
        if (result == 10) {
            System.out.println("maxOfThreeNumber test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = FAIL");
        }
    }


    }

