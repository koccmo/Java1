package student_dmitrijs_jasvins.lesson_5.day_2.task_13;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.
 */

import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        int arraySum = ArraySum.sum(array);
        System.out.println("Array sum = " + arraySum);
    }
}
