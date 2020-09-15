package student_alexey_tretyakov.lesson_2.day_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        // Enter first number;
        Scanner scannerNumber = new Scanner(System.in);
        System.out.print("Введите целое число больше 0 (по умолчанию = 8) = ");
        int firstNumber = 8;

        if (scannerNumber.hasNextInt()) {
            firstNumber = scannerNumber.nextInt();
               // System.out.println( firstNumber );
            for (int i = 1; i <= 10; i++) {
                 System.out.println(firstNumber + " x " + i + " = " + i * firstNumber);
                }

        } else {
            System.out.println("Вы ввели не неправильное значение, запустите программу снова :)");
            for (int i = 1; i <= 10; i++) {
                System.out.println(firstNumber + " x " + i + " = " + i * firstNumber);
            }
        }


    }
}
