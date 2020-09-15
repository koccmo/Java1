package student_aleksandra_maksimovic.lesson_2.homeworks.day_1.task_2;

import java.util.Scanner;

public class Task_2_2 {

/*    Практическое задание на сегодня (level 2):
    Написать консольную программу, которая запрашивает у пользователя два вещественных числа
            (числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
    Вещественные числа можно запрашивать с консоли используя обьект Scanner. Найдите как это можно сделать!
*/

    public static void main(String[] args) {

        //1. get first double number from user
        System.out.println("Please enter your number");
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();
        input.nextLine(); // skip enter

        //2. get operation from user
        System.out.println("Please enter operation");
        String operation = input.nextLine();

        //3. get second double number from user
        System.out.println("Please enter your second number");
        double secondNumber = input.nextDouble();

        //4.
        double result = 0;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }


        //5. print result to console
        System.out.println("result = " + result);
    }

}

