package student_aleksandra_maksimovic.lesson_9.level_6;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleName() {
        return ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
