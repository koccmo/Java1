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

public class TwoDimensionalArrayTest {

    TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.shouldSumOfTwoDimensionalArrayNumbers();
    }

    public void shouldSumOfTwoDimensionalArrayNumbers() {
        int [][] twoDimArray = {{1, 2, 3, 4}, {3, 4, 5}};
        int expectedResult = 22;
        boolean condition = twoDimensionalArray.sumOfTwoDimensionalArrayNumbers(twoDimArray) == expectedResult;
        checkResult(condition, "Sum numbers of two dimensional array");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
