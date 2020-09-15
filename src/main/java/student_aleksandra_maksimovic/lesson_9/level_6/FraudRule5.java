package student_aleksandra_maksimovic.lesson_9.level_6;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return(t.getTrader().getCountry().equals("German") && (t.getAmount() > 1000));
    }
}
