package student_svjatoslavs_cernobrivecs.Lesson_2.day_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("input radius");

        double radius = x.nextDouble();
        double area = Math.PI * (radius * radius);
        double perimeter = Math.PI * 2 * radius;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
