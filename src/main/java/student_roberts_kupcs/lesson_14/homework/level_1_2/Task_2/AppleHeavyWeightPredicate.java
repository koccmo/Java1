package student_roberts_kupcs.lesson_14.homework.level_1_2.Task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
