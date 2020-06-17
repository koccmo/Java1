package student_alexey_tretyakov.lesson_2.day_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        // Enter first number;
        Scanner scannerNumber = new Scanner(System.in);

        System.out.print("Введите первое целое число = ");
        int firstNumber = scannerNumber.nextInt();

        // Enter second number;
        System.out.print("Введите второе целое число = ");
        int secondNumber = scannerNumber.nextInt();

        // Now put result to screen;
        int Result = firstNumber + secondNumber;
        System.out.println("Результат сложения чисел = "+Result);
        Result = firstNumber - secondNumber;
        System.out.println("Результат вычитания чисел = "+Result);
        Result = firstNumber * secondNumber;
        System.out.println("Результат умножения чисел = "+Result);
        Result = firstNumber / secondNumber;
        System.out.println("Результат деления чисел = "+Result);

    }
}