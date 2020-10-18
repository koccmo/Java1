package student_eduards_jasvins.lesson_15.day_2.task_9;

public class FraudDetector {

    boolean isFraud(Trader trader) {
        return  (isTraderFraud(trader) || (isCityFraud(trader)));
    }

    boolean isTraderFraud (Trader trader) {
        return trader.getFullName().equals("Pokemon");

    }

    boolean isCityFraud(Trader trader) {
       return trader.getCity().equals("Sidney");

    }
}
