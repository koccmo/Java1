package student_eduards_jasvins.lesson_9.day_6;

import java.util.Arrays;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudDetector {

    private List<FraudRule> fraudRules;

    public FraudDetector(FraudRule... fraudRules) { this.fraudRules = Arrays.asList(fraudRules);}

    public FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println(t.toString());
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false,null);
    }


}
