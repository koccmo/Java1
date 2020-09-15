/*---------------------------------------------------
Написать программу, в которой:
 - создать массив целых чисел длиной 3,
 - заполнить каждую ячейку массива случайным числом,
 - посчитать сумму всех ячеек и вывести ее на консоль.
 ---------------------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_2;

import java.util.Random;

public class Task_13 {

    public static void main(String[] args) {
        int[] randomNumbers = new int[3];

        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(20);
            System.out.println(randomNumbers[i]);
            sum = sum + randomNumbers[i];
        }
        System.out.println("Array sum = " + sum);
    }

}
