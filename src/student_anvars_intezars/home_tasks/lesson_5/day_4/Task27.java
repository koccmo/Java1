package student_anvars_intezars.home_tasks.lesson_5.day_4;

import java.util.Random;

public class Task27 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[3];
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(10);
            array[i] = randomNumber;
            System.out.println("[" + i + "] = " + array[i]);
        }
        int maxElement = array[0];
        for (int value : array) {
            if (maxElement < value) {
                maxElement = value;
            }
        }System.out.println("The largest value of array is " + maxElement);
    }
}
