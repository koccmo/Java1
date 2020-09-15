package student_aleksandra_maksimovic.lesson_5.level_4;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */
public class Task30 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(46);
            System.out.println("[" + i + "] = " + arr[i]);
        }
        System.out.print("Odd : ");
        for (int element : arr) {
            if (element % 2 != 0) {
                System.out.print(element + " ");
            }
        }
    }
}
