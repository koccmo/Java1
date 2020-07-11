package student_aleksandra_maksimovic.lesson_5.level_2;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль,
 - увеличить значение каждой ячейки на 2,
 - вывести значение каждой ячейки на консоль.
 */
public class Task15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println("[" + i + "] : " + numbers[i]);
        }
        System.out.println("Now adding 2");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
            System.out.println("[" + i + "] : " + numbers[i]);
        }

    }
}
