/*
В классе ArrayUtilTest напишите автоматический тест
метода void fillArrayWithRandomNumbers(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }
}
 */
package student_igors_bartkevics.lesson_5.homework.level_5.task_34;

import java.util.Random;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
    }

    ArrayUtil arrayUtil = new ArrayUtil();
    Random random = new Random();

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void shouldCreateArray() {
        int[] array = arrayUtil.createArray(3);
        boolean condition = (array.length == 3);
        checkResult(condition, "Create array");
    }

    public void shouldFillArrayWithRandomNumbers() {
        int[] array = new int[10];
        int sum = 0;
        arrayUtil.fillArrayWithRandomNumbers(random, array);
        for (int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        checkResult(!(sum==0),"Fill array with random numbers");
    }

}
