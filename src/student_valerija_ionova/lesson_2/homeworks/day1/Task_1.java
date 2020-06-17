package student_valerija_ionova.lesson_2.homeworks.day1;

//Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Эта программа запрашивает 2 целых числа и выполняет: сложение, вычитание, умножение и деление");

        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Введите первое число: ");
        int firstNumber = myInput.nextInt();

        // 2. get second number from user
        System.out.println("Введите второе число: ");
        int secondNumber = myInput.nextInt();

        // 3. first number + second number
		// русские названия кирилицей? Давайте использовать ENG!
        int summa = firstNumber + secondNumber;
        int raznica = firstNumber - secondNumber;
        int umnozenie = firstNumber * secondNumber;
        double delenie = firstNumber / (double)secondNumber;

        // 4. print result to console
        System.out.println("Сумма = " + summa);
        System.out.println("Разница = " + raznica);
        System.out.println("Произведение = " + umnozenie);
        System.out.println("Частное = " + delenie);

    }
}
