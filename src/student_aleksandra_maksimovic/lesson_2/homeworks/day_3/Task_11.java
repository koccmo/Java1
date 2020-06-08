package student_aleksandra_maksimovic.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner input = new Scanner(System.in);
        double firstNumber = input.nextDouble();

        System.out.println("enter second number");
        double secondNumber = input.nextDouble();

        System.out.println("enter third number");
        double thirdNumber = input.nextDouble();

        double sum = firstNumber + secondNumber + thirdNumber;
        double result =  sum / 3 ;

        System.out.println("Average of the numbers = " + result);
    }
}
