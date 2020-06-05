package student_anvars_intezars.home_tasks.lesson_2;

import java.util.Scanner;

class VariousCalculations {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
    System.out.println("This program is providing sum, subtraction, \n"
            +"division and multiplication of two integers.");
            System.out.println ("To begin press enter two integers");

            System.out.println();
            System.out.println("Please enter the First number");
            int firstNumber = in.nextInt();
            System.out.println(firstNumber);
            System.out.println();

            System.out.println("Please enter the Second Number");
            int secondNumber = in.nextInt();
            System.out.println(secondNumber);

                int sumCalculation = firstNumber + secondNumber;
                System.out.println("The result of Sum result is " + sumCalculation);

                int subCalculation = firstNumber - secondNumber;
                System.out.println("The ruslt of subtraction is " + subCalculation);

                double divCalculation = firstNumber / (double) secondNumber;
                System.out.println("The result of division is " + divCalculation);

                int multCalculation = firstNumber * secondNumber;
                System.out.println("The result of multiplication is " + multCalculation);}

}
