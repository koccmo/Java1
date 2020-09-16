package student_jaroslav_brutan.lesson_10.day_3.task_6;

import teacher.codereview.CodeReview;

@FunctionalInterface
@CodeReview(approved = true)
public interface CheckCar {

    boolean test(Car car);
}
