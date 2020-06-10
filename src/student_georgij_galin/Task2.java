package student_georgij_galin.Homeworks.LESSON2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Программа запрашивает два чила с точкой и выполняет: сложение, вычитание, умножение и деление :)");

        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Put first number ");
        double firstNumber = myInput.nextDouble();

        // 2. get second number from user
        System.out.println("Put second number ");
        double secondNumber = myInput.nextDouble();

        // 3. first number + second number
        double summa = firstNumber + secondNumber;
        double raznica = firstNumber - secondNumber;
        double umnozenie = firstNumber * secondNumber;
        double delenie = firstNumber / secondNumber;

        // 4. print result to console
        System.out.println("Sum = " + summa);
        System.out.println("Subtract = " + raznica);
        System.out.println("Multiplication = " + umnozenie);
        System.out.println("Division = " + delenie);

    }






}
