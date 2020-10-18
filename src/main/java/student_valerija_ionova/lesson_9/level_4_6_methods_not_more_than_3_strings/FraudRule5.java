package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

class FraudRule5 extends FraudRule{

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("German") && t.getAmount() > 1000;
    }
}
