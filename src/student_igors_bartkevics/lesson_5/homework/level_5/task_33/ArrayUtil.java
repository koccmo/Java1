/*
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.

class ArrayUtil {

    public void fillArrayWithRandomNumbers(int[] array) {
        // Write implementation here !!!
    }

}
 */
package student_igors_bartkevics.lesson_5.homework.level_5.task_33;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(Random random, int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            array[i] = random.nextInt(10);
        }
    }
}