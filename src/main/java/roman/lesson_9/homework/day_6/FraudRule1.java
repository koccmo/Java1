package roman.lesson_9.homework.day_6;


import roman.lesson_9.homework.day_6.Trader;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String nameOfTrader = trader.getName();
        return nameOfTrader.equals("Pokemon");
    }
}
