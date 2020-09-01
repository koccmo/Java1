package student_valerija_ionova.lesson_9.level_6;


//Task30 создайте отдельный класс FraudDetectionResult для объединения двух возвращаемых значений:

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetectionResult {

    private boolean fraud;
    private ArrayList <String> ruleNames = new ArrayList<> ();


    void setFraud (boolean fraud){
        this.fraud = fraud;
    }

    boolean getFraud (){
        return fraud;
    }

    ArrayList <String> getRuleName(){
        return ruleNames;
    }

    void addRuleName(String ruleName){
        this.ruleNames.add(ruleName);
    }

}
