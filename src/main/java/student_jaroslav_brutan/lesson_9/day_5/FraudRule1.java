package student_jaroslav_brutan.lesson_9.day_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule1 extends FraudRule {

    public FraudRule1(String FraudRule1) {
        super(FraudRule1);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
