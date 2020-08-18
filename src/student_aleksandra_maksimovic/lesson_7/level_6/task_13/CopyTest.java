package student_aleksandra_maksimovic.lesson_7.level_6.task_13;

import student_aleksandra_maksimovic.testing.Tester;

import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        CopyTest test = new CopyTest();

        test.notAllNumbersInRangeTest();
        test.noNumbersFromRangeTest();
        test.allNumbersInRangeTest();
        test.smallRangeTest();
    }

    Tester tester = new Tester();

    public void notAllNumbersInRangeTest() {
        Copy copy = new Copy();
        int[] in = { 1, 2, 3, 5, 4, 8, 1, 6, 7, 1, 11 };
        int[] result = copy.copyInRange(in, 2, 6);
        int[] expectedResult = {2, 3, 5, 4, 6 };
        tester.check(Arrays.equals(result, expectedResult), "Some numbers out of range test #1");

    }

    public void noNumbersFromRangeTest() {
        Copy copy = new Copy();
        int[] in = { 0, 0, 0, 0, 0, 0};
        int[] result = copy.copyInRange(in, 4,9);
        int[] expectedResult = {};
        tester.check(Arrays.equals(result, expectedResult), "No numbers in range test #1");
    }

    public void  allNumbersInRangeTest() {
        Copy copy = new Copy();
        int[] in = { 1, 2, 3, 4, 3, 2, 1, 1, 1, 2 };
        int[] result = copy.copyInRange(in, 1, 4);
        int[] expectedResult = { 1, 2, 3, 4, 3, 2, 1, 1, 1, 2 };
        tester.check(Arrays.equals(result, expectedResult), "All numbers in range test #1");
    }

    public void smallRangeTest() {
        Copy copy = new Copy();
        int[] in = { 1, 4, 7, 8, 9, 47, 58, 47, 47 };
        int[] result = copy.copyInRange(in, 47, 47);
        int[] expectedResult = { 47, 47, 47 };
        tester.check(Arrays.equals(result, expectedResult), "Small range test #1");
    }
}
