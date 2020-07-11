package student_aleksandra_maksimovic.lesson_5.level_2;

import java.util.Random;

/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.
 */
public class Task13 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(200);
             sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
    }
}
