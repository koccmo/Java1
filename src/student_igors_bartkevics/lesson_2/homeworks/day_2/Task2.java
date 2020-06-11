package student_igors_bartkevics.lesson_2.homeworks.day_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        double FirstNumber = scanner.nextFloat();

        System.out.print("Enter second number:");
        double SecondNumber = scanner.nextFloat();

        float dev = (float) (FirstNumber / SecondNumber);
        double sum = FirstNumber + SecondNumber;
        double sub = FirstNumber - SecondNumber;
        double multiple = FirstNumber * SecondNumber;
        double division = FirstNumber / SecondNumber;

        System.out.println(FirstNumber + " + " + SecondNumber + " = " + sum);
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + sub);
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + multiple);
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + dev);
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + division);

    }
}