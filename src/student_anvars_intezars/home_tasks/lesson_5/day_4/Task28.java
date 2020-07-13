package student_anvars_intezars.home_tasks.lesson_5.day_4;

import java.util.Random;

public class Task28 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[3];
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(10);
            array[i] = randomNumber;
            System.out.println("[" + i + "] = " + array[i]);
        }
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
            }
        }System.out.println("The smallest value of array is " + minElement);
    }
}
