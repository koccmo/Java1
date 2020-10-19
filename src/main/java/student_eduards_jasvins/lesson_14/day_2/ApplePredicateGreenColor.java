package student_eduards_jasvins.lesson_14.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ApplePredicateGreenColor implements  ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
