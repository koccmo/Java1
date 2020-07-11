/*

Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.
*/
package student_igors_bartkevics.lesson_5.homework.level_2;

import java.util.Random;
public class Task_14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];
            System.out.print("a[" + i + "] = " + array[i] + " ");
        }
        double average = (double)sum / (double)array.length;
        System.out.println("\nAverage of a[i] = " + average);
    }
}