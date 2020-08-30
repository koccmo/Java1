package student_anvars_intezars.home_tasks.lesson_9.level_5;

class FraudDetector {

    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }
}


    /*boolean isFraud(Trader trader, int amount) {
        boolean result = false;
        for (int i = 0; i < fraudRules.length; i++) {
            if (isFraud(trader, amount)) {
                return true;
            } else {
                return false;
            }
        }
    }
}*/
