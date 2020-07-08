package student_alexey_tretyakov.lesson_5.level_5_6;

import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[ arrayLength ];
    }
    public int[] fillArrayWithRandomNumbers( int[] numbers ) {
        Random random = new Random();
        int[] randomArray= new int [numbers.length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
    public void printArrayToConsole(int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            System.out.println(" Значения в " + (i + 1) + " ячейке = " + inArray[i]);
        }
    }
    public int findMaxNumber(int[] inArray) {
        int maxInt = inArray[0];
        for (int value : inArray) {
            if (value >= maxInt) maxInt = value;
        }
        return maxInt;
    }
    public int findMinNumber(int[] inArray) {
        int minInt = inArray[0];
        for (int value : inArray) {
            if (value <= minInt) minInt = value;
        }
        return minInt;
    }
    public void printEvenNumber(int[] inArray) {
        for (int i =0; i < inArray.length; i++) {
            if (inArray[i] % 2 == 0 ) {
                System.out.println(" Чётное значение  в " + (i + 1) + " ячейке = " + inArray[i]);
            }
        }
    }
    public void printOddNumber(int[] inArray) {
        for (int i =0; i < inArray.length; i++) {
            if (inArray[i] % 2 != 0 ) {
                System.out.println(" Нечётное значение  в " + (i + 1) + " ячейке = " + inArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        ArrayUtil newArray = new ArrayUtil();
        int[] myArray = newArray.createArray(10);
        myArray = newArray.fillArrayWithRandomNumbers( myArray );
        newArray.printArrayToConsole(myArray);
        /*System.out.println(newArray.findMinNumber(myArray));
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            //myArray[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + myArray[i]);
        }

         */
    }

}

