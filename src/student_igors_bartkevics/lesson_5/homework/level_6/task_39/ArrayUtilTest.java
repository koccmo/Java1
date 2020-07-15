/*
В классе ArrayUtilTest напишите автоматический тест
для метода int findMinNumber(int[] array)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }

    public void shouldFillArrayWithRandomNumbers() {
        // Write test implementation here !!!
    }

    public void shouldFindMaxNumber() {
        // Write test implementation here !!!
    }

    public void shouldFindMinNumber() {
        // Write test implementation here !!!
    }
}
 */
package student_igors_bartkevics.lesson_5.homework.level_6.task_39;

import java.util.Random;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
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

    public void shouldFindMaxNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult((arrayUtil.findMaxNumber(array) == 9), "Find max number test");
    }

    public void shouldFindMinNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult((arrayUtil.findMinNumber(array) == 0), "Find min number test");
    }

}
