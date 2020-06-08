package student_aleksandra_maksimovic.lesson_2.homeworks.day_1.task_2;


/*
Практическое задание на сегодня (level 2):
Написать консольную программу, которая запрашивает у пользователя два вещественных числа
(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
Вещественные числа можно запрашивать с консоли используя обьект Scanner. Найдите как это можно сделать!
*/


import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {

        //1. get first double from user
        System.out.println("Enter your first double number");
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();

        //2.get second double from user
        System.out.println("Enter your second double number");
        double secondNumber = input.nextDouble();

        //3. calculation
        double sum = firstNumber + secondNumber;
        double sub = firstNumber - secondNumber;
        double mul = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;


        //4. print result to console
        System.out.println("addition result = " + sum );
        System.out.println("subtraction result = " + sub);
        System.out.println("multiplication result = " + mul);
        System.out.println("division result = " + div);
    }


}



