package student_anvars_intezars.home_tasks.lesson_4.level_2;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("This program compares two integers ");
        System.out.println("to see are they equal or different");

        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();

        System.out.println();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
