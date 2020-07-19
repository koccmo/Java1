package student_anvars_intezars.home_tasks.lesson_6.day_3;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.firstArrayUtilTest();
        arrayUtilTest.findSameNumberTest();
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

    public void findSameNumberTest() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1,2,3,4,2,2,2,};
        int result = arrayUtil.findTheSameNumber(array);
        if (result == 2) {
            System.out.println("Test for finding most repeated number = OK");
        }
        else {
            System.out.println("Test for finding most repeated number = FAIL");
        }


    }
}
