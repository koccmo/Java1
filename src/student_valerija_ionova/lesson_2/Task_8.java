package student_valerija_ionova.lesson_2;

//Задача 6 (level 3) :
//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        // 1. get name from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter name: ");
        String name = myInput.next();

        // 2. print result to console
        System.out.println("Hello " + name);
    }
}
