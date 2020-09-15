package student_aleksandra_maksimovic.my_exercises;

import java.util.Scanner;

/*
Напишите программу, которая запрашивает у пользователя целое число
и печатает на консоль таблицу умножения для этого числа до 10.

Test Data:
Input a number: 8

Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
public class Multiply {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mult = number * i;
            System.out.println(number + " x " + i + " = " + mult);
        }
    }
}
