package student_aleksandra_maksimovic.lesson_4.level_1;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Your number is positive!");
        } else if(number < 0) {
            System.out.println("Your number is negative!");
        } else {
            System.out.println("Your number is zero!");
        }
    }
}
