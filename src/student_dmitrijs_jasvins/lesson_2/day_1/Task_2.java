package student_dmitrijs_jasvins.lesson_2.day_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter Second number");
        double secondNumber = scanner.nextDouble();

        double addition = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);
    }
}

