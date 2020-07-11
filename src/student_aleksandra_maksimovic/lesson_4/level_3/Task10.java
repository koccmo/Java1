package student_aleksandra_maksimovic.lesson_4.level_3;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
три целых числа и выводит на консоль наибольшее из них.

PS: перед решением этой задачи распишите на бумаге
или в коментарии все возможные варианты (комбинации).
Это поможет вам правильно написать программу!
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter your second number : ");
        int secondNumber = sc.nextInt();
        System.out.println("Enter your third number : ");
        int thirdNumber = sc.nextInt();

        // а если два первых числа равны и они больше третьего числа?
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println(firstNumber);
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }
    }
}
