package student_eduards_jasvins.lesson_5.day_2;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.

 */

import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] sumRandom = new int[3];
        for (int i = 1; i < sumRandom.length; i++) {
            sumRandom[i] = random.nextInt(50);

        }
        int sum = 0;
        for (int arraySum : sumRandom) {
            sum += arraySum;
        }
        System.out.println("array sum = " + sum);
    }
}
