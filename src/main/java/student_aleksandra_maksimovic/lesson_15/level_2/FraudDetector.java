package student_aleksandra_maksimovic.lesson_15.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudDetector {

    public boolean isFraud(Trader trader) {
        return isTraderBlocked(trader) || isCityBlocked(trader);
    }

    private boolean isTraderBlocked(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    private boolean isCityBlocked(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}