package student_georgij_galin.Lesson2;

//Write a Java program that takes a number as input and prints its
//multiplication table up to 10.
//
//Test Data:
//Input a number: 8
//
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        System.out.println("Программа запрашивает число и выводит на экран его таблицу умножения!");

        // 1. get first number from user
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter number: ");
        int firstNumber = myInput.nextInt();

        // 2. print result to console
        System.out.println(firstNumber + " x 1 = " + firstNumber);
        System.out.println(firstNumber + " x 2 = " + firstNumber * 2);
        System.out.println(firstNumber + " x 3 = " + firstNumber * 3);
        System.out.println(firstNumber + " x 4 = " + firstNumber * 4);
        System.out.println(firstNumber + " x 5 = " + firstNumber * 5);
        System.out.println(firstNumber + " x 6 = " + firstNumber * 6);
        System.out.println(firstNumber + " x 7 = " + firstNumber * 7);
        System.out.println(firstNumber + " x 8 = " + firstNumber * 8);
        System.out.println(firstNumber + " x 9 = " + firstNumber * 9);
        System.out.println(firstNumber + " x 10 = " + firstNumber * 10);
    }
}
