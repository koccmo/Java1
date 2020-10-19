package student_jaroslav_brutan.lesson_12.day_4.task_25;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class OutOfMemoryDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        while(true){
            list.add(random.nextInt());
        }
    }
}
