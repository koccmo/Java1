package student_roberts_kupcs.lesson_9.level_5.Task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        // Перенесите сюда код реализации первого правила из класса FraudDetector
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
