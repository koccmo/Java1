/*
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.

Проведите рефакторинг программ написанных
в рамках Lesson 5 day 4 с использованием
созданного класса ArrayUtil и его методов.
*/
package student_igors_bartkevics.lesson_5.homework.level_x.super_task_1;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Enter the length of array:");
        int arrayLength = scanner.nextInt();
        int[] array = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandomNumbers(random, array);
        arrayUtil.printArrayToConsole(array);
    }
}
