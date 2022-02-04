package roman.lesson_5.homework.day_4.task_25;

import java.util.Scanner;

public class ArrayNumbersFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of Array - ");
        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter number in Array - ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Number of masive [" + i + "] = " + array[i]);
        }
    }
}
