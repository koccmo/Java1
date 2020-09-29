package student_valerija_ionova.lesson_16.level_5.variant_1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumProblemTest {

    @Test
    public void test1 (){
        int [] array = {1, 2, 5, 8};
        TwoSumProblem twoSumProblem = new TwoSumProblem(array, 7);
        int [] result = twoSumProblem.getIndexesOfAddendum();
        int [] expectedResult = {1, 2};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test2 (){
        int [] array = {1, 2, 5, 8};
        TwoSumProblem twoSumProblem = new TwoSumProblem(array, 13);
        int [] result = twoSumProblem.getIndexesOfAddendum();
        int [] expectedResult = {2, 3};
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void test3 (){
        int [] array = {0, 17, 1, 18};
        TwoSumProblem twoSumProblem = new TwoSumProblem(array, 17);
        int [] result = twoSumProblem.getIndexesOfAddendum();
        int [] expectedResult = {0, 1};
        assertArrayEquals(expectedResult, result);
    }


}