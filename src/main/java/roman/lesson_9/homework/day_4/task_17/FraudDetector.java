package roman.lesson_9.homework.day_4.task_17;

public class FraudDetector {
    public static int LIMIT = 1000000;
    public static int LIMIT_FOR_GERMANY = 1000;
    boolean isFraud(Transaction t) {
        return isPokemon(t) || isLimit(t) || isSydneyTrader(t) || isJamaicaTrader(t) || isOverGermanyLimit(t);
    }

//    Rule 1

    boolean isPokemon(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String nameOfTrader = trader.getFullName();
        return nameOfTrader.equals("Pokemon");
    }
// Rule 2

    boolean isLimit(Transaction transaction) {
        int amountOfTransaction = transaction.getAmount();
        return amountOfTransaction > LIMIT;
    }

// Rule 3

    boolean isSydneyTrader(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String cityOfTrader = trader.getCity();
        return cityOfTrader.equals("Sydney");
    }

//  Rule 4

    boolean isJamaicaTrader(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String countryOfTrader = trader.getCountry();
        return countryOfTrader.equals("Jamaica");
    }

//  Rule 5

    boolean isOverGermanyLimit(Transaction transaction) {
        Trader trader = transaction.getTrader();
        String countryOfTrader = trader.getCountry();
        int amountOfTransaction = transaction.getAmount();
        return (countryOfTrader.equals("Germany") && (amountOfTransaction > LIMIT_FOR_GERMANY));
    }
}
