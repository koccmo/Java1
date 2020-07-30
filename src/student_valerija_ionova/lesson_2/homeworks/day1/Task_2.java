package student_valerija_ionova.lesson_2.homeworks.day1;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.

class Task_2 {
    public static void main(String[] args) {

        System.out.println("Программа запрашивает два чила с точкой и выполняет: сложение, вычитание, умножение и деление :)");

        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Введите первое число: ");
        double firstNumber = myInput.nextDouble();

        // 2. get second number from user
        System.out.println("Введите второе число: ");
        double secondNumber = myInput.nextDouble();

        // 3. first number + second number
		// русские названия кирилицей? Давайте использовать ENG!
        double summa = firstNumber + secondNumber;
        double raznica = firstNumber - secondNumber;
        double umnozenie = firstNumber * secondNumber;
        double delenie = firstNumber / secondNumber;

        // 4. print result to console
        System.out.println("Сумма = " + summa);
        System.out.println("Разница = " + raznica);
        System.out.println("Произведение = " + umnozenie);
        System.out.println("Частное = " + delenie);

    }
}
