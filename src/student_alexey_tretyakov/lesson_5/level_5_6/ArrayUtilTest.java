package student_alexey_tretyakov.lesson_5.level_5_6;

import student_alexey_tretyakov.spec.Tester;

import java.util.Arrays;

public class ArrayUtilTest {

    public void shouldCreateArray ( int arreyLength ) {
        Tester testerArray = new Tester();
        ArrayUtil newArray = new ArrayUtil();
        int[] origArray = new int[arreyLength];
        int[] testArray = newArray.createArray(arreyLength);
        testerArray.testResult( Arrays.equals( origArray, testArray ) ,"Array creating.");
    }
    public void shouldFillArrayWithRandomNumbers( int [] inArray ) {
        Tester testerArray = new Tester();

        int [] origArray = Arrays.copyOf(inArray,inArray.length);

        ArrayUtil newArray = new ArrayUtil();
        newArray.createArray(inArray.length);
        int[] testArray;
        testArray = newArray.fillArrayWithRandomNumbers( inArray );
        testerArray.testResult( !Arrays.equals( origArray ,testArray ),"Fill array with random numbers.");
    }
    public void shouldFindMaxNumber( int [] inArray ) {
        Tester testerArray = new Tester();
        int [] origArray = Arrays.copyOf( inArray,inArray.length);
        int maxOrig = origArray[0];
        for ( int i=0; i < origArray.length; i++ ) {
            if (inArray[i] >= maxOrig) maxOrig = origArray[i];
        }
        ArrayUtil newArray = new ArrayUtil();
        newArray.createArray(inArray.length);
        testerArray.testResult(newArray.findMaxNumber( inArray ) == maxOrig, "Find maximum of array.");
    }
    public void shouldFindMinNumber( int [] inArray ) {
        Tester testerArray = new Tester();
        int [] origArray = Arrays.copyOf( inArray,inArray.length);
        int minOrig = origArray[0];
        for ( int i=0; i < origArray.length; i++ ) {
            if (inArray[i] <= minOrig) minOrig = origArray[i];
        }
        ArrayUtil newArray = new ArrayUtil();
        newArray.createArray(inArray.length);
        testerArray.testResult(newArray.findMinNumber( inArray ) == minOrig, "Find minimum of array.");
    }



    public static void main(String[] args) {
        ArrayUtil newArray = new ArrayUtil();
        int testLength = 7;
        int[] testArray = newArray.createArray( testLength );
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray( testLength );
        testArray = newArray.fillArrayWithRandomNumbers ( testArray );
        test.shouldFillArrayWithRandomNumbers( testArray );
        test.shouldFindMaxNumber( testArray );
        test.shouldFindMinNumber( testArray );

    }
}

