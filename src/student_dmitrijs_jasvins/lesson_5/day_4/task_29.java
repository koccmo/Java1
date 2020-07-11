package student_dmitrijs_jasvins.lesson_5.day_4;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */

import java.util.Random;

public class task_29 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(50);
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i + "] = " + array[i]);
        }
        System.out.println("Even numbers : ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
