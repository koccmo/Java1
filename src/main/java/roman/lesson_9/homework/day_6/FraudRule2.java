package roman.lesson_9.homework.day_6;



class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        int transactionAmount = transaction.getAmount();
        return transactionAmount > 1000000;
    }
}
