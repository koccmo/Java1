package student_alexey_tretyakov.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число длины массива = ");
        int arrayLength = scanner.nextInt();

        int[] numbers = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + numbers[i]);
        }
    }
}
