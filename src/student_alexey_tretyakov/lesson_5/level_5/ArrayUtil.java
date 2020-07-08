package student_alexey_tretyakov.lesson_5.level_5;

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

    public static void main(String[] args) {
        ArrayUtil newArray = new ArrayUtil();
        int[] myArray = newArray.createArray(10);
        myArray = newArray.fillArrayWithRandomNumbers(myArray);
        //Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            //myArray[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + myArray[i]);
        }
        myArray = newArray.fillArrayWithRandomNumbers(myArray);
        //Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            //myArray[i] = random.nextInt(1000);
            System.out.println(" Значения  в " + (i + 1) + " ячейке = " + myArray[i]);
        }


    }
}

