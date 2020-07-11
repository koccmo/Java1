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

    public void checkResult(String testName, int result, int expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void checkResult2(String testName, int result) {
        if (!(result == 0)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
        //ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(3);
        checkResult("Create array test", array.length, 3);
    }

    public void shouldFillArrayWithRandomNumbers() {
        int[] array = new int[10];
        int sum = 0;
        arrayUtil.fillArrayWithRandomNumbers(random, array);
        for (int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        checkResult2("Fill array with random numbers test", sum);
    }

    public void shouldFindMaxNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult("Find max number test", arrayUtil.findMaxNumber(array), 9);
    }

    public void shouldFindMinNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult("Find min number test", arrayUtil.findMinNumber(array), 0);
    }

}
