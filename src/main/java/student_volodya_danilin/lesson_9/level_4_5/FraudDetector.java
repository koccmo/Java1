package student_volodya_danilin.lesson_9.level_4_5;

class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }


    FraudDetectionResult isFraud(Transaction t) {

        FraudDetectionResult result = new FraudDetectionResult();
        boolean fraud = false;
        String ruleName;

        for (FraudRule fraudRule : this.fraudRules) {
            if (fraudRule.isFraud(t)) {
                fraud = true;
                ruleName = fraudRule.getRuleName();
                result.addBrokenRules(ruleName);
                result.setFraud(fraud);
            }
        }
        result.setFraud(fraud);

        if (!fraud) {
            System.out.println("ALLOWED");
            System.out.println("No fraud found!");
        }

        return result;
    }


    public String getRuleName(FraudRule rule) {
        String result;
        result = rule.getRuleName();
        return result;
    }
}