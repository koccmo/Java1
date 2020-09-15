package student_jekaterina_loseva.lesson_2.day_1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int numberOne = scanner.nextInt();
        System.out.println("Введите второе число:");
        int numberTwo = scanner.nextInt();

        int summary = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiply = numberOne * numberTwo;
        int division = numberOne / numberTwo;

        System.out.println("Рузультат сложения: " + summary);
        System.out.println("Рузультат вычитания: " + subtraction);
        System.out.println("Рузультат умножения: " + multiply);
        System.out.println("Рузультат деления: " + division);
    }

}
