package student_jaroslav_brutan.lesson_14.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AppleHeavyWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple){
        return apple.getWeight() > 150;
    }
}
