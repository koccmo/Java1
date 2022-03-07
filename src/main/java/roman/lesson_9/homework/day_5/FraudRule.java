package roman.lesson_9.homework.day_5;

public abstract class FraudRule {

    protected String ruleName;

     public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
