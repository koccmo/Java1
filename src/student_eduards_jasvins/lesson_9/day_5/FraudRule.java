package student_eduards_jasvins.lesson_9.day_5;

abstract  class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
