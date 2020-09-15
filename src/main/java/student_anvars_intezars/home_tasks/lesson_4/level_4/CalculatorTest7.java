package student_anvars_intezars.home_tasks.lesson_4.level_4;

public class CalculatorTest7 {

    public static void main(String[] args) {
        CalculatorTest7 calculatorTest = new CalculatorTest7();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxofThreeNumbersTest7();
    }

    //первое число больше второго и третьего
    public void maxOfThreeNumbersTest1() {
        int firstNumber = 5;
        int secondNumber = 1;
        int thirdNumber = 1;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 5) {

            System.out.println("maxOfThreeNumbers test1 = OK ");
        } else {
            System.out.println("maxOfThreeNumbers test1 = FAIL");
        }
    }

    //второе число больше первого и третьего
    public void maxOfThreeNumbersTest2() {
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 1;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 5) {

            System.out.println("maxOfThreeNumbers test2 = OK ");
        } else {
            System.out.println("maxOfThreeNumbers test2 = FAIL");
        }
    }
        //третье число больше первого и второго
    public void maxOfThreeNumbersTest3() {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 5;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 5) {
            System.out.println("maxOfThreeNumbers test3 = OK ");
        } else {
            System.out.println("maxOfThreeNumbers test3 = FAIL");
        }
    }
        //первые два равны и больше третьего
    public void maxOfThreeNumbersTest4() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 1;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 5) {
            System.out.println("maxOfThreeNumber test4 = OK");
        }else {
            System.out.println("maxOfThreeNumber test4 = FAIL");
        }

    }
        // второе и третье равны и больше первого
    public void maxOfThreeNumbersTest5 () {
        int firstNumber = 1;
        int secondNumber = 5;
        int thirdNumber = 5;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == 5) {
            System.out.println("maxOfThreeNumber test5 = OK");
        }else {
            System.out.println("maxOfThreeNumber test5 = FAIL");
        }
    }
        // третье и первое больше второго
    public void maxOfThreeNumbersTest6() {
       int firstNumber = 5;
       int secondNumber = 1;
       int thirdNumber = 5;

       Calculator calculator = new Calculator();
       int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
       if (result == 5) {
           System.out.println("maxOfThreeNumbers test6 = OK");
       }else {
           System.out.println("maxOfThreeNumbers test6 = FAIL");
        }
    }
        // все три числа равны
    public void maxofThreeNumbersTest7() {
        int firstNumber = 5;
        int secondNUmber = 5;
        int thirdNumber = 5;

        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNUmber, thirdNumber);
        if (result == 5) {
            System.out.println("maxOfThreeNumber test7 = OK");
        }else {
            System.out.println("maxOfThreeNumber test7 = OK");
        }

    }





}
