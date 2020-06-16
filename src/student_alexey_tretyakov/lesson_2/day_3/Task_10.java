package student_alexey_tretyakov.lesson_2.day_3;

import static java.lang.Math.PI;

public class Task_10 {
    public static void main(String[] args) {

        // Enter first number;
        // Scanner scannerNumber = new Scanner(System.in);
        // System.out.print("Input radius of circle (by default = 7.5) : ");

       // float firstNumber = scannerNumber.nextFloat();
       // if ( firstNumber <= 0  ) {
         double inputRadius = 7.5;

        System.out.println("Radius  = " + inputRadius);
        System.out.println("Perimeter is  = " + 2 * PI * inputRadius );
        System.out.println("Area is  = " + PI * (inputRadius) * (inputRadius));
    }
}
