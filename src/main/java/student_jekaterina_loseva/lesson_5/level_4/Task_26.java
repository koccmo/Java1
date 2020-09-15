/* -------------------------------------------
Напишите программу, в которой:
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 ----------------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length of array: ");
        int arrayLength = scanner.nextInt();

        int[] numbers;
        numbers = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number in array: " + numbers[i]);
        }
    }

}
