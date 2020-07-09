package student_aleksandra_maksimovic.lesson_5.level_4;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */
public class Task28 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(40);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
        int min = arr[0];
        for (int element : arr) {
            if (element < min ) {
                min = element;
            }
        }

        System.out.println("Min =" + min);
    }
}
