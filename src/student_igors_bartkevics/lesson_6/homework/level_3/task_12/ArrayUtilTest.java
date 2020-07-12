/*
Добавьте в класс ArrayUtil метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализацяия метода работает правильно.

Подсказка: void replace(int[] arr, int numberToReplace, int newNumber).
 */
package student_igors_bartkevics.lesson_6.homework.level_3.task_12;

import java.util.Random;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.arrayContainsSelectedNumber();
        test.arrayContainsSelectedNumber_0_Times();
        test.arrayContainsSelectedNumber_2_Times();
        test.shouldReplaceSelectedNumberFirstlyMet();
        test.shouldReplaceAllSelectedNumbers();
    }

    ArrayUtil arrayUtil = new ArrayUtil();
    Random random = new Random();

    public void shouldReplaceAllSelectedNumbers() {
        int[] array = {2,0,4,6,9,0,1};
        arrayUtil.replaceAll(array, 0, 5);
        boolean condition = (arrayUtil.howManyTimesArrayContainsSelectedNumber(array,0) == 0) &&
                (arrayUtil.howManyTimesArrayContainsSelectedNumber(array,5) == 2);
        checkResult(condition, "Replace ALL selected numbers");
    }

    public void shouldReplaceSelectedNumberFirstlyMet() {
        int[] array = {2,0,4,6,9,0,1};
        arrayUtil.replace(array, 0, 5);
        boolean condition = (arrayUtil.howManyTimesArrayContainsSelectedNumber(array,0) == 1) &&
                (arrayUtil.howManyTimesArrayContainsSelectedNumber(array,5) == 1);
        checkResult(condition, "Replace selected number firstly met");
    }

    public void arrayContainsSelectedNumber_0_Times() {
        int[] array = {2,3,4,6,9,0,1};
        boolean condition = arrayUtil.howManyTimesArrayContainsSelectedNumber(array,5) == 0;
        checkResult(condition, "Array contains selected number 0 times");
    }

    public void arrayContainsSelectedNumber_2_Times() {
        int[] array = {2,3,0,6,9,0,1};
        boolean condition = arrayUtil.howManyTimesArrayContainsSelectedNumber(array,0) == 2;
        checkResult(condition, "Array contains selected number 2 times");
    }

    public void arrayContainsSelectedNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult(arrayUtil.isArrayContainsSelectedNumber(array,1), "Array contains selected number");
    }

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
        for (int value : array) {
            sum += value;
        }
        checkResult(!(sum==0),"Fill array with random numbers");
    }

    public void shouldFindMaxNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult((arrayUtil.findMaxNumber(array) == 9), "Find max number");
    }

    public void shouldFindMinNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult((arrayUtil.findMinNumber(array) == 0), "Find min number");
    }
}

