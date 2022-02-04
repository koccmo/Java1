package roman.lesson_5.homework.day_2.task_15;

import java.util.Random;

public class ArrayPlusTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            array[i] = random.nextInt(10);
            System.out.print("Array [" + i + "] = " + array[i] + " ");
            array[i] += 2;
            System.out.print("Array new [" + i + "] = " + array[i] + " ");
        }


    }
}
