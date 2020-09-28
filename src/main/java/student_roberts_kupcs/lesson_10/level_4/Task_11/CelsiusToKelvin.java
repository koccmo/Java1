package student_roberts_kupcs.lesson_10.level_4.Task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CelsiusToKelvin {
    public static void main(String[] args) {
        float celsius = 0;
        double kelvin;
        Scanner scan = new Scanner(System.in);
        celsius = scan.nextFloat();

        kelvin = (celsius + 273.15) + 32;
        System.out.println("температуру в кельвины = " + kelvin);
    }
}
