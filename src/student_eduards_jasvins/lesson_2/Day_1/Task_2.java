package student_eduards_jasvins.Lesson_2.Day_1;

import java.util.Scanner;

public class Task_2 {

    public static void main (String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter fist number");
        double firstNumber = myInput.nextDouble();

        // 2. get second number from user
        System.out.println("Enter second number");
        double secondNumber = myInput.nextDouble();

        // 3. first number + second number
        double addition = firstNumber + secondNumber;
        double substraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double divison = firstNumber / secondNumber;

        // 4. print result to console
        System.out.println("Addition = " + addition);
        System.out.println("Substraction = " + substraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Divison = " + divison);
    }
}
