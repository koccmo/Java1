package roman.lesson_6.homework.day_4.task_18;

import java.util.Random;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray test = new TwoDimensionalArray();
        int[][] doubleArray = test.createDoubleArray(3, 3);
        test.fillUpTwoDimensionalArrayWithRandomNumbers(doubleArray);
        test.printDoubleArray(doubleArray);
        System.out.println(test.sumOfDoubleArray(doubleArray));
    }


    public int[][] createDoubleArray (int arrayLengthA, int arrayLengthB) {return new int[arrayLengthA][arrayLengthB];}

    public void fillUpTwoDimensionalArrayWithRandomNumbers (int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length;j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public int sumOfDoubleArray (int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public void printDoubleArray (int[][] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
            }
        }
    }

}
