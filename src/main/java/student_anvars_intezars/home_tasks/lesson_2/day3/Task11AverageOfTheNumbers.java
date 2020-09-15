package student_anvars_intezars.home_tasks.lesson_2.day3;

import java.util.Scanner;

public class Task11AverageOfTheNumbers {

    private static Scanner in = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("This program calculates the average of, \n"
                +"three numbers.");

        System.out.println();
        System.out.println("Please enter the First number");
        double firstNumber = in.nextDouble();
        System.out.println(firstNumber);

        System.out.println();
        System.out.println("Please enter the Second Number");
        double secondNumber = in.nextDouble();
        System.out.println(secondNumber);

        System.out.println();
        System.out.println("Please enter the Third Number");
        double thirdNumber = in.nextDouble();
        System.out.println(thirdNumber);

        double dividerOfAllThreeNumbers = 3;


        System.out.println();
        double sumCalculation = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum of all three number is " + sumCalculation);

        System.out.println();
        double averageOfAllThreeNumbers = sumCalculation / dividerOfAllThreeNumbers;
        System.out.println("The average of all three numbers is " + averageOfAllThreeNumbers);
    }


}
