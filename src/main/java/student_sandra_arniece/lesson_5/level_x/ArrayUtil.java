package student_sandra_arniece.lesson_5.level_x;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayUtil {

    public int getArrayLengthFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input an integer for array length and press Enter: ");
        return sc.nextInt();
    }

    public int[] createUserLengthArray(int userArrayLength) {
        return new int[userArrayLength];
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void fillArrayWithUserNumbers(int[] array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input " + array.length + " integer numbers to fill the array, after each integer input pressing Enter:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomNumber = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(99);
        }
    }

    public int findHighestNumber(int[] array) {
        int maxNumber = array[0];
        for (int element : array) {
            if (element > maxNumber) {
                maxNumber = element;
            }
        }
        return maxNumber;
    }

    public int findLowestNumber(int[] array) {
        int minNumber = array[0];
        for (int element : array) {
            if (element < minNumber) {
                minNumber = element;
            }
        }
        return minNumber;
    }

    public int findEvenNumbers(int[] array) {
        int i = array[0];
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        return i;
    }

    public int findOddNumbers(int[] array) {
        int i = array[0];
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
        return i;
    }

}
