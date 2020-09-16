package student_volodya_danilin.lesson_11.level_1.Task_4;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

/*
util.List разрешает дупликаты (в отличии от Set)
 */
@CodeReview(approved = true)
class ListUtil {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(5);
        integers.add(5);
        integers.add(5);
        integers.add(5);

        for (Integer value : integers) {
            System.out.println(value);
        }


    }
}
