package student_alexey_tretyakov.lesson_6.level_3;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil newArray = new ArrayUtil();
        int testArrayLength = 7;
        //int testEqualArrayLength = testArrayLength - 3;
        //int testNumber = 7;
        int[] testArray = newArray.createArray( testArrayLength );
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray( testArrayLength );

        testArray = newArray.fillArrayWithRandomNumbers ( testArray );
        test.shouldFillArrayWithRandomNumbers(testArray);
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindEqualNumber();
        test.shouldFindEqualNumberTimes();
        test.shouldReplace();
        test.shouldReplaceAll();
        test.shouldReverseArray();
        test.shouldResortArrayIncrease();
        test.shouldResortArrayDecrease();
    }

    public void shouldCreateArray ( int arrayLength ) {

        ArrayUtil newArray = new ArrayUtil();
        int[] originalArray = new int[ arrayLength ];
        int[] testArray = newArray.createArray( arrayLength );
        testResult( Arrays.equals( originalArray, testArray ) ,"Array creating.");
    }

    public void shouldFillArrayWithRandomNumbers( int [] inArray ) {

        int [] originalArray = Arrays.copyOf(inArray,inArray.length);
        ArrayUtil newArray = new ArrayUtil();
        newArray.createArray( inArray.length);
        int[] testArray;
        testArray = newArray.fillArrayWithRandomNumbers( inArray );
        testResult( !Arrays.equals( originalArray, testArray ),"Fill array with random numbers.");
    }

    public void shouldFindMaxNumber() {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        int maxValue = 21;
        ArrayUtil newArray = new ArrayUtil();
        testResult(newArray.findMaxNumber( testArray ) == maxValue, "Find maximum of array.");
    }

    public void shouldFindMinNumber() {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        int minValue = 3;
        ArrayUtil newArray = new ArrayUtil();
        testResult(newArray.findMinNumber( testArray ) == minValue, "Find minimum of array.");
    }

    public void shouldFindEqualNumber() {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        int equalNumber = 5;
        ArrayUtil newArray = new ArrayUtil();
        testResult(newArray.findEqualNumber( testArray,equalNumber ), "Find equal number of array.");
    }

    public void shouldFindEqualNumberTimes () {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        int equalNumber = 5;
        int inTimesValue = 2;
        ArrayUtil newArray = new ArrayUtil();
        testResult(newArray.findEqualNumberTimes( testArray, equalNumber ) == inTimesValue, "Find equal number times of array.");
    }

    public void shouldReplace () {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        ArrayUtil newArray = new ArrayUtil();
        newArray.replace( testArray, 7, 15 );
        testResult( testArray[2] == 15, "Replace first equal number of array.");
    }

    public void shouldReplaceAll () {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        ArrayUtil newArray = new ArrayUtil();
        newArray.replaceAll( testArray, 5, 15 );
        int[] expectedArray = { 3, 15, 7, 9, 11, 15, 21, 9, 15};
        testResult( Arrays.equals(testArray,expectedArray) , "Replace all equal numbers of array.");
    }

    public void shouldReverseArray () {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        ArrayUtil newArray = new ArrayUtil();
        testArray = newArray.reverseArray( testArray );
        int[] expectedArray = { 15, 9, 21, 5, 11, 9, 7, 5, 3};
        testResult( Arrays.equals(testArray,expectedArray) , "Reverse numbers in array.");
    }

    public void shouldResortArrayIncrease () {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        ArrayUtil newArray = new ArrayUtil();
        testArray = newArray.resortArrayIncrease( testArray );
        int[] expectedArray = { 3, 5, 5, 7, 9, 9, 11, 15, 21 };
        testResult( Arrays.equals(testArray,expectedArray) , "Sorting numbers to increase in array.");
    }

    public void shouldResortArrayDecrease () {
        int[] testArray = { 3, 5, 7, 9, 11, 5, 21, 9, 15};
        ArrayUtil newArray = new ArrayUtil();
        testArray = newArray.resortArrayDecrease( testArray );
        int[] expectedArray = { 21, 15, 11, 9, 9, 7, 5, 5, 3};
        testResult( Arrays.equals(testArray,expectedArray) , "Sorting numbers to decrease in array.");
    }


    private void testResult(boolean status, String testingString ) {
        if ( status ) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }
}

