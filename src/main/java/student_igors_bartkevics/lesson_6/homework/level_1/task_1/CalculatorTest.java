/*
Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Подсказка:

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        // по аналогии реализуйте тесты для остальных методов
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

}
 */
package student_igors_bartkevics.lesson_6.homework.level_1.task_1;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.isOddTest();
        calculatorTest.firstNumberMax();
        calculatorTest.secondNumberMax();
        calculatorTest.twoEqualNumbers();
        calculatorTest.firstBiggerThanSecondAndThird();
        calculatorTest.secondBiggerThanFirstAndThird();
        calculatorTest.thirdBiggerThanFirstAndSecond();
        calculatorTest.firstEqualSecondAndBiggerThanThird();
        calculatorTest.secondEqualThirdAndBiggerThanFirst();
        calculatorTest.firstEqualThirdAndBiggerThanSecond();
        calculatorTest.firstEqualSecondAndSmallerThanThird();
        calculatorTest.secondEqualThirdAndSmallerThanFirst();
        calculatorTest.firstEqualThirdAndSmallerThanSecond();
        calculatorTest.threeEqualNumbers();

    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        String testName = "Sum";
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        checkResult(result == expectedResult, testName);
    }

    public void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        String testName = "Subtraction";
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        checkResult(result == expectedResult, testName);
    }

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        String testName = "Multiplication";
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        checkResult(result == expectedResult, testName);
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        String testName = "Division";
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        checkResult(result == expectedResult, testName);
    }

    public void isEvenTest() {
        int number = 10;
        String testName = "Is even";
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        checkResult(result, testName);

    }

    public void isOddTest() {
        int number = 5;
        String testName = "Is odd";
        Calculator calculator = new Calculator();
        boolean result = !calculator.isEven(number);
        checkResult(result, testName);
    }

    public void firstNumberMax() { // first number is bigger than second
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        String testName = "First number max";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(result == expectedResult, testName);
    }

    public void secondNumberMax() { // second number is bigger than first
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        String testName = "Second number max";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(result == expectedResult, testName);
    }

    public void twoEqualNumbers() { // equal two numbers
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        String testName = "Equal numbers";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(result == expectedResult, testName);
    }

    /*  - первое число больше второго и третьего
        - второе число больше первого и третьего
        - третье число больше первого и второго
        - первые два равны и больше третьего
        - второе и третье равны и больше первого
        - первое и третье равны и больше второго
        - первые два равны и меньше третьего
        - второе и третье равны и меньше первого
        - первое и третье равны и меньше второго
        - все три числа равны
     */

    public void firstBiggerThanSecondAndThird() { //- первое число больше второго и третьего
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 0;
        int expectedResult = 10;
        String testName = "First number bigger than second and third";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void secondBiggerThanFirstAndThird() { //- второе число больше первого и третьего
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 0;
        int expectedResult = 10;
        String testName = "Second number bigger than first and third";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void thirdBiggerThanFirstAndSecond() { //- третье число больше первого и второго
        int firstNumber = 5;
        int secondNumber = 0;
        int thirdNumber = 10;
        int expectedResult = 10;
        String testName = "Third number bigger than first and second";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void firstEqualSecondAndBiggerThanThird() { //- первые два равны и больше третьего
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        String testName = "First number equals second and bigger than third";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void secondEqualThirdAndBiggerThanFirst() { //- второе и третье равны и больше первого
        int firstNumber = 0;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        String testName = "Second number equals third and bigger than first";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void firstEqualThirdAndBiggerThanSecond() { //- первое и третье равны и больше второго
        int firstNumber = 10;
        int secondNumber = 0;
        int thirdNumber = 10;
        int expectedResult = 10;
        String testName = "First number equals third and bigger than second";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void firstEqualSecondAndSmallerThanThird() { //- первые два равны и меньше третьего
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 10;
        int expectedResult = 10;
        String testName = "First number equals second and smaller than third test";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void secondEqualThirdAndSmallerThanFirst() { //- второе и третье равны и меньше первого
        int firstNumber = 10;
        int secondNumber = 0;
        int thirdNumber = 0;
        int expectedResult = 10;
        String testName = "Second number equal third and smaller than first";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void firstEqualThirdAndSmallerThanSecond() { //- первое и третье равны и меньше второго
        int firstNumber = 0;
        int secondNumber = 10;
        int thirdNumber = 0;
        int expectedResult = 10;
        String testName = "First number equal third and smaller than second";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

    public void threeEqualNumbers() { //- все три числа равны
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        String testName = "Three equal numbers";
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(result == expectedResult, testName);
    }

}
