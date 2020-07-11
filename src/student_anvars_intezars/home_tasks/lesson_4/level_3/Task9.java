package student_anvars_intezars.home_tasks.lesson_4.level_3;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("This program checks, if the numbers ");
        System.out.println("are in increasing or decreasing order.");

        System.out.println("Please enter first number:");
        int firstNumber = sc.nextInt();

        System.out.println();
        System.out.println("Please enter second number:");
        int secondNumber = sc.nextInt();

        System.out.println();
        System.out.println("Please enter third number");
        int thirdNumber = sc.nextInt();

        if ((firstNumber < secondNumber) && (secondNumber < thirdNumber)){
            System.out.println("The numbers are in increasing order");
        }

        else if ((firstNumber > secondNumber) && (secondNumber > thirdNumber)){
            System.out.println("The numbers are in decreasing order");
        }

        else {
            System.out.println("Neither increasing or decreasing order");
        }





    }



}
