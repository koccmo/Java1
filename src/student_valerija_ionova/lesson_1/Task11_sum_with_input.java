package student_valerija_ionova.lesson_1;

//Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class Task11_sum_with_input {
    public static void main (String[] args){

        System.out.println("This program prints the sum of two numbers :D");

        //1. Input of numbers
        Scanner myInput = new Scanner (System.in);
        System.out.println("Enter first number: ");
        double first = myInput.nextDouble();

        System.out.println("Enter second number: ");
        double second = myInput.nextDouble();

        //2. Output
        double sum = first+second;
        System.out.println("Sum is "+sum);
    }
}
