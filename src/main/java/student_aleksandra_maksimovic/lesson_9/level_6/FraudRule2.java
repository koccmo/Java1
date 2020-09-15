package student_aleksandra_maksimovic.lesson_9.level_6;


class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t){
        return(t.getAmount() > 1000000);
    }
}
