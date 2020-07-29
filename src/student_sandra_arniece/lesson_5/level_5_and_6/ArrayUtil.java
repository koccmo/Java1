package student_sandra_arniece.lesson_5.level_5_and_6; //Task 31,33,35,36,38

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(99);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
            i++;
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
            i++;
        }
        return minNumber;
    }

}
