package student_georgij_galin.Lesson2;

//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        System.out.println("Программа запрашивает имя и приветствует Вас!");

        // 1. get name from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter your name: ");
        String Name = myInput.next();

        // 2. print result to console
        System.out.println("Hello " + Name);
    }
}