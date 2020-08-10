package student_anvars_intezars.home_tasks.lesson_7.day_6.task13;

import java.util.Arrays;

class CopyTest {

    public static void main(String[] args) {

        CopyTest copyTest = new CopyTest();
        copyTest.firsCopyTest();
        copyTest.secondCopyTest();
    }

    void firsCopyTest() {
        Copy copy = new Copy();
        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {2,3,4};
        int [] resultOfCopy = copy.copyInRange(firstArray,2,4);
        if (Arrays.equals(resultOfCopy,secondArray)) {
            System.out.println ("Test for copying a certain range of numbers in array = OK");
        }else {
            System.out.println("Test for copying a certain range of numbers in array = FAIL");
        }
    }

    void secondCopyTest() {
        Copy copy = new Copy();
        int[] firstArray = {2,5,7,10,2};
        int [] resultOfCopy = copy.copyInRange(firstArray,4,9);
        for (int i = 0; i < resultOfCopy.length; i++)
        System.out.println(resultOfCopy[i]);
    }

}
