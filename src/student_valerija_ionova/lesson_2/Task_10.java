package student_valerija_ionova.lesson_2;

//Write a Java program to print the area and perimeter of a circle.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        double pi = 3.14159265358979323846264338327950288419716939937510;
        // 1. get radius from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter radius: ");
        double radius = myInput.nextDouble();

        // 2. Perimeter&Area
        double perimeter = 2*pi*radius;
        double area = pi*radius*radius;


        // 4. print result to console
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);


    }
}
