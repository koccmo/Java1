package student_volodya_danilin.lesson_2.day_2;

//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!

import java.util.Scanner;

public class Lesson2_Task8 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = input.next();
        System.out.println("Hello " + name);
    }

}
