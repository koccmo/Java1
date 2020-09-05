package student_volodya_danilin.lesson_9.level_4_5;

class FraudRule2 extends FraudRule{

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {

        boolean result = false;

            if (t.getAmount() > 1000000) {
                result = true;
                System.out.println("DENIED");
                System.out.println("Transaction amount too big!");
        }

        return result;
    }
}
