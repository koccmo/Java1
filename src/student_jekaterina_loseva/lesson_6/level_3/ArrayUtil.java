/*
Добавьте в класс ArrayUtil метод для проверки содержит ли
массив целых чисел указынное число.
-----------------------------------------------------------
Добавьте в класс ArrayUtil метод для проверки сколько раз
содержит массив целых чисел указынное число.
-----------------------------------------------------------
Добавьте в класс ArrayUtil метод для замены первого вхождения
указанного числа в массиве целых чисел на другое число.
-----------------------------------------------------------
Добавьте в класс ArrayUtil метод для замены вхождений указанного
числа в массиве целых чисел на другое число.
-----------------------------------------------------------
Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
 */
package student_jekaterina_loseva.lesson_6.level_3;

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

    public boolean containsInArray(int number, int[] array) {
        boolean result = false;
        for (int value : array) {
            if (value == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int timesNumberContainsInArray(int number, int[] array) {
        int result = 0;
        for (int value : array) {
            if (value == number) {
                result++;
                break;
            }
        }
        return result;
    }

    public int replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace){
                array[i] = newNumber;
                break;
            }
        }
        return numberToReplace;
    }

    public int replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
        return numberToReplace;
    }

    public int[] flipArray(int[] array) {
        int result;
        for (int i = 0; i < array.length / 2; i++) {
            result = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = result;
        }
        return array;
    }
}
