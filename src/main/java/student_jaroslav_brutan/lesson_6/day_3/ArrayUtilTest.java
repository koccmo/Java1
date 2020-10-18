package student_jaroslav_brutan.lesson_6.day_3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.doesContainNumber();
        test.howMuchArrayContainsSpecificNumber();
        test.replaceFirstNumber();
    }

    public void doesContainNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[]array = {1, 2, 4, 6, 7, 9};
        boolean result = arrayUtil.doesContainNumber(array, 6);
        if (result){
            System.out.println("TEST - OK!");
        } else {
            System.out.println("TEST - FALSE!");
        }
    }

    public void howMuchArrayContainsSpecificNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[]array = {1, 2, 2, 4, 5, 5, 2};
        int result = arrayUtil.howMuchArrayContainsSpecificNumber(array, 2);
        if (result == 3){
            System.out.println("TEST - OK");
        } else {
            System.out.println("TEST - FALSE");
        }
    }

    public void replaceFirstNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[]array = {1, 2, 4, 5, 7, 8};
        int result = arrayUtil.replaceFirstNumber(array,1, 9);
        if (result == 9){
            System.out.println("TEST - OK");
        } else {
            System.out.println("TEST - FALSE");
        }
    }

    public void replaceConcreteArrayNumbers(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int result = arrayUtil.replaceConcreteArrayNumbers(array,3,6);
        if (result == 6) {
            System.out.println("TEST - OK");
        } else {
            System.out.println("TEST - FALSE");
        }
    }

    /*public void reverseNumbersInArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 2, 3, 4, 5};
        int result = arrayUtil.reverseNumbersInArray();
    }*/

    public void sortArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 5, 2, 6, 0, 4};
        arrayUtil.sortArray(array);
        int[] expectedArray = {0, 1, 2, 4, 5, 6};
        if (Arrays.equals(array, expectedArray)){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FALSE!");
        }
    }
}
