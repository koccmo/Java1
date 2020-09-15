package student_dmitrijs_jasvins.lesson_4.day_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("This number is bigger : " + firstNumber);
        } else {
            System.out.println("This number is bigger : " + secondNumber);
        }
    }
}
