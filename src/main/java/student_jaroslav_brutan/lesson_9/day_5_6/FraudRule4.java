package student_jaroslav_brutan.lesson_9.day_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule4 extends FraudRule {

    public FraudRule4(String FraudRule4) {
        super(FraudRule4);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }
}
