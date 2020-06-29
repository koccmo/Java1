package student_aleksandra_maksimovic.lesson_3.homeworks.day_2;

/*Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".*/

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        System.out.println("Enter your name");

        Scanner inputString = new Scanner(System.in);
        String userName = inputString.nextLine();

        System.out.println("Hello " + userName + "!" );

    }


}
