package student_igors_bartkevics.lesson_14.homework.level_2_intern_task_7_to_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AppleHeavyWeightGreenPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 && apple.getColor().equals("green");
    }
}
