package student_eduards_jasvins.lesson_6.day_3;

import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.createArray();
        arrayUtilTest.fillArrayWithRandomNumbers();
        arrayUtilTest.shouldFindArrayContainsNumber();
        arrayUtilTest.shouldFindHowManyTimeContainsNumber();
        arrayUtilTest.shouldReplaceNumber();
        arrayUtilTest.shouldReplaceTwoNumbers();
        arrayUtilTest.reverseArray();
        arrayUtilTest.sortArray();

    }

    public void createArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] createArray = arrayUtil.createArray(7);
        if (createArray.length == 7) {
            System.out.println("Create array = OK");
        } else {
            System.out.println("Create array = FAIL");
        }
    }

    public void checkArray(String name, int[] methodsResult, int[] expectedResult) {
        if (Arrays.equals(methodsResult, expectedResult)) {
            System.out.println(name + "Test OK");
        } else {
            System.out.println(name + "Test FAIL");
        }

    }

    public void fillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandom(arrayNumber);
        if (arrayNumber[4] != 0 && arrayNumber[1] != 0 && arrayNumber[3] != 0) {
            System.out.println("Fill array with random numbers = OK");
        } else {
            System.out.println("Fill array with random numbers  = FAIL");
        }
    }

    public void checkContains(boolean condition, String name) {
        if (condition) {
            System.out.println(name + "Test OK");
        } else {
            System.out.println(name + "Test FAIL");
        }
    }

    public void shouldFindArrayContainsNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 5, 6, 9, 15};
        checkContains(arrayUtil.arrayContainsNumber(array,5), "Array contains number = ");


    }

    public void shouldFindHowManyTimeContainsNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 5, 6, 7, 8, 7};
        checkContains(arrayUtil.arrayContainsSelectedNumber(array, 7) == 2, "Array contains select number is 2 = ");
    }

    public void shouldReplaceNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 4, 4, 5, 6};
        arrayUtil.replace(array, 1, 3);
        int[] arrayReplace = {3, 2, 4, 4, 5, 6};
        checkArray("Replace array number = ", array, arrayReplace);

    }

    public void shouldReplaceTwoNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 9, 4, 5, 6};
        arrayUtil.replaceAll(array, 1, 77);
        int[] arrayReplace = {77, 2, 9, 4, 5, 6};
        checkArray("Replace array two numbers  = ", array, arrayReplace);
    }

    public void reverseArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] arrayReverse = {6, 5, 4, 3, 2, 1};
        checkArray("Reversed array = ", arrayUtil.reverseArray(array), arrayReverse);

    }

    public void sortArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 4, 5, 7, 3, 2, 6};
        arrayUtil.sortArray(array);
        int[] arraySort = {1, 2, 3, 4, 5, 6, 7};
        if (Arrays.equals(array, arraySort)) {
            System.out.println("Sort test = OK");
        } else {
            System.out.println("Sort test = FAIL");
        }
    }
}


