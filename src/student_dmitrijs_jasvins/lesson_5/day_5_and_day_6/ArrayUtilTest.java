package student_dmitrijs_jasvins.lesson_5.day_5_and_day_6;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();
    }

    private void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] createArray = arrayUtil.createArray(5);
        if (createArray.length == 5) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }


    private void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);

        array[0] = 35;
        array[1] = 85;
        array[2] = 42;
        array[3] = 21;
        array[4] = 1;

        int maxNumber = arrayUtil.findMaxNumber(array);
        if (maxNumber == 85) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    private void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);

        array[0] = 35;
        array[1] = 85;
        array[2] = 42;
        array[3] = 21;
        array[4] = 1;

        int minNumber = arrayUtil.findMinNumber(array);
        if (minNumber == 1) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}


