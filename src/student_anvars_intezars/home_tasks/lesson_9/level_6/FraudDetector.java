package student_anvars_intezars.home_tasks.lesson_9.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {

    private FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }


    FraudDetectionResult isFraud(Trader trader, int amount) {
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        boolean result = false;
        for (int i = 0; i < fraudRules.length; i++) {
            if (fraudRules[i].isFraud(trader, amount)) {
                result = true;
                fraudDetectionResult.setRuleName(fraudRules[i].getRuleName());
            }
        } fraudDetectionResult.setFraud(result);


        return fraudDetectionResult;
    }
}
