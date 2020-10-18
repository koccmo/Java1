package student_jaroslav_brutan.lesson_9.day_5_6;

public class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    public boolean isFraud() {
        return fraud;
    }

    public FraudDetectionResult(boolean fraud, String fullName) {
        this.fraud = fraud;
        this.ruleName = fullName;
    }

    public void setFraud(boolean fraud) {
        this.fraud = fraud;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String fullName) {
        this.ruleName = fullName;
    }
}
