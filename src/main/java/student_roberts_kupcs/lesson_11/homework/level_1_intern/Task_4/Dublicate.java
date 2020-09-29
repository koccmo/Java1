package student_roberts_kupcs.lesson_11.homework.level_1_intern.Task_4;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class duplicate {
    public static void main(String[] args) {
        List<Integer> duplicate = new ArrayList<>();
        duplicate.add(2);
        duplicate.add(2);
        duplicate.add(2);
        duplicate.add(2);

        System.out.println("Могут хранить одинаковые элементы " + duplicate);
    }
}
