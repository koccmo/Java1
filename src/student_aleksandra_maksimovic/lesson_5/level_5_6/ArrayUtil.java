package student_aleksandra_maksimovic.lesson_5.level_5_6;

import java.util.Random;

/*
31-Создайте класс ArrayUtil.
Создайте в этом классе метод для создания
массива целых чисел указанной длины.

33- Создайте в классе ArrayUtil метод для
заполнения массива целых чисел случайными числами.

35- Создайте в классе ArrayUtil метод для
распечатки массива целых чисел на консоль.

36-Создайте в классе ArrayUtil метод для
нахождения максимального числа в массиве целых чисел.

38- Создайте в классе ArrayUtil метод для
нахождения минимального числа в массиве целых чисел.
 */
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) ;
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }

    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

}