package student_roberts_kupcs.lesson_2.homeworks.day_1;

import java.util.Scanner;

public class AddSubtrDivisMultiplicTwoNumbers {
    public static void main(String[] args) {

        Scanner myInput = new Scanner( System.in);
        System.out.println("Enter first number: ");
        double firstNumber = myInput.nextDouble();

        System.out.println("Enter second number: ");
        double secondNumber = myInput.nextDouble();

        double addResult = firstNumber + secondNumber;
        System.out.println("result = " + addResult);

        double subtrResult = firstNumber - secondNumber;
        System.out.println("result = " + subtrResult);

        double divisResult = firstNumber / secondNumber;
        System.out.println("result = " + divisResult);

        double multiplicResult = firstNumber * secondNumber;
        System.out.println("result = " + multiplicResult);
    }
}
