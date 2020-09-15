package student_vladislav_zagrebin.lesson_2.lesson_examples;

import java.util.Scanner;

public class ConsoleInputExample {

    public static void main(String[] args) {

        // System.in; - input
        // System.out; - output
        // System.err; - error

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter integer number:");
        int userNumber = scanner.nextInt();
        int power = userNumber * userNumber;

        System.out.println("User number = " + userNumber);
        System.out.println("User multiple = " + power);

        System.out.println("Please enter double number:");
        double userDoubleNumber = scanner.nextDouble();
        System.out.println("User double number = " + userDoubleNumber);

    }
}
