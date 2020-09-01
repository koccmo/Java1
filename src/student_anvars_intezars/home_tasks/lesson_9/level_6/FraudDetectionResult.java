package student_anvars_intezars.home_tasks.lesson_9.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    /*FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;

        Мне показалось лишним использовать конструктор, так как имеем гетеры и сетеры
    }*/

    void setFraud(boolean fraud) {
        this.fraud = fraud;
    }
    void setRuleName (String ruleName) {
        this.ruleName = ruleName;
    }

    boolean getFraud () {
        return fraud;
    }
    String getRuleName() {
        return ruleName;
    }

}
