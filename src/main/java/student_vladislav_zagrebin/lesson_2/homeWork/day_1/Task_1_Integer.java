package student_vladislav_zagrebin.lesson_2.homeWork.day_1;

import java.util.Scanner;

public class Task_1_Integer {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first Integer number:");
        int firstIntNumber = scanner.nextInt();

        System.out.println("Please enter second Integer number:");
        int secondIntNumber = scanner.nextInt();

        int add = firstIntNumber + secondIntNumber;
        int sub = firstIntNumber - secondIntNumber;
        int multi = firstIntNumber * secondIntNumber;
        double div = firstIntNumber / (double) secondIntNumber;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + multi);
        System.out.println("Division = " + div);

    }
}
