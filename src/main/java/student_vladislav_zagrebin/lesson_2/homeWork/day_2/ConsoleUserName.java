package student_vladislav_zagrebin.lesson_2.homeWork.day_2;

import java.util.Scanner;

public class ConsoleUserName {

    public static void main(String[] args) {

        System.out.println("Greetings, please enter user name:");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println(" Hello, " + userName + "!");
        System.out.println(" Have a nice day! :) ");
    }
}
