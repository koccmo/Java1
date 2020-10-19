package student_jaroslav_brutan.lesson_14.day_2;

import teacher.codereview.CodeReview;

@FunctionalInterface
@CodeReview(approved = true)
public interface ApplePredicate {

    boolean test(Apple apple);
}
