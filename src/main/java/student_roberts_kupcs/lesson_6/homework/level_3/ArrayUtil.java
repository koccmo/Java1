package student_roberts_kupcs.lesson_6.homework.level_3;

import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] myArray = new int[arrayLength];
        return myArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int findMaxNumber(int[] array) {

        int maxNumber = array[0];

        for (int num : array) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {

        int minNumber = array[0];

        for (int num : array) {
            if (num < minNumber) {
                minNumber = num;
            }
        }
        return minNumber;
    }

    public boolean containsNumbers(int[] array, int numbers) {
        for (int num : array) {
            if (num == (numbers)) {
                return true;
            }
        }
        return false;
    }

    //Task_10
    // Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
    //Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

    public int howMuchTimesNumberInArray(int[] array, int number) {
        int howMuch = 0;
        for (int num : array) {
            if (num == number) {
                howMuch++;
            }
        }
        return howMuch;
    }

    //Task_11
    //Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
    //Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
    //
    //Подсказка: void replace(int[] arr, int numberToReplace, int newNumber).

    public void replace(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    // Task12
    // Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
    //Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.
    //
    //Подсказка: void replaceAll(int[] arr, int numberToReplace, int newNumber).

    public void replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

    // Task_13
    // Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
    //Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

    public void arrayMirror(int[] arr, int num) {
        int[] arr1 = new int[num];
        System.out.println("Array mirror :");

        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.println(arr1[i] + " ");

        }
    }

}
