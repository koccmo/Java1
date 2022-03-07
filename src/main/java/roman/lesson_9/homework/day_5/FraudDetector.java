package roman.lesson_9.homework.day_5;



import java.util.ArrayList;
import java.util.List;

public class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(ArrayList<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

     public boolean isFraud(Transaction t) {
        boolean result = false;
        for(FraudRule fraudRule : fraudRules) {
            if(fraudRule.isFraud(t)) {
                result = true;
                break;
            }
        }
        return result;
     }
}

