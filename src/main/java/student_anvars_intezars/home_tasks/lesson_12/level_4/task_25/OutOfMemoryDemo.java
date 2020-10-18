package student_anvars_intezars.home_tasks.lesson_12.level_4.task_25;

import java.util.ArrayList;
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OutOfMemoryDemo {

    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<Integer>();
        Random random = new Random();
        int value = 1;
        int index = 1;

        while (value < 500) {
            for (int i = 0; i < index; ) {
                index++;
                value++;
                int choose = random.nextInt(100);
                elements.add(choose);
            }
        }
    }
}




