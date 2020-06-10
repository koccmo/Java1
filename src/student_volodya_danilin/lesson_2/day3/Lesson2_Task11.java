package student_volodya_danilin.lesson_2.day3;

// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Lesson2_Task11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        double number1 = input.nextDouble();

        System.out.println("Enter number 2 : ");
        double number2 = input.nextDouble();

        System.out.println("Enter number 3 : ");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.println("Average number is : " + average);

    }
}
