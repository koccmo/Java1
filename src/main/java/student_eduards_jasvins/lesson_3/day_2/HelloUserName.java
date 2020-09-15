package student_eduards_jasvins.lesson_3.day_2;

// Task_9

import java.util.Scanner;

public class HelloUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your username?");
        String username = scanner.next();

        System.out.println("Hello " + username + "!");
    }



}
