package roman.lesson_9.homework.day_5;

class FraudRule5 extends FraudRule{

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String countryOfTrader = trader.getCountry();
        int amountOfTransaction = t.getAmount();
        return (countryOfTrader.equals("Germany")) && (amountOfTransaction > 1000);
    }
}
