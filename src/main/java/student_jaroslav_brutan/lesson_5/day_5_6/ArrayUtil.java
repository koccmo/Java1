package student_jaroslav_brutan.lesson_5.day_5_6;

import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength){
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[]array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(40);
        }
    }
    public void printArrayToConsole(int[]array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Number in the index Nr " + (i+1) + " is " + array[i]);
        }
    }
    public int findMaxNumber(int[]array){
        int maxNumber = array[0];
        for (int i : array){
            if (i > maxNumber){
                maxNumber = i;
            }
        }
        return maxNumber;
    }
    public int findMinNumber(int[]array){
        int minNumber = array[0];
        for (int i : array){
            if (i < minNumber){
                minNumber = i;
            }
        }
        return minNumber;
    }
}


