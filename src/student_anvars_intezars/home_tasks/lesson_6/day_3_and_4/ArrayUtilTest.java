package student_anvars_intezars.home_tasks.lesson_6.day_3_and_4;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.firstArrayUtilTest();
        arrayUtilTest.findSameNumberTest();
        arrayUtilTest.replaceElementTest();
        arrayUtilTest.replaceAllElementTest();
        arrayUtilTest.reverseArrayTest();
        arrayUtilTest.sortArrayTest();
    }

    public void firstArrayUtilTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[4];
        int result = arrayUtil.checkArrayLength(array);
        if (array.length == result) {
            System.out.println("Test checking array length = OK");
        }
        else {
            System.out.println("Test checking array length = FAIL");
        }
    }

    public void findSameNumberTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1,2,3,4,2,2,2,};
        int result = arrayUtil.findTheSameNumber(array);
        if (result == 2) {
            System.out.println("Test for finding most repeated number = OK");
        }
        else {
            System.out.println("Test for finding most repeated number = FAIL");
        }
    }

    public void replaceElementTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1,2,3};
        arrayUtil.replace(array,0,4);
        if (array[0] == 4) {
            System.out.println("Test replacing element = OK");
        }
        else {
            System.out.println("Test replacing element = FAIL");
        }
    }

    public void replaceAllElementTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] array = {1,2,2,3};
        arrayUtil.replaceAll(array,3,4);
        if (array[3] == 4) {
            System.out.println("Test for replacing specific number = OK");
        }
        else {
            System.out.println("Test for replacing specific number = FAIL");
        }
    }

   public void reverseArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1,2,3,4,5};
        int[] arrayTwo = {5,4,3,2,1};
        arrayUtil.reverse(array);
        if (Arrays.equals(array,arrayTwo) ) {
            System.out.println("Test for reversing array = OK");
        }
        else {
            System.out.println("Test for reversing array = FAIl");
        }
    }

    public void sortArrayTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {3,1,2,5,4};
        int[] arrayTwo = {1,2,3,4,5};
        arrayUtil.sort(array);
        if (Arrays.equals(array,arrayTwo)) {
            System.out.println("Test for sorting array = OK");
        }
        else {
            System.out.println("Test for sorting array = FAIl");
        }
    }
}
