/*
Создайте в классе ArrayUtil метод для
нахождения минимального числа в массиве целых чисел.

class ArrayUtil {

    public int findMinNumber(int[] array) {
        // Write implementation here !!!
    }

}
 */
package student_igors_bartkevics.lesson_5.homework.level_x.super_task_1;
import java.util.Scanner;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0 ; i < array.length ; i++ ) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    public void fillArrayWithNumbers(int[] array) {
        Scanner scanner = new Scanner(System.in);
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

    public int getArrayLengthValueFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        return  scanner.nextInt();
    }

}