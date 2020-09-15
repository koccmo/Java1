/*
Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
https://proglib.io/p/java-sorting-algorithms
 */
package student_igors_bartkevics.lesson_6.homework.level_4.task_14;

import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    public void sortArray(int[] array) {
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length -1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length-1-i];
        }
        return newArray;
    }

    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public void replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public int howManyTimesArrayContainsSelectedNumber(int[] array, int number) {
        int result = 0;
        for (int value : array) {
            if (value == number) {
                result ++;
            }
        }
        return result;
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

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
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