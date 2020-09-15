package student_alexey_tretyakov.lesson_4.level_4;

public class CalculatorTest {

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
    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply (firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }
    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        double result = calculator.divide (firstNumber, secondNumber);
        if (result == 3.3333333333333335 ) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }
    public void isEvenTest() {
        int firstNumber = 11;

        Calculator calculator = new Calculator();

        if ( !calculator.isEven (firstNumber)  ) {
            System.out.println( "Even Test   = OK.");
        } else {
            System.out.println( "Even Test = FAIL.");
        }
    }
    public void maxOfTwoNumbersTest () {

        Calculator calculator = new Calculator();
        int firstNumber = 17;
        int secondNumber = 1;

        if ( calculator.maxOfTwoNumbers( firstNumber, secondNumber ) == 17 ) {
            System.out.println("Maximum of two number test = OK. ");
        } else {
            System.out.println("Maximum of two number test = Fail!");
        }

        firstNumber = 10;
        secondNumber = 15;
        if ( calculator.maxOfTwoNumbers( firstNumber, secondNumber ) == 15 ) {
            System.out.println("Maximum of two number test = OK. Second number is bigger.");
        } else {
            System.out.println("Maximum of two number test = Fail!");
        }

        firstNumber = 10;
        secondNumber = 10;
        if ( calculator.maxOfTwoNumbers( firstNumber, secondNumber ) == 0 ) {
            System.out.println("Equals of two number test = OK.");
        } else {
            System.out.println("Equals of two number test = Fail!");
        }


    }
    public void maxOfThreeTest() {
        // Test 1
        int int1 = 1;
        int int2 = 3;
        int int3 = 5;
        Calculator calculator = new Calculator();
        System.out.println("Now testing max of 3 numbers.");
        if ( calculator.maxOfThree(int1, int2, int3) == 5 ) {
            System.out.println("Test1 = OK.");
        } else {
            System.out.println("Test1 = Fail!");
        }
        // Test 2

        int1 = 7;
        int2 = 3;
        int3 = 1;
        if ( calculator.maxOfThree(int1, int2, int3) == 7 ) {
            System.out.println("Test2 = OK.");
        } else {
            System.out.println("Test2 = Fail!");
        }

        // Test 3
        int1 = 1;
        int2 = 5;
        int3 = 3;
        if ( calculator.maxOfThree(int1, int2, int3) == 5 ) {
            System.out.println("Test3 = OK.");
        } else {
            System.out.println("Test3 = Fail!");
        }

        // Test 4
        int1 = 1;
        int2 = 1;
        int3 = 3;
        if ( calculator.maxOfThree(int1, int2, int3) == 3 ) {
            System.out.println("Test4 = OK.");
        } else {
            System.out.println("Test4 = Fail!");
        }

        // Test 5
        int1 = 1;
        int2 = 3;
        int3 = 3;
        if ( calculator.maxOfThree(int1, int2, int3) == 3 ) {
            System.out.println("Test5 = OK.");
        } else {
            System.out.println("Test5 = Fail!");
        }

        // Test 6
        int1 = 1;
        int2 = 3;
        int3 = 1;
        if ( calculator.maxOfThree(int1, int2, int3) == 3 ) {
            System.out.println("Test6 = OK.");
        } else {
            System.out.println("Test6 = Fail!");
        }

        // Test 7
        int1 = 3;
        int2 = 1;
        int3 = 1;
        if ( calculator.maxOfThree(int1, int2, int3) == 3 ) {
            System.out.println("Test7 = OK.");
        } else {
            System.out.println("Test7 = Fail!");
        }

        // Test 8
        int1 = 3;
        int2 = 1;
        int3 = 3;
        if ( calculator.maxOfThree(int1, int2, int3) == 3 ) {
            System.out.println("Test8 = OK.");
        } else {
            System.out.println("Test8 = Fail!");
        }

        // Test 9
        int1 = 3;
        int2 = 3;
        int3 = 3;
        if ( calculator.maxOfThree(int1, int2, int3) == 3 ) {
            System.out.println("Test9 = OK.");
        } else {
            System.out.println("Test9 = Fail!");
        }

        // Test 10
        int1 = 5;
        int2 = 5;
        int3 = 3;
        if ( calculator.maxOfThree(int1, int2, int3) == 5 ) {
            System.out.println("Test10 = OK.");
        } else {
            System.out.println("Test10 = Fail!");
        }
    }


    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeTest();
    }
}
