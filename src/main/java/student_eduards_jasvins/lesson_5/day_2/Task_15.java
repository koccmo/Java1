package student_eduards_jasvins.lesson_5.day_2;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        for (int number : array) {
            System.out.println("Numbers = " + number);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] += 2;
            System.out.println(" Numbers Array + 2 = " + array[i]);

        }
    }
}



