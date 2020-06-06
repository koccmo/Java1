package student_igors_bartkevics.lesson_2.homeworks;

import java.util.Scanner;
import java.lang.Math.*;

public class Task_10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a radius of circle:");
        float radius = scanner.nextFloat();
        double perimeterOfCircle = 2 * Math.PI * radius;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is = " + perimeterOfCircle);
        System.out.println("Area is = " + areaOfCircle);
    }
}
