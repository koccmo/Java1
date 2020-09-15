package student_dmitrijs_jasvins.lesson_7.day_6.task_13;

import java.util.Arrays;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class CopyInRangeTest {

	@CodeReviewComment(teacher = "Это не автоматический тест!")
	@CodeReviewComment(teacher = "Автоматический тест должен проверять результат, а не выводить его на консоль.")
    public static void main(String[] args) {
        CopyInRange copyInRange = new CopyInRange();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = copyInRange.copyInRange(array,3 , 6);
        System.out.println(Arrays.toString(result));
    }
}
