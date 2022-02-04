package roman.lesson_5.homework.day_2.task_13;

import java.util.Random;

public class ArrayPlussSum {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(100);
            sum = array[0] + array[1] + array[2];
            //sum += array[i];
            System.out.println("Array number [" + i + "] = " + array[i]);
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
