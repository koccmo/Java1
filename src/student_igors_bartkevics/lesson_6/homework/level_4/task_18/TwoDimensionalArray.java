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
package student_igors_bartkevics.lesson_6.homework.level_4.task_18;
import java.util.Random;
public class TwoDimensionalArray {


    public void fillTwoDimensionalArrayWithRandomNumbers(Random random, int[][] twoDimArray) {

        for (int row = 0; row < twoDimArray.length; row++) {
            for (int column = 0; column < twoDimArray[row].length; column++) {
                twoDimArray[row][column] = random.nextInt(100);
            }
        }
    }

    public int sumOfTwoDimensionalArrayNumbers(int[][] twoDimArray) {
        int sum = 0;
        for (int[] rowInts : twoDimArray) {
            for (int columnInt : rowInts) {
                sum += columnInt;
            }
        }
        return sum;
    }

}
