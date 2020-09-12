package student_aleksandra_maksimovic.lesson_9.level_6;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
       return(t.getTrader().getCity().equals("Sydney"));
    }
}
