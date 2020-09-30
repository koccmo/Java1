package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

abstract class FraudRule {

    private String ruleName;

    FraudRule (String ruleName){
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud (Transaction t);

    String getRuleName(){
        return  ruleName;
    };
}
