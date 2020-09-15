package student_aleksandra_maksimovic.lesson_6.level_3;

import student_aleksandra_maksimovic.testing.Tester;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.createArrayTest();
        test.findNumberTest();
        test.ifContainsNumberTest();
        test.findNumberCountTest();
        test.compareTest();
        test.replaceTest();
        test.replaceAllTest();
        test.reverseTest();
        test.bubbleSortTest();
    }

    ArrayUtil arrayUtil = new ArrayUtil();
    Tester tester= new Tester();

    public void createArrayTest() {
        int[] arrTest =  arrayUtil.createArray(6);
        tester.check(arrTest.length == 6, "ArrayUtil createArray test #1");
    }

    public void findNumberTest() {
        int[] arr1 = new int[] { 34, 10, 15, 1, 5 };
        tester.check(arrayUtil.findMinNumber(arr1) == 1, "ArrayUtil findMinNumber test #1");
        tester.check(arrayUtil.findMaxNumber(arr1) == 34,"ArrayUtil findMaxNumber test #2");
    }

    public void ifContainsNumberTest() {
        int[] array = new int[] { 12, 10, 2, 6, 15, -6};
        tester.check(arrayUtil.ifContainsNumber(array,12),"ArrayUtil ifContainsNumber test #1");
        tester.check(!arrayUtil.ifContainsNumber(array, 0), "ArrayUtil ifContainsNumber test #2");
    }

    public void findNumberCountTest() {
        int[] array = new int[] {4, 0, 0, 4, 0, 4, 4, 1, 0, 0, 0, 0, 0};
        tester.check(arrayUtil.findNumberCount(array,0) == 8, "ArrayUtil findNumberCount test #1");
        tester.check(arrayUtil.findNumberCount(array, 3) == 0, "ArrayUtil findNumberCount test #2");
    }

    public void compareTest() {
        tester.check(arrayUtil.compare(new int[]{ 1, 2, 3}, new int[]{ 1, 2, 3}), "ArrayUtil compare test #1");
        tester.check(!arrayUtil.compare(new int[]{ 1, 2, 3}, new int[]{ 1, 2 } ), "ArrayUtil compare test #2");
        tester.check(!arrayUtil.compare(new int[]{ 1, 2 }, new int[]{ 1, 2, 3 }), "ArrayUtil compare test #3");
        tester.check(!arrayUtil.compare(new int[]{ 3, 2, 1 }, new int[]{ 1, 2, 3}), "ArrayUtil compare test #4");
    }

    public void replaceTest() {
        int[] array1 = new int[] {1, 1, 1, 3, 1, 1, 1};
        arrayUtil.replace(array1,3, 1);
        tester.check(arrayUtil.compare(array1, new int[] { 1, 1, 1, 1, 1, 1, 1}), "ArrayUtil replace test #1");

        int[] array2 = new int[] {1, 1, 1, 3, 1, 3, 1};
        arrayUtil.replace(array2,3, 1);
        tester.check(arrayUtil.compare(array2, new int[] { 1, 1, 1, 1, 1, 3, 1}), "ArrayUtil replace test #2 (only one number)");

        int[] array3 = new int[] { 1, 8, 1, 1, 2, 1};
        arrayUtil.replace(array3,3, 1);
        tester.check(arrayUtil.compare(array3, new int[] { 1, 8, 1, 1, 2, 1}), "ArrayUtil replace test #3 (not contains number to replace)");
    }

    public void replaceAllTest() {
        int[] array1 = new int[] { 1, 1, 1, 1, 1};
        arrayUtil.replaceAll(array1,1,3);
        tester.check(arrayUtil.compare(array1, new int[] { 3, 3, 3, 3, 3}), "ArrayUtil replace all test #1");

        int[] array2 = new int[] { 1, 5, 1, 5, 1};
        arrayUtil.replaceAll(array2,1,5);
        tester.check(arrayUtil.compare(array2, new int[] { 5, 5, 5, 5, 5}), "ArrayUtil replace all test #2");

        int[] array3 = new int[] { 1, 5, 1, 5, 1};
        arrayUtil.replaceAll(array3,4,5);
        tester.check(arrayUtil.compare(array3, new int[] { 1, 5, 1, 5, 1}), "ArrayUtil replace all test #3 (not contains number to replace)");
    }
    public void reverseTest() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        arrayUtil.reverse(array);
        tester.check(arrayUtil.compare(array, new int[] { 7, 6, 5, 4, 3, 2, 1}), "ArrayUtil reverse test #1");
    }
    public void bubbleSortTest() {
        int[] array = new int[] { 3, 4, 8, 6, 5, 1, 2, 7};
        arrayUtil.bubbleSort(array);
        tester.check(arrayUtil.compare(array, new int[] { 1, 2, 3, 4, 5, 6, 7, 8}), "ArrayUtil bubbleSort test #1");

    }

}
