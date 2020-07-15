/*
Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.

class ArrayUtil {

    public void printArrayToConsole(int[] array) {
        // Write implementation here !!!
    }

}
 */
package student_igors_bartkevics.lesson_5.homework.level_6.task_35;

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

}