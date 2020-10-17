package student_jaroslav_brutan.lesson_9.day_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {

    public String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }
    public String getRuleName(){
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
