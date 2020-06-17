package student_volodya_danilin.lesson_2.day_3;

// Write a Java program to print the area and perimeter of a circle.

import java.util.Scanner;

public class Lesson2_Task10 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius : ");
        double radius = input.nextDouble();

        System.out.println("Perimeter is : " + (2 * Math.PI * radius));
        System.out.println("Area is : " + (radius * radius * Math.PI));
    }
}
