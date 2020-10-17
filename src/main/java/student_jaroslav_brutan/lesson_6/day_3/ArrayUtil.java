package student_jaroslav_brutan.lesson_6.day_3;

import java.util.Random;

public class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(40);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Number in the index Nr " + (i + 1) + " is " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i : array) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        return minNumber;
    }

    public boolean doesContainNumber(int[] array, int specNumber) {
        for (int i : array) {
            if (i == specNumber) {
                return true;
            }
        }
        return false;
    }

    public int howMuchArrayContainsSpecificNumber(int[] array, int number) {
        int result = 0;
        for (int i : array) {
            if (i == number) {
                result++;
            }
        }
        return result;
    }

    public int replaceFirstNumber(int[] array, int numberToReplace, int newNumber) {
        for (int i : array) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
        return newNumber;
    }

    public int replaceConcreteArrayNumbers(int[] arr, int numberToReplace, int newNumber) {
        for (int i : arr) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
        return numberToReplace;
    }

    public int[] reverseNumbersInArray(int[] array){
        int[] reverseNumbers = new int[array.length];
        for (int i : array){
            reverseNumbers[reverseNumbers.length-1-i] = array[i];
        }
        return reverseNumbers;
    }

    public void sortArray(int[] array){
        int number;
        boolean sorted = false;
        while (!sorted){
            for (int i = 0; i < array.length-1;i++){
                if (array[i] > array[i+1]){
                    number = array[i];
                    array[i] = array[i+1];
                    array[i+1] = number;
                }
            }
            sorted = true;
            for (int j = 0; j < array.length-1; j++){
                if (array[j] > array[j+1]){
                    sorted = false;
                    break;
                }
            }
        }
    }
}
