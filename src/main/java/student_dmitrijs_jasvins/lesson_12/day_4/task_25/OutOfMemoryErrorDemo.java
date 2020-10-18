package student_dmitrijs_jasvins.lesson_12.day_4.task_25;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class OutOfMemoryErrorDemo {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        while (true) {
            list.add(new Object());
        }

    }
}
