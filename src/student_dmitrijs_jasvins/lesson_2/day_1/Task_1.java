package student_dmitrijs_jasvins.lesson_2.day_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter Second number");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = firstNumber / (double) secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);

    }

}