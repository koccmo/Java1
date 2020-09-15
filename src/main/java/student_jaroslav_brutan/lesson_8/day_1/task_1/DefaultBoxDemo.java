package student_jaroslav_brutan.lesson_8.day_1.task_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Дефолтный конструктор - это конструктор без параметров!")
public class DefaultBoxDemo {

    public static void main(String[] args) {
        DefaultBox defaultBox = new DefaultBox(4);
        System.out.println(defaultBox.getWidth() + " is box width!");
    }
}
