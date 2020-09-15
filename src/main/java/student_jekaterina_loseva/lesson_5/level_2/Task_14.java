/*----------------------------------------------------
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.
 ----------------------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_2;

import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {
        int[] randomNumbers = new int[3];

        Random random = new Random();
        int sum = 0;
        double average = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(20);
            System.out.println(randomNumbers[i]);
            sum = sum + randomNumbers[i];
            average = (double)sum / 3;
        }
        System.out.println("Array average = " + average);
    }
}
