package student_eduards_jasvins.lesson_9.day_5;

import java.util.Arrays;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(FraudRule... fraudRules) {this.fraudRules = Arrays.asList(fraudRules);}

    boolean isFraud (Transaction t) {
        boolean result = false;

        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) result = true;
        }
        return result;
    }


}
