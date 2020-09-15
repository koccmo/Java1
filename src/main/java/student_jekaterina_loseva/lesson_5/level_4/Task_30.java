/*
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все нечётные числа в массиве и выведети их на консоль.
 */
package student_jekaterina_loseva.lesson_5.level_4;

import java.util.Random;

public class Task_30 {

    public static void main(String[] args) {
        int[] numbers = new int[4];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("[" + i + "]" + numbers[i]);
        }

        for (int oddNumber : numbers) {

            if (oddNumber % 2 != 0) {
                System.out.println("Odd number is = " + oddNumber);
            }
        }
    }
}
