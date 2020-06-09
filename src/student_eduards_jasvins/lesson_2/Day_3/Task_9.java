package student_eduards_jasvins.Lesson_2.Day_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number!");
        int number = scanner.nextInt();
        for (int i = 0; i < 10; i++) {

            System.out.println(number + "x" + (i + 1) + "=" + (number * (i + 1)));
        }
    }
}
