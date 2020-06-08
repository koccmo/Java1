package student_aleksandra_maksimovic.lesson_2.homeworks.day_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        //Write a Java program to print the area and perimeter of a circle.
        //
        //Test Data:
        //Radius = 7.5
        //
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586


        System.out.println("Enter your radius");
        Scanner myInput = new Scanner(System.in);

        double r = myInput.nextDouble();

        double Pi = 3.1415926535897932384626433832795;

        double S = Pi * r * r;
        double l = 2 * Pi * r;

        System.out.println("Area = " + S);
        System.out.println("Perimeter = " + l);
    }
}
