/*
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
------------------------------------------------------------------
Добавьте в класс ArrayUtil метод для проверки сколько раз содержит
массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
------------------------------------------------------------------
Добавьте в класс ArrayUtil метод для замены первого вхождения
указанного числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
------------------------------------------------------------------
Добавьте в класс ArrayUtil метод для замены вхождений указанного
числа в массиве целых чисел на другое число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
------------------------------------------------------------------
Добавьте в класс ArrayUtil метод для переворота массива целых чисел.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
что ваша реализацяия метода работает правильно.
 */
package student_jekaterina_loseva.lesson_6.level_3;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.testContainsNumber();
        test.testTimesNumberContainsInArray();
        test.testReplace();
        test.testReplaceAll();
        test.testFlipArray();
    }

    public void checkResult(String nameOfTest, boolean isOk) {
        if (isOk) {
            System.out.println(nameOfTest + " = OK");
        } else {
            System.out.println(nameOfTest + " = FAIL");
        }
    }

    public void shouldCreateArray() {
        ArrayUtil util = new ArrayUtil();
        int[] test = util.createArray(7);
        checkResult("Test createArray", test.length == 7);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] test = {13, 18, 21, 7, 9, 26, 15};

        int maxNumber = util.findMaxNumber(test);
        checkResult("Test maxNumber", maxNumber == 26);
    }

    public void shouldFindMinNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] test = {13, 18, 21, 7, 9, 26, 15};

        int minNumber = util.findMinNumber(test);
        checkResult("Test minNumber", minNumber == 7);
    }

    public void testContainsNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] test = {13, 18, 21, 7, 9, 26, 15};

        boolean testNumber = util.containsInArray(21, test);
        checkResult("Test containsNumber", testNumber);
    }

    public void testTimesNumberContainsInArray() {
        ArrayUtil util = new ArrayUtil();
        int[] test = {13, 18, 21, 7, 9, 26, 15};

        int testNumber = util.timesNumberContainsInArray(21, test);
        checkResult("Test how many times number contains in array", testNumber == 1);
    }

    public void testReplace() {
        ArrayUtil util = new ArrayUtil();
        int[] test = {13, 18, 28, 7, 9, 26, 15};

        int replacedNumber = util.replace(test, 18, 19);
        checkResult("Test is number replaced", replacedNumber == 18);
        for (int value : test) {
            System.out.println(value);
        }
    }

    public void testReplaceAll() {
        ArrayUtil util = new ArrayUtil();
        int[] test = {13, 18, 21, 18, 9, 18, 15};

        int replacedNumber = util.replaceAll(test, 18, 19);
        checkResult("Test are numbers replaced", replacedNumber == 18);
        for (int value : test) {
            System.out.println(value);
        }
    }

    public void testFlipArray() {
        ArrayUtil util = new ArrayUtil();
        int[] test = {13, 18, 21, 18, 9, 18, 15};

        int[] flip = util.flipArray(test);
        checkResult("Test are numbers flip", Arrays.equals(flip, test));
        for (int value : test) {
            System.out.println(value);
        }
    }

}
