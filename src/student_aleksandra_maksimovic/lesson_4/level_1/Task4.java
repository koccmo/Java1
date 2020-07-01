package student_aleksandra_maksimovic.lesson_4.level_1;
/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number!");
        int number = sc.nextInt();

        if (number % 2 == 0) {
             System.out.println("Number is even!");
        } else {
             System.out.println("Number is odd!");
         }
    }

}
