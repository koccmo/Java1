package roman.lesson_5.homework.day_5.task_32;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();

    }
    public void checkArray(boolean check,String name) {
        if (check) {
            System.out.println(name + " = True");
        } else System.out.println(name + " = False");
    }
    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] massive = arrayUtil.createArray(4);
        boolean check = massive.length == 4;
        checkArray(check,"Array test");
    }


}
