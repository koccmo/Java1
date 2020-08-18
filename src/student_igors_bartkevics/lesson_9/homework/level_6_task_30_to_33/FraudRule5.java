package student_igors_bartkevics.lesson_9.homework.level_6_task_30_to_33;

class FraudRule5 extends FraudRule {
    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    //isTraderFromSidney
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String country = trader.getCountry();
        return country.equals("Germany") && (t.getAmount() > 1000);
    }

}
