package student_georgij_galin.lesson5.level_5_6;

import java.util.Random;

public class ArrayUtil {

    public int [] createArray(int arrayLength){
        int newArray [] = new int [arrayLength];
        return newArray;
    }

    public void fillArrayWithRandomNumbers(int [] array){
        Random random = new Random();
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int [] array){
        for (int element:array
        ) {
            System.out.print(element+" ");
        }
        System.out.println("\n");
    }

    public int findMaxNumber (int [] array){
        int max = array[0];
        for (int element:array
        ) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array){
        int min =array[0];
        for (int element:array
        ) {
            if (element < min){
                min = element;
            }
        }
        return min;
    }
}
