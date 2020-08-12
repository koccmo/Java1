package student_eduards_jasvins.lesson_7.day_6.task_13;

import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        CopyTest copyTest = new CopyTest();
        copyTest.arrayDiapazone();
    }

    public void  arrayDiapazone() {
        Copy copy = new Copy();
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = copy.copyInRange(array, 2, 5);
        System.out.println(Arrays.toString(result));

    }
}
