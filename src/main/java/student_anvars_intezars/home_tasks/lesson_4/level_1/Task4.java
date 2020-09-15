package student_anvars_intezars.home_tasks.lesson_4.level_1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter integer to check ");
        System.out.println("if it is odd or even:");
        int firstNumber = sc.nextInt();

        if (firstNumber % 2 == 0) {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }

    }

}
