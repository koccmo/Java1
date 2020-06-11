package student_georgij_galin.Lesson2;

//Write a Java program to print the area and perimeter of a circle.
//
//Test Data:
//Radius = 7.5
//
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        System.out.println("Программа запрашивает радиус круга и выводит на экран площадь и периметр круга!");

        double pi = 3.14159265358979323846264338327950288419716939937510;
        // 1. get radius from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter radius: ");
        double radius = myInput.nextDouble();

        // 2. Perimeter&Area
        double perimeter = 2*pi*radius;
        double area = pi*radius*radius;


        // 4. print result to console
        System.out.println("Периметр = " + perimeter);
        System.out.println("Площадь = " + area);


    }
}