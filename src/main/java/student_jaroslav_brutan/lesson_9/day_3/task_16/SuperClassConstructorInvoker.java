package student_jaroslav_brutan.lesson_9.day_3.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
