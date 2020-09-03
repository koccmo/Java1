package student_igors_bartkevics.lesson_9.homework.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {
    public static int LIMIT = 1000000;
    public static int LIMIT_FOR_GERMANY = 1000;

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        int transactionAmount = t.getAmount();
        return isPokemon(trader) || !isTransactionAmountExceedingLimit(transactionAmount, LIMIT) ||
                isTraderFromSidney(trader) || isTraderFromJamaica(trader) ||
                (isTraderFromGermany(trader) && isTransactionAmountExceedingLimit(transactionAmount, LIMIT_FOR_GERMANY));
    }
    //Rule 1:
    boolean isPokemon(Trader trader) {
        String traderFullName = trader.getFullName();
        return traderFullName.equals("Pokemon");
    }

    //Rule 2:
    boolean isTransactionAmountExceedingLimit(int transactionAmount, int limit) {
        return (transactionAmount > limit );
    }

    //Rule 3:
    boolean isTraderFromSidney(Trader trader) {
        String city = trader.getCity();
        return (city.equals("Sidney"));
    }

    //Rule 4:
    boolean isTraderFromJamaica(Trader trader) {
        String country = trader.getCountry();
        return (country.equals("Jamaica"));
    }

    //Part of Rule 5:
    boolean isTraderFromGermany(Trader trader) {
        String country = trader.getCountry();
        return country.equals("Germany");
    }

}
