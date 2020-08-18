package student_dmitrijs_jasvins.lesson_9.day_4_5_6;


import java.util.Arrays;
import java.util.List;

public class FraudDetector {
    private List<FraudRule> fraudRules;

    public FraudDetector(FraudRule... fraudRules) {
        this.fraudRules = Arrays.asList(fraudRules);
    }

    public FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                System.out.println(transaction.toString());
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false,null);
    }
}