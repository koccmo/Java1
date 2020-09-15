package student_jaroslav_brutan.lesson_9.day_5;

class FraudRule5 extends FraudRule {

    public FraudRule5(String FraudRule5) {
        super(FraudRule5);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return (t.getTrader().getCountry().equals("Germany")) && t.getAmount() > 1000;
    }
}
