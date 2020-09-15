package student_aleksandra_maksimovic.my_exercises;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!

 */
public class Hello {
    public static void main(String[] args) {

        System.out.println("Enter your name");
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();

        System.out.println("Hello " + userName);
    }
}
