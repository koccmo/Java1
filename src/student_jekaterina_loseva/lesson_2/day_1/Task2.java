package student_jekaterina_loseva.lesson_2.day_1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое вещественное число:");
        double numberOne = scanner.nextDouble();
        System.out.println("Введите второе вещественное число:");
        double numberTwo = scanner.nextDouble();

        double summary = numberOne + numberTwo;
        double subtraction = numberOne - numberTwo;
        double multiply = numberOne * numberTwo;
        double division = numberOne / numberTwo;

        System.out.println("Рузультат сложения: " + summary);
        System.out.println("Рузультат вычитания: " + subtraction);
        System.out.println("Рузультат умножения: " + multiply);
        System.out.println("Рузультат деления: " + division);

    }

}




