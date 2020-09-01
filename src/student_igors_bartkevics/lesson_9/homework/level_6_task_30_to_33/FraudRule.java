package student_igors_bartkevics.lesson_9.homework.level_6_task_30_to_33;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;

    public String getRuleName() {
        return ruleName;
    }

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
