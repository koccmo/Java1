package student_igors_bartkevics.lesson_9.homework.level_5;

class FraudRule3 extends FraudRule{
    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    @Override
    //isTraderFromSidney
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String city = trader.getCity();
        return city.equals("Sydney");
    }

}
