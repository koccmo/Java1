package student_jaroslav_brutan.lesson_15.day_2.task_9;

public class FraudDetector {

    boolean isFraud(Trader trader) {
        return (isTraderNameFraud(trader) || (compareCity(trader)));
    }

    boolean isTraderNameFraud (Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    boolean compareCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
