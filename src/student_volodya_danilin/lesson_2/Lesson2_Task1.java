package student_volodya_danilin.lesson_2;

//Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.

import java.util.Scanner;

public class Lesson2_Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number1 : ");
        int number1 = input.nextInt();

        System.out.println("Enter number2 : ");
        int number2 = input.nextInt();

        System.out.println("a+b = " + (number1+number2));
        System.out.println("a-b = " + (number1-number2));
        System.out.println("a*b = " + (number1*number2));
        System.out.println("a/b = " + (double)number1/number2);
    }
}
