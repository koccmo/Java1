package student_igors_bartkevics.lesson_9.homework.level_x.super_task_2;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    // реализуйте конструктор класса

    public FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    // реализуйте get() и set() методы для каждого совйства

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
