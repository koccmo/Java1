package student_anvars_intezars.home_tasks.lesson_5.day_5_and_6;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt(10);
            array[i] = randomNumber;
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public void findMaxNumber(int[] array) {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxElement < array[i]) {
                maxElement = array[i];
                System.out.println("The largest value of array is " + maxElement);
            }
        }
    }
    public void findMinNumber(int[] array) {
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minElement > array[i]) {
                minElement = array[i];
               System.out.println("The smallest value of array is " + minElement);
            }
        }
    }
}


