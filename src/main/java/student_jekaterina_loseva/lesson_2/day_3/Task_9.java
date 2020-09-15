package student_jekaterina_loseva.lesson_2.day_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int enterNumber = scanner.nextInt();
        int i;

        for (i = 1; i < 11; i++) {

            System.out.println(enterNumber + " * " + i + " = " + enterNumber * i);

        }
    }

}
