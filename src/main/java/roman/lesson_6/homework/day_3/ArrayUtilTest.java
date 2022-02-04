package roman.lesson_6.homework.day_3;



import java.util.Random;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();

        test.shouldTurnAroundArrayNumbers();
        test.shouldReplaceAllSelectNumbers();
        test.shouldReplaceSelectNumberFirstMet();
        test.shouldFindSelectNumberInArray();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindHowManyNumberInArray();

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

    public void shouldTurnAroundArrayNumbers () {
        int[] array = {1, 2, 3, 4};
        int[] newArray = arrayUtil.turnAroundArrayNumbers(array);
        boolean condition = (array[0] == newArray[3]);
        String nameOfTest = "Turn around Array numbers";
        checkResult(condition, nameOfTest);
    }

    public void shouldReplaceAllSelectNumbers () {
        int[] array = {1, 4, 5, 5};
        int numberToReplace = 5;
        int newNumber = 12;
        arrayUtil.replaceAllSelectNumbers(array, numberToReplace, newNumber);
        boolean condition = (arrayUtil.howManySelectNumbersInArray(array, newNumber) == 2)
                && (arrayUtil.howManySelectNumbersInArray(array, newNumber) == 2);
        String nameOfTest = "Replace all select number for new select numbers";
        checkResult(condition, nameOfTest);
    }

    public void shouldReplaceSelectNumberFirstMet () {
        int[] array = {1, 3, 2, 4};
        arrayUtil.replace(array, 1, 6);
        boolean condition = (arrayUtil.howManySelectNumbersInArray(array, 3) == 1) &&
                (arrayUtil.howManySelectNumbersInArray(array, 6) == 1);
        String nameOfTest = "Replace first meet select number";
        checkResult(condition, nameOfTest);
    }

    public void shouldFindHowManyNumberInArray () {
        int[] array = {1, 3, 2, 3};
        int expectedAnswer = 2;
        String nameOfTest = "Find how many select numbers in Array";
        checkResult(arrayUtil.howManySelectNumbersInArray(array, 3) == expectedAnswer, nameOfTest);
    }

    public void shouldFindSelectNumberInArray () {
        int[] array = {1,2,3,4};
        int number = 3;
        String nameOfTest = "Find number in Array";
        checkResult(arrayUtil.findNumberInArray(array,number), nameOfTest);
    }

    public void shouldCreateArray() {
        int[] array = arrayUtil.createArray(3);
        boolean condition = array.length == 3;
        checkResult(condition,"Check Array length");
    }

    public void shouldFillArrayWithRandomNumbers() {
        int[] array = arrayUtil.createArray(3);
        arrayUtil.fillArrayWithRandomNumbers(array);
        int sum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (sum <= array[i]) {
                sum = array[i];
            } else sum = 0;
        }
        boolean condit = !(sum == 0);
        String nameOfTest = "FillArrayWithRandomNumbers";
        checkResult(condit, nameOfTest);
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
        String nameOfTest = "Min number test";
        checkResult(arrayUtil.findMinNumber(array) == 1, nameOfTest);
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
