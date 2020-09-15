package student_aleksandra_maksimovic.lesson_5.level_x.supertask_1;


import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public int getLengthFromUser(){
        System.out.println("Enter array length - ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        return length;
    }

    public int[] newArray(int arrayLength) {
        int []newArray = new int [arrayLength];
        return newArray;
    }
    // fill Array
    public void fillArray(int[] newArray) {
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i < newArray.length; i++) {
            System.out.println("Enter input element Nr :" +(i+1));
            newArray[i] = scanner.nextInt();
        }
    }
    // print array
    public void printArray(int[] array) {
        System.out.print("Array : ");
        for (int element: array) {
            System.out.print("[" + element + "]" );
        }
        System.out.println();
    }
    // random
    public void fillRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
    }
    // find Max
    public int findMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }
    // find Min
    public int findMin(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
    // find even Numbers
    public void printEvenNumbers(int[] array) {
        System.out.print("Even numbers :");
        for(int element : array) {
            if (element % 2 == 0) {
                System.out.print( element + " ");
            }
        }
        System.out.println();
    }
    // find odd Numbers
    public void printOddNumbers(int[] array) {
        System.out.print("Odd numbers : ");
        for(int element : array) {
            if (element % 2 != 0) {
                System.out.print( element + " ");
            }
        }
        System.out.println();
    }
}