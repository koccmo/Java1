package student_volodya_danilin.lesson_6.level_1;

import java.util.Random;

class Calculator {

    CalculatorTest calculatorTest;
    public boolean isEven(int number) {
         return (number % 2 == 0);
    }

}

class CalculatorTest {

    public static void main(String[] Args) {

        Calculator testCalculator = new Calculator();
        Random randomNumber = new Random();

        for (int i = 0; i < 10; i++) {

            int testNumber = randomNumber.nextInt(100);
            System.out.print(testNumber + " is even? : " + testCalculator.isEven(testNumber) + "\n");
        }



    }

}