package student_roberts_kupcs.lesson_6.homework.level_4;

//Task_18
// Как объявить двумерный массив?
//Найти в интернете и написать пример кода в котором:
//- создать класс TwoDimensionalArray,
//- создать метод для заполнения массива случайными числами,
//- создать метод для подсчёта суммы всех чисел в массиве.
//
//Создать класс TwoDimensionalArrayTest и написать
//автоматические тесты для метода подсчёта суммы всех
//чисел в массиве.

import java.util.Random;

class TwoDimensionalArray {
    public int[][] fillingArrayRandomNumbers() {
        Random rand = new Random();
        int[][] array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = rand.nextInt(50);

            }
        }
        return array;
    }
    public int sumOfArray(int[][] array) {
        int sum = 0;
        for (int i =0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
