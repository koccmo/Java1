package student_igors_bartkevics.lesson_9.homework.level_4.task_17;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String traderFullName = trader.getFullName();
        return (traderFullName.equals("Pokemon"));
    }

}
