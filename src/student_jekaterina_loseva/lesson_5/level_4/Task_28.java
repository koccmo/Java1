/*------------------------------------------------------------------
Напишите программу, в которой:
        - создайте массив произвольной длины
        - заполните массив случайными числами
        - распечатайте на консоль все элементы массива
        - найдите наименьшее число в массиве и выведети его на консоль.
 -------------------------------------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_4;

import java.util.Random;

public class Task_28 {

    public static void main(String[] args) {
        int[] numbers = new int[4];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("[" + i + "]" + numbers[i]);
        }

        int min = numbers[0];
        for (int number : numbers) {

            if (number < min) {
                min = number;
            }

        }
        System.out.println("Min number is = " + min);
    }

}
