package student_jaroslav_brutan.lesson_9.day_5_6;


import java.util.ArrayList;

class FraudDetector {

    ArrayList<FraudRule> allFraudRules;

    public FraudDetector(ArrayList<FraudRule> allFraudRules) {
        this.allFraudRules = allFraudRules;
    }

    FraudDetectionResult isFraud(Transaction transaction){
        boolean result = false;
        String ruleName = null;
        for (FraudRule rule : allFraudRules){
            if (rule.isFraud(transaction)){
                result = true;
                ruleName = rule.getRuleName();
                System.out.println(transaction.toString());
                break;
            }
        }
        return new FraudDetectionResult(result, ruleName);
    }
}
