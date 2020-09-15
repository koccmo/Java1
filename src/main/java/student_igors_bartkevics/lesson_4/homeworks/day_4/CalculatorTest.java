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
package student_igors_bartkevics.lesson_4.homeworks.day_4;

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

    public void multiplicationTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
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
            System.out.println("Is even test = OK");
        } else {
            System.out.println("Is even test = FAIL");
        }
    }

    public void isOddTest() {
        int number = 5;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Is odd test = FAIL");
        }
        else {
            System.out.println("Is odd test = OK");
        }
    }

    public void firstNumberMax() { // first number is bigger than second
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("First number max test = OK");
        }
        else {
            System.out.println("First number max test = Fail");
        }
    }

    public void secondNumberMax() { // second number is bigger than first
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Second number max test = OK");
        }
        else {
            System.out.println("Second number max test = Fail");
        }
    }

    public void twoEqualNumbers() { // equal two numbers
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Equal numbers test = OK");
        }
        else {
            System.out.println("Equal numbers test = Fail");
        }
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
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("First number bigger than second and third test = OK");
        }
        else {
            System.out.println("First number bigger than second and third test = Fail");
        }
    }

    public void secondBiggerThanFirstAndThird() { //- второе число больше первого и третьего
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 0;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Second number bigger than first and third test = OK");
        }
        else {
            System.out.println("Second number bigger than first and third test = Fail");
        }
    }

    public void thirdBiggerThanFirstAndSecond() { //- третье число больше первого и второго
        int firstNumber = 5;
        int secondNumber = 0;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Third number bigger than first and second test = OK");
        }
        else {
            System.out.println("Third number bigger than first and second test = Fail");
        }
    }

    public void firstEqualSecondAndBiggerThanThird() { //- первые два равны и больше третьего
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 5;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("First number equal second and bigger than third test = OK");
        }
        else {
            System.out.println("First number equal second and bigger than third test = Fail");
        }
    }

    public void secondEqualThirdAndBiggerThanFirst() { //- второе и третье равны и больше первого
        int firstNumber = 0;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Second number equal third and bigger than first test = OK");
        }
        else {
            System.out.println("Second number equal third and bigger than first test = Fail");
        }
    }

    public void firstEqualThirdAndBiggerThanSecond() { //- первое и третье равны и больше второго
        int firstNumber = 10;
        int secondNumber = 0;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("First number equal third and bigger than second test = OK");
        }
        else {
            System.out.println("First number equal third and bigger than second test = Fail");
        }
    }

    public void firstEqualSecondAndSmallerThanThird() { //- первые два равны и меньше третьего
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("First number equal second and smaller than third test = OK");
        }
        else {
            System.out.println("First number equal second and smaller than third test = Fail");
        }
    }

    public void secondEqualThirdAndSmallerThanFirst() { //- второе и третье равны и меньше первого
        int firstNumber = 10;
        int secondNumber = 0;
        int thirdNumber = 0;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Second number equal third and smaller than first test = OK");
        }
        else {
            System.out.println("Second number equal third and smaller than first test = Fail");
        }
    }

    public void firstEqualThirdAndSmallerThanSecond() { //- первое и третье равны и меньше второго
        int firstNumber = 0;
        int secondNumber = 10;
        int thirdNumber = 0;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("First number equal third and smaller than second test = OK");
        }
        else {
            System.out.println("First number equal third and smaller than second test = Fail");
        }
    }

    public void threeEqualNumbers() { //- все три числа равны
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        Calculator calculator = new Calculator();

        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 10) {
            System.out.println("Three equal numbers test = OK");
        }
        else {
            System.out.println("Three equal numbers test = Fail");
        }
    }

}
