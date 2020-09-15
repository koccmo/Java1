package student_aleksandra_maksimovic.lesson_5.level_4;

import java.util.Random;

/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
 */
public class Task29 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(80);
            System.out.println("[" + i + "] = " + arr[i]);
        }
        System.out.print("Even : ");
        for (int element : arr) {
            if ( element % 2 == 0 ){
                System.out.print(element + " ");
            }
        }

    }

}
