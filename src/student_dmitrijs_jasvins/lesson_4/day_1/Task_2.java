package student_dmitrijs_jasvins.lesson_4.day_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = scanner.nextInt();
        if (number != 0) {
            if (number > 0) {
                System.out.println("Number is positive");
            }
            if (number < 1) {
                System.out.println("Number is negative");
            }
        } else {
            System.out.println("Number = 0");
        }
    }
}
