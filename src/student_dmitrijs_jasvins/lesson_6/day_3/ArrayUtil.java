package student_dmitrijs_jasvins.lesson_6.day_3;


import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }
    }

    public void printArrayInformation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
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

    // Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
    public boolean doesArrayContainsSpecifiedNumber(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    //Добавьте в класс ArrayUtil метод для проверки сколько раз содержит массив целых чисел указынное число.
    public int howMuchTimeArrayContainsSpecifiedNumber(int[] array, int number) {
        int result = 0;
        for (int element : array) {
            if (element == number)
                result++;
        }
        return result;
    }

    // Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
    public void replaceNumber(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    // Добавьте в класс ArrayUtil метод для замены вхождений указанного числа в массиве целых чисел на другое число.
    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    // Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
    public int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = array.length - 1 - i;
            reverse[newIndex] = array[i];
        }
        return reverse;
    }

    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
