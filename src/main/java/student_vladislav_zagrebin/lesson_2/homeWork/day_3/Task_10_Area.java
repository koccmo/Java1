package student_vladislav_zagrebin.lesson_2.homeWork.day_3;

import java.util.Scanner;

public class Task_10_Area {

    public static void main(String[] args) {

        Scanner myDigit = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        double radius = myDigit.nextDouble();

        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));

    }
}
