/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.
 */
package student_igors_bartkevics.lesson_5.homework.level_2;

import java.util.Random;
public class Task_12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(10);
            System.out.print("a[" + i + "] = " + array[i] + " ");
        }
    }
}
