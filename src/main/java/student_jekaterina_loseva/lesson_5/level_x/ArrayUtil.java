package student_jekaterina_loseva.lesson_5.level_x;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public int getArrayLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length of array: ");
        return scanner.nextInt();
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public int[] createArrayWithRandomLength() {
        Random random = new Random();
        return new int[random.nextInt(20)];
    }

    public void fillArrayWithNumbers(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please, enter a number: ");
            array[i] = scanner.nextInt();
        }
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.print("Array is: \n [ ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println("]");
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

    public void findEvenNumbers(int[] array) {
        for (int evenNumber : array) {

            if (evenNumber % 2 == 0) {
                System.out.println("Even number is = " + evenNumber);
            }
        }
    }

    public void findOddNumbers(int[] array) {
        for (int evenNumber : array) {

            if (evenNumber % 2 != 0) {
                System.out.println("Odd number is = " + evenNumber);
            }
        }
    }

}
