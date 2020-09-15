package student_valerija_ionova.lesson_7.homeworks.level_6.task_13;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CopyVariant2Test {

    public static void main (String [] args){

        CopyVariant2Test copyVariant2Test = new CopyVariant2Test();

        copyVariant2Test.testPositiveNumbers();
        copyVariant2Test.testNegativeNumbers();
        copyVariant2Test.testAllNumbers();
    }

    void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }

    void testPositiveNumbers(){
        CopyVariant2 copyVariant2 = new CopyVariant2();
        int [] array = {1, 8, 5, 9, 6, 7, 7, 3, 10};
        int [] expectedArray = {5, 6, 7, 7};
        printResult("Test for positive numbers",
                Arrays.equals(copyVariant2.copyInRange(array, 4, 7), expectedArray));
    }

    void testNegativeNumbers(){
        CopyVariant2 copyVariant2 = new CopyVariant2();
        int [] array = {-1, -8, -5, -9, -6, -7, -7, -3, -10};
        int [] expectedArray = {-8, -5, -6, -7, -7, -3};
        printResult("Test for negative numbers",
                Arrays.equals(copyVariant2.copyInRange(array, -8, -2), expectedArray));
    }

    void testAllNumbers(){
        CopyVariant2 copyVariant2 = new CopyVariant2();
        int [] array = {-1, -8, 0, 9, -6, 7, -7, -3, 10, -25};
        int [] expectedArray = {-1, 0, -6, -7, -3};
        printResult("Test for all numbers",
                Arrays.equals(copyVariant2.copyInRange(array, -7, 5), expectedArray));
    }

}
