package student_eduards_jasvins.lesson_9.day_4;

class FraudDetector {

    boolean isFraud(Transaction t) {
        return isPokemon(t) || isBigAmount(t) || isSydney(t) || isJamaica(t) || isGermany1000(t);
    }

    private boolean isPokemon(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

    private boolean isBigAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

    private boolean isSydney(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }

    private boolean isJamaica(Transaction t) {
        return t.getTrader().getCity().equals("Jamaica");
    }

    private boolean isGermany1000(Transaction t) {
        return t.getTrader().getCity().equals("Germany") && t.getAmount() > 1000;
    }
}
