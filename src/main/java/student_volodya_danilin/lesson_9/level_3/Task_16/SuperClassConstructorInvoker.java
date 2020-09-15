package student_volodya_danilin.lesson_9.level_3.Task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}