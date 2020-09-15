package student_anvars_intezars.home_tasks.lesson_2.day3;

import java.util.Scanner;

public class Task10PerimeterOfaCircle {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("This program calculates area and perimeter, \n"
                + "of a circle with a value 7.5.");

        System.out.println();
        System.out.println("Please enter 7.5");

        // Here are all the main numbers, which are used in Formulas
        // to calculate Area and Parameter of a Circle
        double radiusOfCircle = in.nextDouble();
        double numberP = 3.14;
        int numberTwo = 2;

        double areaOfCircle = numberP * radiusOfCircle * radiusOfCircle;
        System.out.println();
        System.out.println("Area of a Circle is = " + areaOfCircle);

        double parameterOfCircle = numberTwo * numberP * radiusOfCircle;
        System.out.println();
        System.out.println("Parameter of a Circle is = " + parameterOfCircle);


    }
}
