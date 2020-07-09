package student_aleksandra_maksimovic.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array !");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
    }
}
