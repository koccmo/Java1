package student_roberts_kupcs.lesson_9.level_4.Task_17;

class FraudDetector {
    boolean isFraud(Transaction t) {

        return isPokemon(t) || isMore1000000(t);
    }

    private boolean isPokemon(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

    //Task 18- Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.

    private boolean isMore1000000(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
