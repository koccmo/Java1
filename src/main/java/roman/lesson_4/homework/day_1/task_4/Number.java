package roman.lesson_4.homework.day_1.task_4;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int number:");
        int number = sc.nextInt();
        if (number % 2 == 0 ) {
            System.out.println("Its even number");
        } else {System.out.println("Its odd number"); }
    }
}
