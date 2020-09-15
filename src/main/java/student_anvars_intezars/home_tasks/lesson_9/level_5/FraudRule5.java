package student_anvars_intezars.home_tasks.lesson_9.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Trader trader, int amount) {
        if (compareCountryAndAmount(trader, amount)) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareCountryAndAmount(Trader trader, int amount) {
        String countryName = trader.getCountry();
        if (countryName.equals("Germany") && (amount > 1000)) {
            return true;
        } else {
            return false;
        }
    }
}
