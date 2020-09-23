package student_valerija_ionova.lesson_15.level_2_intern.task_9;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return (isNameFraud(trader) || (isCityFraud(trader)));
    }

    private boolean isNameFraud (Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    private boolean isCityFraud (Trader trader) {
        return trader.getCity().equals("Sidney");
    }

}



