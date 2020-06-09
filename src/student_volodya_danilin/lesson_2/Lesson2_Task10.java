package student_volodya_danilin.lesson_2;

import java.util.Scanner;
import java.lang.Math.*;

public class Lesson2_Task10 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius : ");
        double radius = input.nextDouble();

        System.out.println("Perimeter is : " + (2 * Math.PI * radius));
        System.out.println("Area is : " + (radius * radius * Math.PI));
    }
}
