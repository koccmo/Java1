package student_valerija_ionova.lesson_2;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.

public class Task_2 {
    public static void main(String[] args) {
        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Enter first number: ");
        double firstNumber = myInput.nextDouble();

        // 2. get second number from user
        System.out.println("Enter second number: ");
        double secondNumber = myInput.nextDouble();

        // 3. first number + second number
        double summa = firstNumber + secondNumber;
        double raznica = firstNumber - secondNumber;
        double umnozenie = firstNumber * secondNumber;
        double delenie = firstNumber / secondNumber;

        // 4. print result to console
        System.out.println("Summa = " + summa);
        System.out.println("Raznica = " + raznica);
        System.out.println("Umnozhenie = " + umnozenie);
        System.out.println("Delenie = " + delenie);

    }
}
