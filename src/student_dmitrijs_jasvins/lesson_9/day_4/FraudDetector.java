package student_dmitrijs_jasvins.lesson_9.day_4;

public class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return (isPokemon(transaction) || amountLimit(transaction) || forbiddenCitySidney(transaction)
                            || forbiddenCityJamaica(transaction) || forbiddenCityGerman(transaction));
    }

    boolean isPokemon(Transaction transaction) {
        return (transaction.getTrader().getName().equals("Pokemon"));
    }

    boolean amountLimit(Transaction transaction) {
        return (transaction.getAmount() > 1000000);
    }

    boolean forbiddenCitySidney(Transaction transaction) {
        return (transaction.getTrader().getCity().equals("Sidney"));
    }

    boolean forbiddenCityJamaica(Transaction transaction) {
        return (transaction.getTrader().getCity().equals("Jamaica"));
    }

    boolean forbiddenCityGerman(Transaction transaction) {
        return transaction.getAmount() > 1000 && transaction.getTrader().getCity().equals("Germany");
    }
}