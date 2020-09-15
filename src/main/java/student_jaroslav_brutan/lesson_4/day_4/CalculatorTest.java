package student_jaroslav_brutan.lesson_4.day_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multiplyTest();
        calculatorTest.maxOfNumbersTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
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

    public void subTest() {
        int firstNumber = 15;
        int secondNumber = 8;                                   // tozhe neponimaju pocemu fail?!
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 7) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 5;
        int secondNumber = 5;                                   // neponimaju pocemu test fail?!
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 25) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void isEvenTest() {
        int firstNumber = 6;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FALSE");
        }
    }

    public void maxOfNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 12;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 12) {
            System.out.println("Second number is bigger!");
        } else if (result == 10) {
            System.out.println("First number is bigger!");
        } else {
            System.out.println("Numbers are equal!");
        }
    }

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("First number is bigger!");
        } else {
            System.out.println("Test is false!");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 8;
        int secondNumber = 10;
        int thirdNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Second number is bigger!");
        } else {
            System.out.println("Test is false!");
        }
    }
    public void maxOfThreeNumbersTest3() {
        int firstNumber = 8;
        int secondNumber = 9;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Third number is bigger!");
        } else {
            System.out.println("Test is false!");
        }
    }
    public void maxOfThreeNumbersTest4() {
        int firstNumber = 8;
        int secondNumber = 8;
        int thirdNumber = 6;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 8) {
            System.out.println("First and second numbers are equal!");
        } else {
            System.out.println("Test is false!");
        }
    }
    public void maxOfThreeNumbersTest5(){
        int firstNumber = 6;
        int secondNumber = 8;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber,thirdNumber);
        if (result == 8) {
            System.out.println("Second and third numbers are equals!");
        } else {
            System.out.println("Test is false!");
        }
    }
    public void maxOfThreeNumbersTest6(){
        int firstNumber = 8;
        int secondNumber = 6;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == 8) {
            System.out.println("First and third numbers are equal!");
        } else {
            System.out.println("Test is false!");
        }
    }
    public void maxOfThreeNumbersTest7(){
        int firstNumber = 8;
        int secondNumber = 8;
        int thirdNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (result == 8) {
            System.out.println("All numbers are equals!");
        } else {
            System.out.println("Test is false!");
        }
    }
}