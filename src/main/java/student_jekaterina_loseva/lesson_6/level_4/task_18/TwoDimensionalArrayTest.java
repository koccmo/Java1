/*
Создать класс TwoDimensionalArrayTest и написать
автоматические тесты для метода подсчёта суммы всех
чисел в массиве.
 */
package student_jekaterina_loseva.lesson_6.level_4.task_18;

public class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        TwoDimensionalArrayTest test = new TwoDimensionalArrayTest();
        test.testSumNumbersOfArray1();
        test.testSumNumbersOfArray2();
    }

    public void checkResult(String nameOfTest, boolean isOk) {
        if (isOk) {
            System.out.println(nameOfTest + " = OK");
        } else {
            System.out.println(nameOfTest + " = FAIL");
        }
    }

    public void testSumNumbersOfArray1() {
        TwoDimensionalArray array = new TwoDimensionalArray();
        int[][] test = {{13, 18, 21, 7}, {16, 5, 1, 8}, {12, 0, 4, 3}};
        int sum = array.sumNumbersOfArray(test);
        checkResult("Test testSumNumbersOfArray1", sum == 90);
    }

    public void testSumNumbersOfArray2() {
        TwoDimensionalArray array = new TwoDimensionalArray();
        int[][] test = {{13, 18, 21, 7}, {16, 5, 1, 8}, {12, 10, 4, 3}};
        int sum = array.sumNumbersOfArray(test);
        checkResult("Test testSumNumbersOfArray2", sum == 100);
    }

}
