package student_anvars_intezars.home_tasks.lesson_9.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Trader trader, int amount);
}



