package student_dmitrijs_jasvins.lesson_5.day_4;
/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наименьшее число в массиве и выведети его на консоль.
 */

import java.util.Random;

public class task_28 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(50);
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("[" + i + "] = " + numbers[i]);
        }
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The smallest array is : " + min);
    }
}
