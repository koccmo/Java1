package student_roberts_kupcs.lesson_5.homework.level_5_6;

//Task32
// Создайте класс ArrayUtilTest.
//В этом классе напишите автоматический тест
//метода int[] createArray(int arrayLength)
//из предыдущего задания.
//


class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayTest[] = arrayUtil.createArray(10);

        if (arrayTest.length == 10) {
            System.out.println("Test Create Array OK");
        } else {
            System.out.println("Test Create Array FALSE");
        }
    }

    //Task34
    //В классе ArrayUtilTest напишите автоматический тест
    //метода void fillArrayWithRandomNumbers(int[] array)
    //из предыдущего задания.

    public void shouldFillArrayWithRandomNumbers() {

    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {5, 8, 3, 9, 1};
        if (arrayUtil.findMaxNumber(testArray) == 9) {
            System.out.println("Method findMaxNumber is OK");
        } else {
            System.out.println("Method findMaxNumber is FALSE");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] testArray = {5, 8, 3, 9, 1};
        if (arrayUtil.findMinNumber(testArray) == 1) {
            System.out.println("Method findMinNumber is OK");
        } else {
            System.out.println("Method findMinNumber is FALSE");

        }
    }

}
