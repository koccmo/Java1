package student_jaroslav_brutan.lesson_9.day_5;

class FraudRule2 extends FraudRule {

    public FraudRule2(String FraudRule2) {
        super(FraudRule2);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }

}
