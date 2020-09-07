package student_pavel_sharkel.lesson_9.level_5;

abstract class FraudRule {

    private String ruleName;

    Trader trader = new Trader("John", "Paris", "France");
    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
