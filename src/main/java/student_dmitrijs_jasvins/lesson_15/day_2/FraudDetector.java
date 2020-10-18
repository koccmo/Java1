package student_dmitrijs_jasvins.lesson_15.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudDetector {
    public boolean isFraud(Trader trader) {
        return compareTraderName(trader) || (compareCity(trader));
    }

    private boolean compareTraderName (Trader trader) {
        return trader.getFullName().equals("Pokemon");

    }

    private boolean compareCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
