/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
*/
package student_igors_bartkevics.lesson_5.homework.level_4;

import java.util.Random;
public class Task_29 {

    public static void main(String[] args) {

        Task_29 task = new Task_29();
        Random random = new Random();

        int[] array = task.createArray(random);
        task.fillArrayWithRandomNumbers(random, array);
        task.printArrayOnScreen(array);
        task.printArrayEvenNumbers(array);
    }

    public int[] createArray(Random random) {
        int[] array = new int[random.nextInt(10) + 1];
        System.out.println("Array length = " + array.length);
        return array;
    }

    public void fillArrayWithRandomNumbers(Random random, int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            array[i] = random.nextInt(10);
        }
    }

    public void printArrayOnScreen(int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            System.out.println("Array[" + i + "] : " + array[i]);
        }
    }

    public void printArrayEvenNumbers(int[] array) {
        System.out.println("Array elements with even numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Array[" + i + "] : " + array[i]);
            }
        }
    }
}
