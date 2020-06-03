package student_valerija_ionova.lesson_1;

//Write a Java program to divide two numbers and print on the screen.

import java.util.Scanner;

public class Task11_Delenie_with_input {
    public static void main (String[] args){

        System.out.println("This program divide two numbers :)");

        //1. Input
        Scanner myInput = new Scanner (System.in);
        System.out.println("Please enter first number: ");
        double first = myInput.nextDouble();

        System.out.println("Please enter second number: ");
        double second = myInput.nextDouble();

        //2. Divide
        double result=  first/second;

        //3. Output
        System.out.println("Result is: "+result);
    }
}
