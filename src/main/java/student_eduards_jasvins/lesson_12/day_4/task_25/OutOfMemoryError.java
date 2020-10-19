package student_eduards_jasvins.lesson_12.day_4.task_25;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OutOfMemoryError {
    public static void main(String[] args) {

        List<Long> number = new ArrayList<>();

        while (true) {
            number.add(9999L);

        }

    }
}
