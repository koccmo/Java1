package student_valerija_ionova.lesson_9.level_5;

//Task23 создайте абстрактный класс FraudRule.


abstract class FraudRule {

    private String ruleName;


    FraudRule (String ruleName){
        this.ruleName = ruleName;
    }

    abstract boolean isFraud(Transaction t);

}
