package student_volodya_danilin.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;


public class TwoDimensionalArray {

    public int[][] createTwoDimensionalArray(int arrayRows, int arrayCols) {
        return new int[arrayRows][arrayCols];
    }

    public int[][] fillArrayWithRandomNumbers(int[][] array) {
        Random randomNumber = new Random();

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = randomNumber.nextInt(100);
            }
        }
        return array;
    }

    public int calculateSum(int[][] array) {
        int sum = 0;

        for (int[] arr : array) {
            for (int i : arr) {
                sum+=i;
            }
        }
        return sum;
    }

}

class TwoDimensionalArrayTest {
    private int[][] testArray;
    private TwoDimensionalArray twoDimensionalArray;

    public static void main(String[] Args) {

        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();

        twoDimensionalArrayTest.shouldCreate2dArray();
        twoDimensionalArrayTest.print2dArray("Creating new 2d array...");

        twoDimensionalArrayTest.shouldFill2dArrayWithRandomNumbers();
        twoDimensionalArrayTest.print2dArray("Filling array with random numbers...");

        twoDimensionalArrayTest.shouldFind2dArraySum();



    }

    public void print2dArray(String title) {
        System.out.println(title);
        for (int[] arrayRow : testArray) {
            System.out.println(Arrays.toString(arrayRow));
        }
    }

    public void shouldCreate2dArray() {
        this.twoDimensionalArray = new TwoDimensionalArray();
        this.testArray = twoDimensionalArray.createTwoDimensionalArray(5, 7);

    }

    public void shouldFill2dArrayWithRandomNumbers () {
        this.twoDimensionalArray.fillArrayWithRandomNumbers(this.testArray);
    }

    public void shouldFind2dArraySum() {
        int sum = twoDimensionalArray.calculateSum(this.testArray);
        System.out.println(sum);
    }
}

