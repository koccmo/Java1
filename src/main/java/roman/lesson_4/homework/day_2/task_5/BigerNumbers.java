package roman.lesson_4.homework.day_2.task_5;

import java.util.Scanner;

public class BigerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("First number is bigger " + firstNumber);
        } else {
            System.out.println("Second number is bigger " + secondNumber);
        }
    }
}
