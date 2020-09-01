package student_anvars_intezars.home_tasks.lesson_9.level_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareTraderName(trader)) {
            return true;
        } else {
            return false;
        }
    }

    @CodeReviewComment(teacher = "Не корректная реализация метода!")
    boolean compareTraderName(Trader trader) {
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }
}
