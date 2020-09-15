package student_sandra_arniece.lesson_5.level_5_and_6; //Task 32,34,37,39

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil newArray = new ArrayUtil();
        int arrayLength = 5;
        int[] array = newArray.createArray(arrayLength);
        int i = 0;
        while (i < array.length) {
            i++;
        }
        if (i == arrayLength) {
            System.out.println("shouldCreateArray test OK");
        } else {
            System.out.println("shouldCreateArray test FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil newArray = new ArrayUtil();
        int arrayLength = 15;
        int[] array = newArray.createArray(arrayLength);
        int i = 0;
        while (i < arrayLength) {
            array[i] = i + 1;
            i++;
        }
        if (newArray.findMaxNumber(array) == 15) {
            System.out.println("shouldFindMaxNumber test OK");
        } else
            System.out.println("shouldFindMaxNumber test FAIL");

    }

    public void shouldFindMinNumber() {
        ArrayUtil newArray = new ArrayUtil();
        int arrayLength = 10;
        int[] array = newArray.createArray(arrayLength);
        int i = 0;
        while (i < arrayLength) {
            array[i] = i + 1;
            i++;
        }
        if (newArray.findMinNumber(array) == 1) {
            System.out.println("shouldfindMinNumber test OK");
        } else System.out.println("shouldfindMinNumber test FAIL");
    }

}
