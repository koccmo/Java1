package student_aleksandra_maksimovic.lesson_6.level_4.task_18;

import java.util.Random;

/*
    Как объявить двумерный массив?
    Найти в интернете и написать пример кода в котором:
            - создать класс TwoDimensionalArray,
            - создать метод для заполнения массива случайными числами,
            - создать метод для подсчёта суммы всех чисел в массиве.

    Создать класс TwoDimensionalArrayTest и написать
    автоматические тесты для метода подсчёта суммы всех
    чисел в массиве.

 */
public class TwoDimensionalArray {


    public int[][] fillRandomTwoDimensionalArray() {
        int[][] array = new int [4][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int[] subArray = array[i];
            for(int j = 0; j < subArray.length; j++ ) {
                array[i][j] = random.nextInt(30);
            }

        }

        return array;
    }

    public int sumOffAllNumbersInTwoDimensionalArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int[] subArray = array[i];

            for (int j = 0; j < array[i].length; j++) {
                sum +=  array[i][j];
            }

        }
        return sum;
    }
}
