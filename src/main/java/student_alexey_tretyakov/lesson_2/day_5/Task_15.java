package student_alexey_tretyakov.lesson_2.day_5;

import java.util.Scanner;

public class Task_15 {

    public static void main(String[] args) {

        Scanner scannerNumber = new Scanner(System.in);
        System.out.println("Вводим число с переводом строки запроса на новую. ");
        System.out.println("Введите целое число  = ");
        int scanNumber = scannerNumber.nextInt();
        System.out.println("Вы ввели число  = " + scanNumber);

        System.out.println("Вводим число в строке запроса. ");
        System.out.print("Введите целое число  = ");
        scanNumber = scannerNumber.nextInt();
        System.out.println("Вы ввели число  = " + scanNumber);
    }
}
