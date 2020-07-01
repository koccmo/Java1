package student_dmitrijs_jasvins.lesson_4.day_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third number:");
        int thirdNumber = scanner.nextInt();
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Largest number is : " + firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println("Largest number is : " + secondNumber);
        } else {
            System.out.println("Largest number is : " + thirdNumber);
        }
    }
}