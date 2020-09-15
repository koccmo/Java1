package student_vladimir_kobenko.lesson5.homeworls.level_5;


import java.util.Random;

public class ArrayUtil {

    public int [] shouldCreateArray(int arrayLength){
    int newArray [] = new int [arrayLength];
    return newArray;
     }

    public int[] fillArrayWithRandomNumbers(int [] array){
        Random random = new Random();
        System.out.println("Array numbers:");
        for (int i=0; i<array.length; i++){
            array[i] = random.nextInt(100);
            System.out.println(array[i]);
        }
       return array;
    }

    public int findMaxNumber (int [] array){
        int max = array[0];
        for (int element:array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array){
        int min =array[0];
        for (int element:array) {
            if (element < min){
                min = element;
            }
        }
        return min;
    }

    }

