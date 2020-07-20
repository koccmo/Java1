package student_eduards_jasvins.lesson_5.day_5_and_day_6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] createArray = arrayUtil.createArray(7);
        if (createArray.length == 7) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayNumber = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(arrayNumber);
        if (arrayNumber[4] != 0 && arrayNumber[1] != 0 && arrayNumber[4] != 0) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }
    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(7);
        array[0] = 25;
        array[1] = 1;
        array[2] = 5;
        array[3] = 61;
        array[4] = 22;
        array[5] = 34;
        array[6] = 4;

        // более короткая запись: int[] array = {25, 1, 5, 61, 22, 34, 4};

        int maxNumber = arrayUtil.findMaxNumber(array);
        if (maxNumber == 1) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }
    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(3);
        array[0] = 3;
        array[1] = 6;
        array[2] = 8;

        int minNumber = arrayUtil.findMinNumber(array);
        if (minNumber == 3) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
}
