package student_aleksandra_maksimovic.lesson_9.level_6;


class FraudDetector {

    FraudRule[] rules;

    public FraudDetector()
    {
        this.rules = new FraudRule[] {
                new FraudRule1("rule 1"),
                new FraudRule2("rule 2"),
                new FraudRule3("rule 3"),
                new FraudRule4("rule 4"),
                new FraudRule5("rule 5")
        };
    }

    public FraudDetectionResult isFraud(Transaction t) {

        for (FraudRule rule : this.rules)
        {

            if (rule.isFraud(t)) {
                System.out.println("fraud Detected: transaction" + t);
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, "");
    }


}