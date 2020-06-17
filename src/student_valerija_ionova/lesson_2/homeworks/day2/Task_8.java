package student_valerija_ionova.lesson_2.homeworks.day2;

//Задача 6 (level 3) :
//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        System.out.println("Программа запрашивает имя и приветствует Вас!");

        // 1. get name from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Введите Ваше имя: ");
        String Name = myInput.next(); // название переменных с маленькой буквы!

        // 2. print result to console
        System.out.println("Hello " + Name);
    }
}
