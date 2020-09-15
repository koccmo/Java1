package student_eduards_jasvins.lesson_4.day_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenOrNot();
        calculatorTest.twoNumbersTest();
        calculatorTest.twoNumbersTest1();
        calculatorTest.twoNumbersTest2();
        calculatorTest.threeNumbersTest();
        calculatorTest.threeNumbersTest2();
        calculatorTest.threeNumbersTest3();
        calculatorTest.threeNumbersTest4();
        calculatorTest.threeNumbersTest5();
        calculatorTest.threeNumbersTest6();


    }
    public void sumTest() {
        int firstnumber = 10;
        int secondnumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstnumber, secondnumber);
        if (result == 15){
            System.out.println("Sum test = OK");
        }else{
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractionTest() {
        int firstnumber = 10;
        int seconumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstnumber, seconumber);
        if (result == 5){
            System.out.println("Subtraction test = OK");
        }else{
            System.out.println("Subtraction test = FAIL");
        }
    }
    public void multiplicationTest() {
        int firstnumber = 10;
        int secondnumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstnumber, secondnumber);
        if (result == 69){
            System.out.println("Multiplication test = OK");
        }else{
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void divisionTest() {
        int firstnumber = 25;
        int secondnumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstnumber, secondnumber);
        if (result == 4){
            System.out.println("Division test = OK");
        }else{
            System.out.println("Division test = FAIL");
        }
    }
    public void isEvenOrNot() {
        Calculator calculator = new Calculator();
        boolean actualresult = calculator.isEven(7);
        if (actualresult){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is uneven");
        }
    }
    public void twoNumbersTest() {
        int firstnumber = 3;
        int secondnumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.twoNumbers(firstnumber, secondnumber);
        if (result == firstnumber){
            System.out.println("Test1 = OK");
        }else{
            System.out.println("Test1 = FAIL");
        }
    }
    public void twoNumbersTest1() {
        int firstnumber = 3;
        int secondnumber = 4;
        Calculator calculator = new Calculator();
        int result = calculator.twoNumbers(firstnumber, secondnumber);
        if (result == firstnumber) {
            System.out.println("Test2 = OK");
        } else {
            System.out.println("Test2 = FAIL");
        }
    }
    public void twoNumbersTest2() {
        int firstnumber = 7;
        int secondnumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.twoNumbers(firstnumber, secondnumber);
        if (result == firstnumber) {
            System.out.println("Test3 = OK");
        } else {
            System.out.println("Test3 = FAIL");
        }
    }
    public void threeNumbersTest() {
        int firstnumber = 6;
        int secondnumber = 5;
        int thirdnumber = 4;
        Calculator calculator = new Calculator();
        int twoNumbers = calculator.threeNumbers(firstnumber, secondnumber, thirdnumber);
        if (twoNumbers == firstnumber && firstnumber > secondnumber && firstnumber > thirdnumber){
            System.out.println("Test1 = OK");
        }else{
            System.out.println("Test1 = FAIL");
        }
    }
    public void threeNumbersTest2() {
        int firstnumber = 6;
        int secondnumber = 7;
        int thirdnumber = 4;
        Calculator calculator = new Calculator();
        int threeNumbers = calculator.threeNumbers(firstnumber, secondnumber, thirdnumber);
        if (threeNumbers == secondnumber && secondnumber > firstnumber && secondnumber > thirdnumber) {
            System.out.println("Test2 = OK");
        } else {
            System.out.println("Test2 = FAIL");
        }
    }
    public void threeNumbersTest3() {
        int firstnumber = 6;
        int secondnumber = 7;
        int thirdnumber = 8;
        Calculator calculator = new Calculator();
        int threeNumbers = calculator.threeNumbers(firstnumber, secondnumber, thirdnumber);
        if (threeNumbers == thirdnumber && thirdnumber > firstnumber && thirdnumber > secondnumber) {
            System.out.println("Test3 = OK");
        } else {
            System.out.println("Test3 = FAIL");
        }
    }
    public void threeNumbersTest4() {
        int firstnumber = 7;
        int secondnumber = 7;
        int thirdnumber = 5;
        Calculator calculator = new Calculator();
        int threeNumbers = calculator.threeNumbers(firstnumber, secondnumber, thirdnumber);
        if (threeNumbers == firstnumber && threeNumbers == secondnumber && threeNumbers > thirdnumber) {
            System.out.println("Test4 = OK");
        } else {
            System.out.println("Test4 = FAIL");
        }
    }
    public void threeNumbersTest5() {
        int firstnumber = 5;
        int secondnumber = 7;
        int thirdnumber = 7;
        Calculator calculator = new Calculator();
        int threeNumbers = calculator.threeNumbers(firstnumber, secondnumber, thirdnumber);
        if (threeNumbers == secondnumber && threeNumbers == thirdnumber && threeNumbers > firstnumber) {
            System.out.println("Test5 = OK");
        } else {
            System.out.println("Test5 = FAIL");
        }
    }
    public void threeNumbersTest6() {
        int firstnumber = 7;
        int secondnumber = 7;
        int thirdnumber = 7;
        Calculator calculator = new Calculator();
        int threeNumbers = calculator.threeNumbers(firstnumber, secondnumber, thirdnumber);
        if (threeNumbers == firstnumber && threeNumbers == secondnumber && threeNumbers == thirdnumber) {
            System.out.println("Test6 = OK");
        } else {
            System.out.println("Test6 = FAIL");
        }
    }
}
