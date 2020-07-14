/*----------------------------------------------------
Напишите программу, в которой:
- создайте массив произвольной длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива
- найдите все чётные числа в массиве и выведети их на консоль.
------------------------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_4;

import java.util.Random;

public class Task_29 {

    public static void main(String[] args) {
        int[] numbers = new int[4];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
            System.out.println("[" + i + "]" + numbers[i]);
        }

        for (int evenNumber : numbers) {

            if (evenNumber % 2 == 0) {
                System.out.println("Even number is = " + evenNumber);
            }
        }
    }
}
