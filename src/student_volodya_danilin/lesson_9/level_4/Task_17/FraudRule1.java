package student_volodya_danilin.lesson_9.level_4.Task_17;

class FraudRule1 extends FraudRule{

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {

        boolean result = false;

        if (t.getTrader().getFullName().equals("Pokemon")) {
            result = true;
            System.out.println("DENIED");
            System.out.println("Pokemon not allowed to trade!");
        }

        return result;
    }

}
