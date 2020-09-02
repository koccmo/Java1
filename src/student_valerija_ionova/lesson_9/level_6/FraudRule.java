package student_valerija_ionova.lesson_9.level_6;

//Task23 создайте абстрактный класс FraudRule.
//Task31 В абстрактном классе FraudRule реализуйте get() метод для свойства ruleName: String getRuleName();

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;


    FraudRule (String ruleName){
        this.ruleName = ruleName;
    }

    String getRuleName(){
        return ruleName;
    }

    abstract boolean isFraud(Transaction t);

}
