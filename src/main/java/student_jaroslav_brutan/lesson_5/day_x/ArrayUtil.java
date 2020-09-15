package student_jaroslav_brutan.lesson_5.day_x;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public int getArrayLengthFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }

    public int[] createArray(int arrayLength){
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithNumbers(int[] createArray){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < createArray.length; i++){
            System.out.println("Enter numbers for array");
            createArray[i] = scanner.nextInt();
        }
    }

    public void fillArrayWithRandomNumbers(int[] createArray){
        Random random = new Random();
        for (int i = 0; i < createArray.length; i++){
            createArray[i] = random.nextInt(20);
        }
    }

    public void printArrayToConsole(int[] array){
        for (int i : array){
            System.out.println("[" + i + "]");
        }
    }

    public int findMaxNumber(int[] array){
        int max = array[0];
        for (int i : array){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array){
        int min = array[0];
        for (int i : array){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    public void isEven(int[] array){
        for (int i : array){
            if (i % 2 == 0){
                System.out.println("Even number - " + i);
            }
        }
    }

    public void isOdd(int[] array){
        for (int i : array){
            if (i % 2 != 0){
                System.out.println("Odd number - " + i);
            }
        }
    }
}
