package student_dmitrijs_jasvins.lesson_4.day_3;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number :");
        int thirdNumber = scanner.nextInt();
        if (firstNumber == secondNumber & firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if ((firstNumber == secondNumber) || (firstNumber == thirdNumber) || (thirdNumber == secondNumber)) {
            System.out.println("Neither number are equals or different");
        } else {
            System.out.println("All number are different");
        }

    }
}