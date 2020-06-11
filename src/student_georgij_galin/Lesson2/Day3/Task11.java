package student_georgij_galin.Lesson2.Day3;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

public class Task11 {
    public static void main (String[] args){

        System.out.println("Программа запрашивает 3 числа и считает среднее арифметическое");

        // 1.Input
        Scanner myInput= new Scanner (System.in);
        System.out.println("Enter first number: ");
        double first = myInput.nextDouble();
        System.out.println("Enter second number: ");
        double second = myInput.nextDouble();
        System.out.println("Enter third number: ");
        double third = myInput.nextDouble();

        //2.Calculation
        double result = (first+second+third)/3;

        System.out.println("Среднее арифметическое: "+result);

    }
}