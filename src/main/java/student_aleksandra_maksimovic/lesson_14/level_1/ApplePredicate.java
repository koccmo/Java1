package student_aleksandra_maksimovic.lesson_14.level_1;

import teacher.codereview.CodeReview;

@FunctionalInterface
@CodeReview(approved = true)
public interface ApplePredicate {
    boolean test (Apple apple);
}
