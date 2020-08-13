package student_dmitrijs_jasvins.lesson_9.day_4;

public class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return isPokemon(transaction) || amountLimit(transaction) || forbiddenCitySidney(transaction)
                            || forbiddenCityJamaica(transaction) || forbiddenCityGerman(transaction);
    }

    private boolean isPokemon(Transaction transaction) {
        return transaction.getTrader().getName().equals("Pokemon");
    }

    private boolean amountLimit(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    private boolean forbiddenCitySidney(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sidney");
    }

    private boolean forbiddenCityJamaica(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Jamaica");
    }

    private boolean forbiddenCityGerman(Transaction transaction) {
        return transaction.getAmount() > 1000 && transaction.getTrader().getCity().equals("Germany");
    }
}