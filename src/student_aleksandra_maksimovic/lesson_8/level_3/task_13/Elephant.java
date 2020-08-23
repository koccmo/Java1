package student_aleksandra_maksimovic.lesson_8.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Elephant extends Mammals {

    public Elephant(boolean breatheAir, boolean babiesFeedMilk) {
        super(breatheAir, babiesFeedMilk);
    }

    @Override
    String habitat() {
        return " Africa savanna";
    }

    @Override
    int lifespan() {
        return 60;
    }
}
