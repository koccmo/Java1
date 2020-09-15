package student_anvars_intezars.home_tasks.lesson_2.day2;

import java.util.Scanner;

public class Task5BankAccount {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to SEB bank:");
        System.out.println ("To enter you personal Internet Bank, please");
        System.out.println ("enter your credentials");

        System.out.println();
        System.out.println("Login");
        String login = in.next();

        System.out.println();
        System.out.println("Password");
        String password = in.next();

            System.out.println();
            System.out.println("Full name: Alexander Ivanov \n"
            + "IBAN: LVUNLASEB899919918818 \n"
            + "Current Balance: 11992,20 EUR");

    }
}
