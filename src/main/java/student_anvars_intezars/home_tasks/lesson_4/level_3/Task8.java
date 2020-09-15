package student_anvars_intezars.home_tasks.lesson_4.level_3;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("This program compares three integers ");
        System.out.println("to see are they all equal or different");

        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();

        System.out.println();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();

        System.out.println();
        System.out.println("Please enter third number");
        int thirdNumber = sc.nextInt();

        if ((firstNumber == secondNumber) && (firstNumber == thirdNumber)){
            System.out.println("All numbers are equal");
        }

        else if ((firstNumber != secondNumber) && (firstNumber != thirdNumber)){
            System.out.println("All numbers are different");
        }

        else {
            System.out.println("Neither all are equal or different");
        }

    }
}
