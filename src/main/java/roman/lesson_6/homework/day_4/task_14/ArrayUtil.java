package roman.lesson_6.homework.day_4.task_14;

import java.util.Random;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil test = new ArrayUtil();

        int[] buu = test.createArray(4);
        test.fillArrayWithRandomNumbers(buu);
        test.printArrayToConsole(buu);
        System.out.println(test.findNumberInArray(buu,3));
        System.out.println(test.howManySelectNumbersInArray(buu,3));
        System.out.println("*************");
//        test.replace(buu, 3, 19);
//        test.replaceAllSelectNumbers(buu, 19, 45);
        test.printArrayToConsole(buu);
        System.out.println("*************");
        test.printArrayToConsole(test.turnAroundArrayNumbers(buu));
        System.out.println("*************");
        test.sortArray(buu);
        test.printArrayToConsole(buu);






    }
    public int[] createArray(int lengthArray) {return new int[lengthArray];}

    public void sortArray (int[] array) {
        boolean sort = false;
        int number;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    number = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = number;
                    sort = false;

                }
            }
        }
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(4);
        }
    }

    public int[] turnAroundArrayNumbers (int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[array.length-1-i];
        }
        return newArray;
    }

    public void replaceAllSelectNumbers (int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }
    public void replace(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                break;
            }
        }
    }

    public int howManySelectNumbersInArray (int[] array, int number) {
        int result = 0;
        for (int value : array) {
            if (value == number) {
                result ++;
            }
        }
        return result;
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array [" + i + "] = " + array[i]);
        }
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public boolean findNumberInArray (int[] array, int number) {
        boolean result = false;
        for (int value : array) {
            if (value == number) {
                result = true;
            }
        }
        return result;
    }
}
