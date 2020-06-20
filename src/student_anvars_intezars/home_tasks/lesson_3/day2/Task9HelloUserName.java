package student_anvars_intezars.home_tasks.lesson_3.day2;

import java.util.Scanner;

public class Task9HelloUserName {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your User Name");

        System.out.println();
        String userName = in.next();

        System.out.println();
        System.out.println("Hi " + userName + "!");
    }
}
