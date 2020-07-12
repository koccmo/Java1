/*
Создайте класс ArrayUtilTest.
В этом классе напишите автоматический тест
метода int[] createArray(int arrayLength)
из предыдущего задания.

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
    }
}
 */
package student_igors_bartkevics.lesson_5.homework.level_5.task_32;
import java.util.Objects;
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void shouldCreateArray() {
        // Write test implementation here !!!
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(3);
        boolean condition = (array.length == 3);
        checkResult(condition, "Create array");
    }
}
