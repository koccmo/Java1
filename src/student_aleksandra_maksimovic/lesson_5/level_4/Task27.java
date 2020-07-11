package student_aleksandra_maksimovic.lesson_5.level_4;

import java.util.Random;

/*
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
 */
public class Task27 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(70);
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
        int max = arr[0];
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Max = " + max);
    }
}
