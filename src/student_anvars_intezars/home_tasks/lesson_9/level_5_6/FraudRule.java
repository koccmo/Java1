package student_anvars_intezars.home_tasks.lesson_9.level_5_6;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Trader trader, int amount);
}



