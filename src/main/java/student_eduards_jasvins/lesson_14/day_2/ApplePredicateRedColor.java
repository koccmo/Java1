package student_eduards_jasvins.lesson_14.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ApplePredicateRedColor implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
