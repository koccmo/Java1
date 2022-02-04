package roman.lesson_4.homework.day_1.task_2;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("This number is Positive");
        } else {
            if (number < 0) {
                System.out.println("This number Negative");
            } else {
                System.out.println("This number is 0");
            }
          }

    }
}