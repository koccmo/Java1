package student_aleksandra_maksimovic.lesson_5.level_2;

import java.util.Random;

/*
 написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.
 */
public class Task12 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[3];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
            System.out.println("[" + i + "] : " + randomNumbers[i]);
        }

    }
}
