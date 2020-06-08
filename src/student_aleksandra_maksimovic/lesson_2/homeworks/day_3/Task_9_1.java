package student_aleksandra_maksimovic.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class Task_9_1 {

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

        System.out.println( userNumber + " x 1 = " + userNumber );
        System.out.println( userNumber + " x 2 = " + userNumber * 2 );
        System.out.println( userNumber + " x 3 = " + userNumber * 3 );
        System.out.println( userNumber + " x 4 = " + userNumber * 4 );
        System.out.println( userNumber + " x 5 = " + userNumber * 5 );
        System.out.println( userNumber + " x 6 = " + userNumber * 6 );
        System.out.println( userNumber + " x 7 = " + userNumber * 7 );
        System.out.println( userNumber + " x 8 = " + userNumber * 8 );
        System.out.println( userNumber + " x 9 = " + userNumber * 9 );
        System.out.println( userNumber + " x 10 = " + userNumber * 10 );


    }


}
