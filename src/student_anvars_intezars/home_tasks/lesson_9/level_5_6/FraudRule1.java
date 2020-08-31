package student_anvars_intezars.home_tasks.lesson_9.level_5_6;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareTraderName(trader)) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareTraderName(Trader trader) {
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
        }
        return true;
    }
}
