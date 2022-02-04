package roman.lesson_5.homework.day_2.task_14;

import java.util.Random;

public class ArrayMiddle {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(10);
            System.out.println("Aray numbe [" + i + "] = " + array[i]);
            sum += array[i];
        }
        double average = (double)sum / (double)array.length;
        System.out.println("Sum of numbers = " + sum);
        System.out.println("Average of numbers = " + average);
    }
}
