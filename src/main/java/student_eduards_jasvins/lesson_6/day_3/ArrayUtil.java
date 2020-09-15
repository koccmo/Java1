package student_eduards_jasvins.lesson_6.day_3;



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

    public void fillArrayWithRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
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

    public boolean arrayContainsNumber(int[] array, int number) {
        boolean result = false;
        for (int value : array) {
            if (value == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int arrayContainsSelectedNumber(int[] array, int number) {
        int result = 0;
        for (int value : array) {
            if (value == number) {
                result++;
            }
        }
        return result;
    }

    public void replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
            break;
        }
    }

    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }

    public int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[reverseArray.length - 1 - i] = array[i];
        }
        return reverseArray;
    }

    public void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; array.length > j; j++) {
                if (array[i] < array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}





