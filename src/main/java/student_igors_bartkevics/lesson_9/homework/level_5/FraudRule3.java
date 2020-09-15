package student_igors_bartkevics.lesson_9.homework.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
