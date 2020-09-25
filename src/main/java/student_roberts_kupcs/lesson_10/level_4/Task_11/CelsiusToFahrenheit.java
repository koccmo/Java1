package student_roberts_kupcs.lesson_10.level_4.Task_11;

import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        float celsius = 0;
        double fahrenheit;
        Scanner scan = new Scanner(System.in);
        celsius = scan.nextFloat();

        fahrenheit = (1.8 * celsius);
        System.out.println("температуру в форенгейты = " + fahrenheit);
    }

}
