package student_dmitrijs_jasvins.lesson_2;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number");
        int FirstNumber = scanner.nextInt();

        System.out.println("Enter Second number");
        int SecondNumber = scanner.nextInt();

        int summa = FirstNumber + SecondNumber;
        int subtraction = FirstNumber - SecondNumber;
        int multiplication = FirstNumber * SecondNumber;
        int division = FirstNumber / SecondNumber;

        System.out.println(FirstNumber + " + " + SecondNumber + " = ");
        System.out.println(FirstNumber + " - " + SecondNumber + " = ");
        System.out.println(FirstNumber + " * " + SecondNumber + " = ");
        System.out.println(FirstNumber + " / " + SecondNumber + " = ");

    }


}