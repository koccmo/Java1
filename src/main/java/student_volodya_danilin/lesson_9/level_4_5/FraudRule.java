package student_volodya_danilin.lesson_9.level_4_5;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    String getRuleName() {
        return this.ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
