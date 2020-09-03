package student_volodya_danilin.lesson_9.level_4.Task_17;

import java.util.List;

class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {

        boolean result = false;

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                result = true;
            }
        }

        if (!result) {
            System.out.println("ALLOWED");
            System.out.println("No fraud found!");
        }

        return result;
    }


}