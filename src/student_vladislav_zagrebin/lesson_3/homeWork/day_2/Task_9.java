package student_vladislav_zagrebin.lesson_3.homeWork.day_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner enterName = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = enterName.nextLine();
        System.out.println("Greetings " + userName + "! :)");
    }
}
