/*
Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMaxNumber(int[] array) {
        // Write implementation here !!!
    }
}
 */
package student_igors_bartkevics.lesson_5.homework.level_6.task_37;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(Random random, int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            System.out.println("Array[" + i + "] : " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    
}