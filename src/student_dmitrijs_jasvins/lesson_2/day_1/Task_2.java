package student_dmitrijs_jasvins.lesson_2.day_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Number");
        double FirstNumber = scanner.nextDouble();

        System.out.println("Enter Second number");
        double SecondNumber = scanner.nextDouble();

        double addition = FirstNumber + SecondNumber;
        double subtraction = FirstNumber - SecondNumber;
        double multiplication = FirstNumber * SecondNumber;
        double division = FirstNumber / SecondNumber;

        System.out.println(FirstNumber + " + " + SecondNumber + " = " + addition);
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + subtraction);
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + multiplication);
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + division);
    }
}

