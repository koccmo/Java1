package student_pavel_sharkel.lesson_9.level_5;

import java.util.ArrayList;

class FraudDetector {

    private ArrayList<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
        }

     boolean isFraud(Transaction t) {
        boolean result = false;
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
         return result;
     }
    }
