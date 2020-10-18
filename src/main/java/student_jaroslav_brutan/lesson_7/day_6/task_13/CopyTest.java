package student_jaroslav_brutan.lesson_7.day_6.task_13;

import java.util.Arrays;

public class CopyTest {

    public static void main(String[] args) {
         CopyTest test = new CopyTest();
         test.copyNumbersTest1();
         test.copyNumbersTest2();
         test.copyNumbersTest3();
    }

    void copyNumbersTest1(){
        Copy copy = new Copy();
        int[] in = {1, 2, 3, 4, 5, 6, 7};
        int[] result = copy.copyInRange(in, 3, 6);
        int[] expected = {3, 4, 5, 6};
        if (Arrays.equals(result, expected)){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    void copyNumbersTest2(){
        Copy copy = new Copy();
        int[] in = {1, 4, 5, 2, 8, 7, 6};
        int[] result = copy.copyInRange(in, 3,7);
        int[] expected = {4, 5, 6, 7};
        if (Arrays.equals(result, expected)){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    void copyNumbersTest3(){
        Copy copy = new Copy();
        int[] in = {-5, -3, 2, 4, 6};
        int[] result = copy.copyInRange(in, -5, 2);
        int[] expected = {-5, -3, 2};
        if (Arrays.equals(result, expected)){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
