/*
Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.
 */
package student_igors_bartkevics.lesson_6.homework.level_3.task_9;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public boolean isArrayContainsSelectedNumber(int[] array, int number) {
        boolean result = false;
        for (int value : array) {
            if (value == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void fillArrayWithRandomNumbers(Random random, int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    public void fillArrayWithNumbers(Scanner scanner, int[] array) {
        for (int i = 0 ; i < array.length ; i++ ) {
            System.out.println("Enter array[" + i + "] : ");
            array[i] = scanner.nextInt();
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

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public void printEvenNumbersToConsole(int[] array) {
        System.out.println("Array elements with even numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Array[" + i + "] : " + array[i]);
            }
        }
    }

    public void printOddNumbersToConsole(int[] array) {
        System.out.println("Array elements with odd numbers: ");
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] % 2 == 0)) {
                System.out.println("Array[" + i + "] : " + array[i]);
            }
        }
    }

}