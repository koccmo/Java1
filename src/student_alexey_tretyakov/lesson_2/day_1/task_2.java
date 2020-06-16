package student_alexey_tretyakov.lesson_2;

import java.util.Scanner;

class Task_3 {
    public static void main(String[] args) {

        // Enter first number;
        Scanner scannerNumber = new Scanner(System.in);
        System.out.print("Введите первое число = ");
        float firstNumber = scannerNumber.nextFloat();

        // Enter second number;
        System.out.print("Введите второе число = ");
        float secondNumber = scannerNumber.nextFloat();

        // Now put result to screen;
        float Result = firstNumber + secondNumber;
        System.out.println("Результат сложения чисел = " + Result);
        Result = firstNumber - secondNumber;
        System.out.println("Результат вычитания чисел = " + Result);
        Result = firstNumber * secondNumber;
        System.out.println("Результат умножения чисел = " + Result);
        Result = firstNumber / secondNumber;
        System.out.println("Результат деления чисел = " + Result);



    }
}