package roman.lesson_9.homework.day_5;

class FraudRule3 extends FraudRule{

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
     public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String cityOfTrader = trader.getCity();
        return cityOfTrader.equals("Sydney");
    }
}
