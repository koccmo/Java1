package student_dmitrijs_jasvins.lesson_14.day_2;

import teacher.codereview.CodeReview;

@FunctionalInterface
@CodeReview(approved = true)
interface ApplePredicate {
    boolean test (Apple apple);
}
