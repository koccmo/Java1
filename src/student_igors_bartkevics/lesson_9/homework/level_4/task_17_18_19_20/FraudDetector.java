package student_igors_bartkevics.lesson_9.homework.level_4.task_17_18_19_20;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        int transactionAmount = t.getAmount();
        return isPokemon(trader) || !isTransactionAmountExceedingLimit(transactionAmount) ||
                isTraderFromSidney(trader) || isTraderFromJamaica(trader);
    }

    boolean isPokemon(Trader trader) {
        String traderFullName = trader.getFullName();
        return traderFullName.equals("Pokemon");
    }

    boolean isTransactionAmountExceedingLimit(int transactionAmount) {
        return (transactionAmount > 1000000 );
    }

    boolean isTraderFromSidney(Trader trader) {
        String city = trader.getCity();
        return (city.equals("Sidney"));
    }

    boolean isTraderFromJamaica(Trader trader) {
        String country = trader.getCountry();
        return (country.equals("Jamaica"));
    }


}
