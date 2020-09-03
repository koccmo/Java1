package student_eduards_jasvins.lesson_9.day_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract  class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
