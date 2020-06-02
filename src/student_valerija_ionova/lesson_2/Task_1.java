package student_valerija_ionova.lesson_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number: ");
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.println("Enter second number: ");
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
        int summa = firstNumber + secondNumber;
        int raznica = firstNumber - secondNumber;
        int umnozenie = firstNumber * secondNumber;
        int delenie = firstNumber / secondNumber;

        // 4. print result to console
        System.out.println("Summa = " + summa);
        System.out.println("Raznica = " + raznica);
        System.out.println("Umnozhenie = " + umnozenie);
        System.out.println("Delenie = " + delenie);

    }
}
