package student_dmitrijs_jasvins.lesson_5.day_x;


import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        return scanner.nextInt();
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array's :");
            array[i] = scanner.nextInt();
        }
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }

    public int[] newArrayWithRandomLength() {
        Random random = new Random();
        return new int[random.nextInt(25)];
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

    public void findEvenNumber(int[] array) {
        System.out.println("Even number from array : ");
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.print(value + ", ");
            }
        }
    }

    public void findOddNumber(int[] array) {
        System.out.println("Odd numbers from array : ");
        for (int value : array) {
            if (value % 2 != 0) {
                System.out.print(value + ", ");
            }
        }
    }
}
