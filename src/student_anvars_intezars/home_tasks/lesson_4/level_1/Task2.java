package student_anvars_intezars.home_tasks.lesson_4.level_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Please enter Integer:");
        int firstNumber = sc.nextInt();

        if (firstNumber >0) {
            System.out.println("Your number is positive");
        }
        else if (firstNumber <0) {
            System.out.println("Your number is negative");
        }
        else {
            System.out.println("Your number equals 0");
        }

    }
}


