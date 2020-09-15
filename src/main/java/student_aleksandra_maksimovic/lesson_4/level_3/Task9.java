package student_aleksandra_maksimovic.lesson_4.level_3;
/*
Write a program that accepts three numbers from the user and prints:
- "increasing" if the numbers are in increasing order,
- "decreasing" if the numbers are in decreasing order,
- "Neither increasing or decreasing order" otherwise.
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter your second number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter your third number : ");
        int thirdNumber = sc.nextInt();

        if ( (firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
            System.out.println("increasing");
        } else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
