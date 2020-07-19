package student_anvars_intezars.home_tasks.lesson_6.day_3.task_9;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.firstArrayUtilTest();
    }

    public void firstArrayUtilTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[4];
        int result = arrayUtil.checkArrayLength(array);
        if (array.length == result) {
            System.out.println("Test checking array length = OK");
        }
        else {
            System.out.println("Test checking array length = FAIL");
        }
    }
}
