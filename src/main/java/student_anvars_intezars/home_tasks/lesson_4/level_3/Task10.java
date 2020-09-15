package student_anvars_intezars.home_tasks.lesson_4.level_3;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("This program checks, which of the integers ");
        System.out.println("is the largest one.");

        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();

        System.out.println();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();

        System.out.println();
        System.out.println("Please enter third number");
        int thirdNumber = sc.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)){
            System.out.println("First number is the largest one");
        }

        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)){
            System.out.println("Second number is the largest one");
        }

        else if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)){
            System.out.println("Third number is the largest one");
        }

    }
}
