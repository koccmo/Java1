package student_eduards_jasvins.lesson_5.day_4;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */

import java.util.Random;

public class Task_27 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(25);
        int[] array =  new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
            System.out.println("[" + i + "] = " + array[i]);
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.println("Biggest number is = " + max);
            }
        }
    }
}
