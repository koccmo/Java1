package roman.lesson_9.homework.day_6;


import java.util.ArrayList;
import java.util.List;

public class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

     public FraudDetectionResult isFraud(Transaction t) {
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult(false);
        for(FraudRule fraudRule : fraudRules) {
            if(fraudRule.isFraud(t)) {
                fraudDetectionResult.setRuleName(fraudRule.getRuleName());
                fraudDetectionResult.setFraud(true);
                System.out.println(t.toString());
                break;
            }
        }
        return fraudDetectionResult;
     }
}

