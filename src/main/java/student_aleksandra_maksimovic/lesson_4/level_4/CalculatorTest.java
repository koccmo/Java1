package student_aleksandra_maksimovic.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.additionTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTestIsEven();
        calculatorTest.isEvenTestIsOdd();
        calculatorTest.maxOfTwoNumbersTestFirstBiggest();
        calculatorTest.maxOfTwoNumbersTestSecondBiggest();
        calculatorTest.maxOfTwoNumbersTestBothEqual();
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

    public void additionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.addition(firstNumber, secondNumber);
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
            System.out.println("subtraction test = OK");
        } else {
            System.out.println("subtraction test = FAIL");
        }
    }
    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        double result = calculator.division(firstNumber, secondNumber);
        if(result == 2) {
            System.out.println("division test = OK");
        } else {
            System.out.println("division test = FAIL");
        }
    }
    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("multiply test = OK");
        } else {
            System.out.println("multiply test = FAIL");
        }
    }
    public void isEvenTestIsEven() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(16);
        if (result) {
            System.out.println("isEvent test = OK");
        } else {
            System.out.println("isEvent test = FAIL");
        }
    }
    public void isEvenTestIsOdd() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(15);
        if (!result) {
            System.out.println("isEvent test = OK");
        } else {
            System.out.println("isEvent test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestFirstBiggest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestSecondBiggest() {
        int firstNumber = 5;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }
    public void maxOfTwoNumbersTestBothEqual() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }
    public void maxOfThreeNumbersTest1() { // - ???????????? ?????????? ???????????? ?????????????? ?? ????????????????
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 0;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 1 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 1 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest2() {// - ???????????? ?????????? ???????????? ?????????????? ?? ????????????????
        int firstNumber = 0;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 2 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 2 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest3() { // - ???????????? ?????????? ???????????? ?????????????? ?? ??????????????
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 3 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 3 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest4() { // - ???????????? ?????? ?????????? ?? ???????????? ????????????????
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 4 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 4 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest5() { // - ???????????? ?????? ?????????? ?? ???????????? ??????????????
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 5 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 5 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest6() { // - ???????????? ?? ???????????? ?????????? ?? ???????????? ??????????????
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 6 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 6 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest7() { // - ???????????? ?????? ?????????? ?? ???????????? ????????????????
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 7 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 7 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest8() { // - ???????????? ?????? ?????????? ?? ???????????? ??????????????
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 8 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 8 = FAIL");
        }
    }
    public void maxOfThreeNumbersTest9() { // - ???????????? ?? ???????????? ?????????? ?? ???????????? ??????????????
        int firstNumber = 0;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 9 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 9 = FAIL");
        }
    }

    public void maxOfThreeNumbersTest10() { // - ?????? ?????????? ??????????
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 2){
            System.out.println("maxOfThreeNumbers test 10 = OK");
        } else {
            System.out.println("maxOfThreeNumbers test 10 = FAIL");
        }
    }

}