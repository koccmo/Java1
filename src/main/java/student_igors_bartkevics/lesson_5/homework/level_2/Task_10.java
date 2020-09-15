/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива любым числом,
 - вывести значение каждой ячейки на консоль.
 */
package student_igors_bartkevics.lesson_5.homework.level_2;

import java.util.Random;

public class Task_10 {

    public static void main(String[] args) {

        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < 3; i++ ) {
            array[i] = random.nextInt(10);
            System.out.println(array[i]);
        }
    }

}
