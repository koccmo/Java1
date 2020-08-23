package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

public class FraudRule4 extends FraudRule {
    public FraudRule4(String name) {
        super(name);
    }

    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Jamaica");

    }
}