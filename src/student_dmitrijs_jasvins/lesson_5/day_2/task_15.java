package student_dmitrijs_jasvins.lesson_5.day_2;

//Написать программу, в которой:
//        - создать массив целых чисел длиной 3,
//        - заполнить каждую ячейку массива случайным числом,
//        - вывести значение каждой ячейки на консоль,
//        - увеличить значение каждой ячейки на 2,
//        - вывести значение каждой ячейки на консоль.

import java.util.Random;

public class task_15 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("[" + i + "] = " + numbers[i]);
        }
        System.out.println("Increasing array + 2");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 2;
            System.out.println("[" + i + "] = " + numbers[i]);
        }
    }
}
