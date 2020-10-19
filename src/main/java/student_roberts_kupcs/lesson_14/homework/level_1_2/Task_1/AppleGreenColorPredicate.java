package student_roberts_kupcs.lesson_14.homework.level_1_2.Task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
