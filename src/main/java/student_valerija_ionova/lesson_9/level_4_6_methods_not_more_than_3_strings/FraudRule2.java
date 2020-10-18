package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

class FraudRule2 extends FraudRule{

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
