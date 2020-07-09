package student_eduards_jasvins.lesson_5.day_4;

import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив числами полученными от пользователя
- распечатайте на консоль все элементы массива.
 */
public class Task_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array!");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        System.out.println("Fill arrays!");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "]" + numbers[i]);
        }
    }
}
