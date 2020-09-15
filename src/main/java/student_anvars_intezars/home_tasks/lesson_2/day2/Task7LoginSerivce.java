package student_anvars_intezars.home_tasks.lesson_2.day2;

import java.util.Scanner;

public class Task7LoginSerivce {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Please log in by using your credentials");

        System.out.println();
        System.out.println("Login");
        String login = in.next();

        System.out.println();
        System.out.println("Password");
        String password = in.next();

        System.out.println();
        System.out.println("You login was successful!");}
}
