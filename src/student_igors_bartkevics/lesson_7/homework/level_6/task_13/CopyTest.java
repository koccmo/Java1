package student_igors_bartkevics.lesson_7.homework.level_6.task_13;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CopyTest {

    Copy copy = new Copy();

    public static void main(String[] args) {

        CopyTest test = new CopyTest();
        test.copyFirstThreeElements();
        test.copyLastThreeElements();
        test.copyMiddleFourElements();
        test.copyOneElement();
    }

    public void copyFirstThreeElements() {
        int[] in = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = {0, 1, 2};
        int[] out = copy.copyInRange(in,0, 2);
        boolean condition = Arrays.equals(out, result);
        checkResult(condition, "Copy first three elements");
    }

    public void copyLastThreeElements() {
        int[] in = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = {7, 8, 9};
        int[] out = copy.copyInRange(in,7, 9);
        boolean condition = Arrays.equals(out, result);
        checkResult(condition, "Copy last three elements");
    }

    public void copyMiddleFourElements() {
        int[] in = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = {2, 3, 4, 5};
        int[] out = copy.copyInRange(in,2, 5);
        boolean condition = Arrays.equals(out, result);
        checkResult(condition, "Copy middle three elements");
    }

    public void copyOneElement() {
        int[] in = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = {2};
        int[] out = copy.copyInRange(in,2, 2);
        boolean condition = Arrays.equals(out, result);
        checkResult(condition, "Copy one element");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
