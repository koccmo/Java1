package student_volodya_danilin.lesson_9.level_4_5;

class FraudRule4 extends FraudRule{

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {

        boolean result = false;

        if (t.getCountry(t).equals("Jamaica")) {
            result = true;
            System.out.println("DENIED");
            System.out.println("Traders from Jamaica banned!");
        }

        return result;
    }
}
