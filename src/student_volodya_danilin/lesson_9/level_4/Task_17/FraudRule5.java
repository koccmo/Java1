package student_volodya_danilin.lesson_9.level_4.Task_17;

class FraudRule5 extends FraudRule{

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {

        boolean result = false;

        if (t.getTrader().getCountry().equals("Germany")
        && t.getAmount() > 1000) {
            result = true;
            System.out.println("Limit for German traders is 1000$");
        }

        return result;
    }
}
