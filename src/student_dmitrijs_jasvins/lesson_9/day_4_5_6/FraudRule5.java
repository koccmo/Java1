package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

public class FraudRule5 extends FraudRule {
    public FraudRule5(String name) {
        super(name);
    }

    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000 && transaction.getTrader().getCity().equals("Germany");

    }
}
