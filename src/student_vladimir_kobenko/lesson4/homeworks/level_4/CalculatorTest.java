package student_vladimir_kobenko.lesson4.homeworks.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
    }
// Task 12
    public void sumTest() {
        int firstNumber = 100;
        int secondNumber = 25;
        Calculator calculator = new Calculator();
        int resultSum = calculator.sum(firstNumber, secondNumber);
        if (resultSum == 125) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
        int resultSub = calculator.subtraction(firstNumber, secondNumber);
        if (resultSub == 75) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
        int resultMulti = calculator.multiply(firstNumber, secondNumber);
        if (resultMulti == 2500) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }

        double resultDev = calculator.division(firstNumber, secondNumber);
        if (resultDev == 4) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
// Task 13
        boolean resultEven1 = calculator.isEven1(firstNumber);
        if (resultEven1 == true) {
            System.out.println("Test result = The first number is even");
        } else {
            System.out.println("Test result = The first number is NOT even");
        }
        boolean resultEven2 = calculator.isEven2(secondNumber);
        if (resultEven2 == true) {
            System.out.println("Test result = The second number is even");
        } else {
            System.out.println("Test result = The second number is NOT even");
        }

// Task 14
        int resultMaxOfTwoNumbers = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
            if (resultMaxOfTwoNumbers == 0) {
                System.out.println("The biggest number is #1");
            } else if (resultMaxOfTwoNumbers == 1){
                System.out.println("The biggest number is #2");
            } else {
            System.out.println("The numbers are equal");
        }

        firstNumber = 35;
        secondNumber = 55;

        int resultMaxOfTwoNumbers1 = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (resultMaxOfTwoNumbers1 == 0) {
            System.out.println("The biggest number is #1");
        } else if (resultMaxOfTwoNumbers1 == 1){
            System.out.println("The biggest number is #2");
        } else {
            System.out.println("The numbers are equal");
        }

        firstNumber = 20;
        secondNumber = 20;

        int resultMaxOfTwoNumbers2 = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (resultMaxOfTwoNumbers2 == 0) {
            System.out.println("The biggest number is #1");
        } else if (resultMaxOfTwoNumbers2 == 1){
            System.out.println("The biggest number is #2");
        } else {
            System.out.println("The numbers are equal");
        }


        // Task 15
        int thirdNumber = 5;
        int resultMaxOfThreeNumbers = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (resultMaxOfThreeNumbers == 0) {
            System.out.println("The biggest of 3 numbers is #1");
        }
        else if (resultMaxOfThreeNumbers == 1){
            System.out.println("The biggest of 3 numbers is #2");
        }
        else if (resultMaxOfThreeNumbers == 2) {
            System.out.println("The biggest of 3 numbers is #3");
        }
        else {
            System.out.println("The numbers are equal");
        }

        }
    }