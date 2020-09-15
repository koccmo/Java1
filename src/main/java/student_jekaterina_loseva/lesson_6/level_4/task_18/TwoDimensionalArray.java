/*
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.
 */
package student_jekaterina_loseva.lesson_6.level_4.task_18;

import java.util.Random;

public class TwoDimensionalArray {

    public int[][] createArray(int arrayLength, int secondArrayLength) {
        return new int[arrayLength][secondArrayLength];
    }

    public void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j= 0; j < array.length; j++)
            array[i][j] = random.nextInt(20);
        }
    }

    public int sumNumbersOfArray(int[][] array){
        int arrayLength=array.length;
        int sum = 0;
        for (int[] value : array) {
            for (int j = 0; j < arrayLength; j++) {
                sum += value[j];
            }
        }
        System.out.println("Sum of numbers in array: "+ sum);
        return sum;
    }

}
