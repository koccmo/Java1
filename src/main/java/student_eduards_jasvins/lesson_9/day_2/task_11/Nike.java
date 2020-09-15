package student_eduards_jasvins.lesson_9.day_2.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Nike extends Company {

    private double money;

    protected Nike(String model, double money) {
        super(model);
        this.money = money;

    }
}
