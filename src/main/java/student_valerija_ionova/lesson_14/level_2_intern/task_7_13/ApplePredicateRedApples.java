package student_valerija_ionova.lesson_14.level_2_intern.task_7_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ApplePredicateRedApples implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
