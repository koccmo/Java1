package student_jaroslav_brutan.lesson_8.day_1.task_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Дефолтный конструктор - это конструктор без параметров!")
class DefaultBox {

        private  int width;

    public DefaultBox(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
