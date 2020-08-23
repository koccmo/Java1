package student_igors_bartkevics.lesson_9.homework.level_x.super_task_2;

class FraudRule4 extends FraudRule {
    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    //isTraderFromSidney
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String country = trader.getCountry();
        return country.equals("Jamaica");
    }

}
