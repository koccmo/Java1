package student_dmitrijs_jasvins.lesson_8.day_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorDemo {
    public static void main(String[] args) {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        defaultConstructor.setName("Java set constructor by her own");
        System.out.println(defaultConstructor.getName());
    }
}
