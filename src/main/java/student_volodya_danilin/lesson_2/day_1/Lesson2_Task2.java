package student_volodya_danilin.lesson_2.day_1;

//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя обьект Scanner. Найдите как это можно сделать!

import java.util.Scanner;

public class Lesson2_Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1 : ");
        double number1 = input.nextDouble();

        System.out.println("Enter number2 : ");
        double number2 = input.nextDouble();

        System.out.println("a+b = " + (number1+number2));
        System.out.println("a-b = " + (number1-number2));
        System.out.println("a*b = " + (number1*number2));
        System.out.println("a/b = " + (number1/number2));
    }

}
