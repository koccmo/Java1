package student_aleksandra_maksimovic.lesson_9.level_5.task_22_29;


class FraudDetector {

    FraudRule[] rules;

    public FraudDetector()
    {
        this.rules = new FraudRule[] {
                new FraudRule1("pokemon"),
                new FraudRule2("isTransactionExceededLimit"),
                new FraudRule3("isSydney"),
                new FraudRule4("isJamaica"),
                new FraudRule5("isGermanAndMoreThen1000")
        };
    }

    boolean isFraud(Transaction t) {

        for (FraudRule rule : this.rules)
        {
            if (rule.isFraud(t))
                return true;
        }
        return false;
    }


}