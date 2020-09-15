package student_eduards_jasvins.lesson_5.day_x;

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

    public void fillArrayFromUser(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array number: ");
            array[i] = scanner.nextInt();

        }
    }
    public void fillArrayWithRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }
    }
    public int[] createArrayWithRandom() {
        Random random = new Random();
        return new int[random.nextInt(15)];
    }
    public void printArrayInformationToConsole(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println("Smallest number is = " + min);
            }
        }
        return min;
    }
    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                System.out.println("Biggest number is = " + max);
            }
        }
        return max;
    }

    public void findEvenNumber(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                System.out.println("Even numbers is = " + array[i]);
    }
    public void findNotEvenNumber(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0)
                System.out.println("Uneven number is = " + array[i]);
    }

}
