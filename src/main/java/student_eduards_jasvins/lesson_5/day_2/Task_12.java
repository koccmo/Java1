package student_eduards_jasvins.lesson_5.day_2;
/*
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - вывести значение каждой ячейки на консоль.

 */

import java.util.Random;

public class Task_12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[3];
        for (int i = 0; i < randomNumbers.length; i++ ){
            randomNumbers[i] = random.nextInt(100);
        }
        for (int number : randomNumbers) {
            System.out.println("Numbers = " + number);
        }

    }

}
