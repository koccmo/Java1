package roman.lesson_5.homework.day_2.task_12;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(7);
            System.out.println("Array number [" + i + "] = " + array[i]);
        }

    }
}
