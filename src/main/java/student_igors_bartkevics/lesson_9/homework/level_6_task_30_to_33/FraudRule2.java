package student_igors_bartkevics.lesson_9.homework.level_6_task_30_to_33;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule2 extends FraudRule {
    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    //isTransactionAmountExceedingLimit1000000
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }

}
