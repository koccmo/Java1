package student_eduards_jasvins.lesson_2.day_1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter first number ");
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.println("Enter second number ");
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int divison = firstNumber / secondNumber;


        // 4. print result to console
        System.out.println("Addition = " + addition);
        System.out.println("Substraction = " + substraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Divison = " + divison);
    }


}