package student_alexey_tretyakov.lesson_5.level_5;

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
        //int [] origArray = new int [inArray.length];
        int [] origArray = Arrays.copyOf(inArray,inArray.length);
        
        ArrayUtil newArray = new ArrayUtil();
        newArray.createArray(inArray.length);
        int[] testArray;
        testArray = newArray.fillArrayWithRandomNumbers( inArray );
        testerArray.testResult( !Arrays.equals( origArray ,testArray ),"Fill array with random numbers.");

    }



    public static void main(String[] args) {
        ArrayUtil newArray = new ArrayUtil();
        int testLength = 3;
        int[] testArray = newArray.createArray(testLength);
        ArrayUtilTest arrayForTest = new ArrayUtilTest();
        arrayForTest.shouldCreateArray( testLength );
        testArray = newArray.fillArrayWithRandomNumbers ( testArray );
        arrayForTest.shouldFillArrayWithRandomNumbers( testArray );

    }
}

