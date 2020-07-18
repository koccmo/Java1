/*------------------------------------------------
Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.
--------------------------------------------------
Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.
--------------------------------------------------
Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.
--------------------------------------------------
Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.
--------------------------------------------------
Создайте в классе ArrayUtil метод для
нахождения минимального числа в массиве целых чисел.
-------------------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_5;

import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];

        for (int value : array) {

            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];

        for (int value : array) {

            if (value < min) {
                min = value;
            }
        }
        return min;
    }

}
