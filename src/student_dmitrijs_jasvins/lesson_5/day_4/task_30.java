package student_dmitrijs_jasvins.lesson_5.day_4;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */

public class task_30 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(50);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i + "] = " + array[i]);
        }
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
