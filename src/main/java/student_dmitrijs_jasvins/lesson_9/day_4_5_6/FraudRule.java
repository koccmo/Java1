package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction transaction);
}
