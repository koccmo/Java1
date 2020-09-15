package student_aleksandra_maksimovic.lesson_2.homeworks.day_1.task_1;

//Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.

import java.util.Scanner;

public class Task_1_1 {
    public static void main(String[] args) {

        // 1.  get first number from user
        System.out.println("Please enter your first number");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();

        //2. get second number from user
        System.out.println("Please enter your second number");
        int secondNumber = input.nextInt();

        //3. calculation
        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        double div = (double)firstNumber / secondNumber;


        //4. print result to console
        System.out.println("addition result = " + sum );
        System.out.println("subtraction result = " + sub);
        System.out.println("multiplication result = " + mul);
        System.out.println("division result = " + div);
    }


}
