package student_dmitrijs_jasvins.lesson_5.day_4;

import java.util.Random;
import java.util.Scanner;

/*
- запросите у пользователя с консоли длину массива
- создайте массив указанной пользователем длины
- заполните массив случайными числами
- распечатайте на консоль все элементы массива.
 */
public class task_26 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);

        }
    }
}
