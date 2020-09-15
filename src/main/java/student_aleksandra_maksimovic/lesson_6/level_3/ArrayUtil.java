package student_aleksandra_maksimovic.lesson_6.level_3;

import java.util.Random;

public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{ 4, 2, 1, 3, 5};
        //arrayUtil.reverse1(array);
        //arrayUtil.printArrayToConsole(array);
        arrayUtil.bubbleSort(array);
        arrayUtil.printArrayToConsole(array);
    }

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

    public boolean ifContainsNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
              return true;
            }
        }
        return false;
    }

    public int findNumberCount(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count ++;
            }
        }
        return count;
    }
    public boolean compare (int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public void replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++ ) {
            if ( array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

//    public int[] reverse(int[] array){
//        int[] reversArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//          reversArray[reversArray.length -1 -i] = array[i];
//        }
//        return reversArray;
//    }

    public void reverse(int[] array) {
        for(int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array [array.length -1 -i];
            array [array.length -1 -i] = tmp;
        }
    }
    public void bubbleSort(int[] array) {
        while (true) {
            boolean changed  = false;
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }
    }
}
