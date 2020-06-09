package student_igors_bartkevics.lesson_2.homeworks.day_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the 1-st number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the 2-nd number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter the 3-rd number:");
        double thirdNumber = scanner.nextDouble();

        // The first method
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average of entered numbers is " + average);

        //The second method using METHOD

        System.out.println("The average of entered numbers is " + methodAverage(firstNumber, secondNumber, thirdNumber));
    }
    public static double methodAverage(double x, double y, double z){
        return (x + y + z) / 3;
    }
}
