package student_aleksandra_maksimovic.lesson_5.level_2;

import java.util.Random;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать среднее значение и вывести его на консоль.
 */
public class Task14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println( "Average = " + average);
    }
}
