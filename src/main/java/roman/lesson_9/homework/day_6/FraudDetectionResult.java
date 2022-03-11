package roman.lesson_9.homework.day_6;

public class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud) {
        this.fraud = fraud;
        ruleName = null;
    }

    public boolean isFraud() {
        return fraud;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }
}
