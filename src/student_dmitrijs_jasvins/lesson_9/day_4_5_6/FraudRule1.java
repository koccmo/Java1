package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudRule1 extends FraudRule {

    public FraudRule1(String name){
        super(name);
    }
    public boolean isFraud (Transaction transaction){
        return transaction.getTrader().getName().equals("Pokemon");
    }
}
