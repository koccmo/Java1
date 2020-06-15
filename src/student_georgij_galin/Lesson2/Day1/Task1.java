package student_georgij_galin.Lesson2.Day1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second Number:");
        int numberTwo = scanner.nextInt();

        int summary = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiply = numberOne * numberTwo;
        int division = numberOne / numberTwo;

        System.out.println("Result: " + summary);
        System.out.println("Result: " + subtraction);
        System.out.println("Result: " + multiply);
        System.out.println("Result: " + division);
    }

}
