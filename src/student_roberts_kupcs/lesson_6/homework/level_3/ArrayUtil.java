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
    public int howMuchTimesNumberInArray(int[] array, int number) {
        int howMuch = 0;
        for (int num: array) {
            if (num == number) {
                howMuch++;
            }
        }
        return howMuch;
    }
    public void replaceFirstNumber(int[] array, int numberReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }
    public void replaceNumbers(int[] array, int numberReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberReplace) {
                array[i] = newNumber;
            }
        }
    }

}
