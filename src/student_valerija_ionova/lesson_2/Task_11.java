package student_valerija_ionova.lesson_2;

//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

public class Task_11 {
    public static void main (String[] args){
        // 1.Input
        Scanner myInput= new Scanner (System.in);
        System.out.println("Please input first number: ");
        double first = myInput.nextDouble();
        System.out.println("Please input second number: ");
        double second = myInput.nextDouble();
        System.out.println("Please input third number");
        double third = myInput.nextDouble();

        //2.Calculation
        double result = (first+second+third)/3;

        System.out.println("The average of the numbers is: "+result);

    }
}
