package student_anvars_intezars.home_tasks.lesson_2.day1;

import java.util.Scanner;

public class Task2FractionalNumberCalculation {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("This program is providing sum, subtraction, \n"
                +"division and multiplication of two fractional numbers.");
        System.out.println ("To begin press enter two fractional numbers");

        System.out.println();

        System.out.println("Please enter the First fractional number");
        double firstNumber = in.nextDouble();
        System.out.println(firstNumber);
        System.out.println();

        System.out.println("Please enter the Second fractional Number");
        double secondNumber = in.nextDouble();
        System.out.println(secondNumber);

        double sumCalculation = firstNumber + secondNumber;
        System.out.println("The result of Sum result is " + sumCalculation);

        double subCalculation = firstNumber - secondNumber;
        System.out.println("The ruslt of subtraction is " + subCalculation);

        double divCalculation = firstNumber / secondNumber;
        System.out.println("The result of division is " + divCalculation);

        double multCalculation = firstNumber * secondNumber;
        System.out.println("The result of multiplication is " + multCalculation);}

}
