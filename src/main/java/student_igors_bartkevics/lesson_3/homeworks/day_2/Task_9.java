/*
Учимся работать со строками.

Тема: Считывание строк с консоли.

Программа должна спрашивать как зовут пользователя,
считывать его имя с консоли и выводить приветствие
в виде: "Hello UserName!".

Подсказка: строку с консоли можно считать используя
обьект Scanner. Загуглите как это можно сделать:
"как в Java считать строку с консоли".
 */


package student_igors_bartkevics.lesson_3.homeworks.day_2;
import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name, please:");
        String userName = scanner.nextLine();

        String greeting = "Hello " + userName + "!";
        System.out.println(greeting);

    }

}
