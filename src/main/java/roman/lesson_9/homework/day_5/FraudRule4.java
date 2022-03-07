package roman.lesson_9.homework.day_5;

class FraudRule4 extends FraudRule{

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String countryOfTrader = trader.getCountry();
        return countryOfTrader.equals("Jamaica");
    }
}
