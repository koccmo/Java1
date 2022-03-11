package roman.lesson_9.homework.day_6;



public abstract class FraudRule {

    protected String ruleName;

     public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

     public String getRuleName() {
         return ruleName;
     }
}
