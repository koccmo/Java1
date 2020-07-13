package student_vladimir_kobenko.lesson5.homeworls.level_4;

import java.util.Scanner;
import java.util.Random;

public class Task_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int arrayLenght = sc.nextInt();

        int[] array = new int[arrayLenght];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int arrayElement = random.nextInt(100);
            array[i] = arrayElement;

        }

        System.out.println("Элементы массива");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
