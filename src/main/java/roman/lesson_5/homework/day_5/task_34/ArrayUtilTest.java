package roman.lesson_5.homework.day_5.task_34;


import java.util.Random;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

        int[] hepe = test.newArray(4);
        test.fillUpRandomNumbers(hepe);
        test.printArray(hepe);



    }


    ArrayUtil arrayUtil = new ArrayUtil();
    Random random = new Random();

    public void checkResult (boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " - OK!");
        } else System.out.println(nameOfTest + " - Fail!");
    }

    public void shouldCreateArray() {
        int[] array = arrayUtil.createArray(3);
        boolean condition = array.length == 3;
        checkResult(condition,"Check Array length");
    }

    public void shouldFillArrayWithRandomNumbers() {
        int[] array = arrayUtil.createArray(3);
        arrayUtil.shouldFillArrayWithRandomNumbers(array);
        int sum = array[0];
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
            if (sum <= array[i]) {
                sum = array[i];
            } else sum = 0;

        }

        boolean condit = sum != 0;
        checkResult(condit,"Random fill up Array");
    }

    public void shouldFindMaxNumber() {
        int[] array = {1, 2 ,3 ,4};
        checkResult((arrayUtil.findMaxNumber(array) == 4), "Max number test");
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//        boolean cond = max ==4;
//        checkResult(cond, "Max array number test");
    }

    public void shouldFindMinNumber() {
        int[] array = {2, 3, 4, 1};
        checkResult(arrayUtil.findMinNumber(array) == 1, "Min number test");
    }

    public int[] newArray(int lengthArray) { return new int[lengthArray];}
    public void fillUpRandomNumbers (int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.println(array[i]);
        }
    }
    public void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("Array  = (" + array[i]);
            } else {
                System.out.print("," + array[i]);
            } if (i == array.length - 1) {
                System.out.print(")");
            }
        }
    }
}
