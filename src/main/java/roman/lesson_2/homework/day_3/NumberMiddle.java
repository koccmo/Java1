package roman.lesson_2.homework.day_3;

import java.util.Scanner;

public class NumberMiddle {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter your first number:");
        double firstNumber = scanner.nextInt();
        System.out.println("Enter your second number:");
        double secondNumber = scanner.nextInt();
        System.out.println("Enter your theert number:");
        double threeNumber = scanner.nextInt();
        // First method
        double midlle = (firstNumber + secondNumber + threeNumber)/3;
        System.out.println("Your result = " + midlle);
        // Second method
        System.out.println("Your result = " + average(firstNumber, secondNumber, threeNumber));

    }
    public static double average(double x,double y,double z){
        return (x + y + z) / 3;
    }
}
