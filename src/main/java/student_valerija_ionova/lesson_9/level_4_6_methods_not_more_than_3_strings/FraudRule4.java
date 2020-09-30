package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

class FraudRule4 extends FraudRule{

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }


}
