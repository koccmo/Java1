package student_aleksandra_maksimovic.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class Task_9_2 {


 /*   Write a Java program that takes a number as input and prints its
    multiplication table up to 10.

    Test Data:
    Input a number: 8

    Expected Output :
            8 x 1 = 8
            8 x 2 = 16
            8 x 3 = 24
            ...
            8 x 10 = 80

  */

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();

        for (int i = 1; i <= 10; i++){

            System.out.println( userNumber + " x " + i +" = " + i * userNumber );
        }


    }




}
