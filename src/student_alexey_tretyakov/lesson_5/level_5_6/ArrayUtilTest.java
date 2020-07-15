package student_alexey_tretyakov.lesson_5.level_5_6;

import java.util.Arrays;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil newArray = new ArrayUtil();
        int testArrayLength = 7;
        int[] testArray = newArray.createArray( testArrayLength );
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray( testArrayLength );
        testArray = newArray.fillArrayWithRandomNumbers ( testArray );
        test.shouldFillArrayWithRandomNumbers( testArray );
        test.shouldFindMaxNumber( testArray );
        test.shouldFindMinNumber( testArray );

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
    public void shouldFindMaxNumber( int [] inArray ) {

        int [] originalArray = Arrays.copyOf( inArray, inArray.length);
        int maxValue = originalArray[0];
        for ( int i=0; i < originalArray.length; i++ ) {
            if (inArray[i] >= maxValue) maxValue = originalArray[i];
        }
        ArrayUtil newArray = new ArrayUtil();
        newArray.createArray(inArray.length);
        testResult(newArray.findMaxNumber( inArray ) == maxValue, "Find maximum of array.");
    }
    public void shouldFindMinNumber( int [] inArray ) {

        int [] originalArray = Arrays.copyOf( inArray, inArray.length);
        int minValue = originalArray[0];
        for ( int i=0; i < originalArray.length; i++ ) {
            if (inArray[i] <= minValue) minValue = originalArray[i];
        }
        ArrayUtil newArray = new ArrayUtil();
        newArray.createArray(inArray.length);
        testResult(newArray.findMinNumber( inArray ) == minValue, "Find minimum of array.");
    }
    private void testResult(boolean status, String testingString ) {
        if (status) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }
}

