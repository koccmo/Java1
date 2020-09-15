package student_aleksandra_maksimovic.lesson_4.level_2;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int firstNumber = sc.nextInt();
        System.out.println("Enter your second number :");
        int secondNumber = sc.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " = " + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("This number is bigger : " + firstNumber);
        } else {
            System.out.println("This number is bigger : " + secondNumber);
        }

    }
}
