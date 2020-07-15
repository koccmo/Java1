package student_dmitrijs_jasvins.lesson_5.day_2;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива числом, запрошенным у пользователя,
 - вывести значение каждой ячейки на консоль.
 */

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number Nr " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        for (int value : numbers) {
            System.out.println("Number = " + value);
        }
    }
}
