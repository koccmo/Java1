package student_dmitrijs_jasvins.lesson_3.day_2;

import java.util.Scanner;

public class HelloUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
