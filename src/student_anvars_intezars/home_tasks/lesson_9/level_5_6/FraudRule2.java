package student_anvars_intezars.home_tasks.lesson_9.level_5_6;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareAmount(amount)) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareAmount(int amount) {
        int traderAmount = amount;
        if (traderAmount > 1000000) {
            return true;
        } else {
            return false;
        }
    }
}
