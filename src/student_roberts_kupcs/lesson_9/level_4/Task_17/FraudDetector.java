package student_roberts_kupcs.lesson_9.level_4.Task_17;

class FraudDetector {
    boolean isFraud(Transaction t) {

        return isPokemon(t);
    }

    private boolean isPokemon(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
