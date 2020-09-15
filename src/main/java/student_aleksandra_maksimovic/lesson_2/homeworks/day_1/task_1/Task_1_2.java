package student_aleksandra_maksimovic.lesson_2.homeworks.day_1.task_1;

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {

      /*
      Написать консольную программу, которая запрашивает у пользователя два целых числа и
      выводит на консоль результаты: сложения, вычитания, умножения и деления.
      */

        //1. get first number from user
        System.out.println("Please enter your number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        input.nextLine(); // skip enter5

        //2. get operation from user
        System.out.println("Please enter operation");
        String operation = input.nextLine();

        //3. get second number from user
        System.out.println("Please enter your second number");
        int secondNumber = input.nextInt();

        //4.
        double result = 0;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        if (operation.equals("/")) {
            result = (double)firstNumber / secondNumber;
        }


        //5. print result to console
        System.out.println("result = " + result);

    }
}
