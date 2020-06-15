package student_georgij_galin.lesson2.day_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first real number:");
        double numberOne = scanner.nextDouble();
        System.out.println("Enter second real number:");
        double numberTwo = scanner.nextDouble();

        double summary = numberOne + numberTwo;
        double subtraction = numberOne - numberTwo;
        double multiply = numberOne * numberTwo;
        double division = numberOne / numberTwo;

        System.out.println("Result: " + summary);
        System.out.println("Result: " + subtraction);
        System.out.println("Result: " + multiply);
        System.out.println("Result: " + division);

    }

}