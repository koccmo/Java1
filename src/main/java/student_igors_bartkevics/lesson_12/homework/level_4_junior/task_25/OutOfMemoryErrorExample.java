package student_igors_bartkevics.lesson_12.homework.level_4_junior.task_25;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OutOfMemoryErrorExample {

    public static void main(String[] args) {
        List<Long> integerList = new ArrayList<>();
        for (long i = -1000000000; i < 1000000000; i++) {
            integerList.add(i);
        }

    }

}
