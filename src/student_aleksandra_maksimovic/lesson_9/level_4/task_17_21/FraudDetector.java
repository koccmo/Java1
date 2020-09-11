package student_aleksandra_maksimovic.lesson_9.level_4.task_17_21;
/*
- Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
- Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
- Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
- Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.
 */
class FraudDetector {

    boolean isFraud(Transaction t) {

        return (isPokemon(t) || isTransactionExceededLimit(t) || isSydney(t) || isJamaica(t) || isGermanAndMoreThen1000(t));
    }

    private boolean isPokemon(Transaction t) {
        return(t.getTrader().getFullName().equals("Pokemon"));
    }

    private boolean isTransactionExceededLimit(Transaction t) {
        return(t.getAmount() > 1000000);
    }

    private boolean isSydney(Transaction t) {
        return(t.getTrader().getCity().equals("Sydney"));
    }

    private boolean isJamaica(Transaction t) {
        return(t.getTrader().getCountry().equals("Jamaica"));
    }

    private  boolean isGermanAndMoreThen1000(Transaction t) {
        return(t.getTrader().getCountry().equals("German") && (t.getAmount() > 1000));
    }
}