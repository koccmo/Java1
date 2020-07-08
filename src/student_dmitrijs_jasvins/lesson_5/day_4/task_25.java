package student_dmitrijs_jasvins.lesson_5.day_4;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */

import java.util.Scanner;

public class task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length :");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        System.out.println("Fill array's :");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);

        }
    }
}

