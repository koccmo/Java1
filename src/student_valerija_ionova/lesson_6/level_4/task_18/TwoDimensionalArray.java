package student_valerija_ionova.lesson_6.level_4.task_18;

/*Как объявить двумерный массив?
Найти в интернете и написать пример кода в котором:
- создать класс TwoDimensionalArray,
- создать метод для заполнения массива случайными числами,
- создать метод для подсчёта суммы всех чисел в массиве.

int[][] arr = new int[10][20]; vert-gor

Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.*/

import java.util.Random;

class TwoDimensionalArray {

    public int[][] newFilledTwoDimensionalArray(){
        int [][] newArray = new int [5][6];
        Random random = new Random();
        for (int i=0; i<5; i++){
            for (int j=0; j<6; j++){
                newArray[i][j] = random.nextInt(100);
            }
        }

        return newArray;
    }

    public int sumOfTwoDimensionalArray(int [] [] array){
        int sum = 0;
        for (int i=0; i<5; i++){
            for (int j=0; j<6; j++){
                sum+=array[i][j];
            }
        }
        return sum;
    }

}
