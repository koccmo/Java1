package student_volodya_danilin.lesson_9.level_4.Task_17;

class FraudRule3 extends FraudRule{

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {

        boolean result = false;

        if (t.getCity(t).equals("Sydney")) {
            result = true;
            System.out.println("DENIED");
            System.out.println("Traders from Sydney banned!");
        }

        return result;
    }
}
