package student_Alexey_Tretyakov.lesson_2.day_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        // Enter first number;
        Scanner scannerNumber = new Scanner(System.in);
        System.out.print("Введите целое число больше 0 (по умолчанию = 8) = ");

        if (scannerNumber.hasNextInt()) {
            int firstNumber = scannerNumber.nextInt();
               // System.out.println( firstNumber );
            for (int i = 1; i <= 10; i++) {
                 System.out.println(firstNumber + " x " + i + " = " + i * firstNumber);
                }

        } else {
            System.out.println("Вы ввели не целое число, запустите программу снова :)");
        }


    }
}
