package student_aleksandra_maksimovic.lesson_9.level_5.task_22_29;
/*
создайте абстрактный класс FraudRule.

 */

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
