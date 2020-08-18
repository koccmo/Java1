package student_eduards_jasvins.lesson_9.day_5;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Germany") && t.getAmount() > 1000;
    }
}
