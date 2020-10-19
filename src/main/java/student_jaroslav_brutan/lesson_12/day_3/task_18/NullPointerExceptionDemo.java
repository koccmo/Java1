package student_jaroslav_brutan.lesson_12.day_3.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        int firstNumber = Integer.parseInt(null);
        System.out.println(firstNumber);
    }
}
