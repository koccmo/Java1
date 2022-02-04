package roman.lesson_7.homework.day_6.task_13;

import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.copyFirstTreeElement();
        test.copyMiddleTreeElement();
        test.copyLastTreeElement();
        test.copyOneElement();

    }

    Copy check = new Copy();

    public void copyOneElement() {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedAnswer = {1};
        checkResult(Arrays.equals(check.copyInRange(intArray, 1, 1), expectedAnswer),
                "Copy One Element");
    }
    public void copyLastTreeElement() {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedAnswer = {7, 8, 9};
        checkResult(Arrays.equals(check.copyInRange(intArray, 7, 9), expectedAnswer),
                "Copy Last Tree Elements");
    }
    public void copyMiddleTreeElement() {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedAnswer = {3, 4, 5};
        checkResult(Arrays.equals(check.copyInRange(intArray, 3, 5), expectedAnswer),
                "Copy Middle Element");

    }
    public void copyFirstTreeElement() {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedAnswer = {0, 1, 2};
        checkResult(Arrays.equals(check.copyInRange(intArray, 0, 2), expectedAnswer),
                "Copy First Tree Elements");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " test is OK!");
        } else {
            System.out.println(nameOfTest + " Test is FAIL!");
        }
    }
}
