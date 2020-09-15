/*------------------------------------------------------------
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите наибольшее число в массиве и выведети его на консоль.
-------------------------------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_4;

import java.util.Random;

public class Task_27 {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        Random random = new Random();
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("[" + i + "]" + numbers[i]);

            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Max number is = " + max);
    }

}
