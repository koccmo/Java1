/*-----------------------------------------
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.
-------------------------------------------
В классе ArrayUtilTest напишите автоматический тест
для метода int findMaxNumber(int[] array)
из предыдущего задания.
------------------------------------------
В классе ArrayUtilTest напишите автоматический тест
для метода int findMinNumber(int[] array)
из предыдущего задания.
-----------------------------------------*/
package student_jekaterina_loseva.lesson_5.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void checkResult(String nameOfTest, boolean isOk) {
        if (isOk) {
            System.out.println(nameOfTest + " = OK");
        } else {
            System.out.println(nameOfTest + " = FAIL");
        }
    }

    public void shouldCreateArray() {
        ArrayUtil util = new ArrayUtil();
        int[] test = util.createArray(7);
        checkResult("Test createArray", test.length == 7);
    }

    public void shouldFindMaxNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] test = new int[]{13, 18, 21, 7, 9, 26, 15};

        int maxNumber = util.findMaxNumber(test);
        checkResult("Test maxNumber", maxNumber == 26);
    }

    public void shouldFindMinNumber() {
        ArrayUtil util = new ArrayUtil();
        int[] test = new int[]{13, 18, 21, 7, 9, 26, 15};

        int minNumber = util.findMinNumber(test);
        checkResult("Test minNumber", minNumber == 7);
    }
}
