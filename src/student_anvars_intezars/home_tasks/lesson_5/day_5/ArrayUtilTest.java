package student_anvars_intezars.home_tasks.lesson_5.day_5;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] firstArray = arrayUtil.createArray(5);
        if(firstArray.length ==5) {
            System.out.println("Create Array Test = OK");
        }
        else {
            System.out.println("Create Array Test = FAIL");
        }
    }
}


