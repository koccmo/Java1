package student_dmitrijs_jasvins.lesson_6.day_3;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();
        arrayUtilTest.sortTest();
    }

    private void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] createArray = arrayUtil.createArray(5);
        if (createArray.length == 5) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }


    private void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {35, 85, 42, 21, 1};

        int maxNumber = arrayUtil.findMaxNumber(array);
        if (maxNumber == 85) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {35, 85, 42, 21, 1};

        int minNumber = arrayUtil.findMinNumber(array);
        if (minNumber == 1) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void sortTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {7, 1, 4, 5, 2, 3, 3};
        arrayUtil.sort(array);
        int[] expectedArray = {1, 2, 3, 3, 4, 5, 7};
        if (Arrays.equals(array, expectedArray)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}


