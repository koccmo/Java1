package student_valerija_ionova.lesson_9.level_6;


//Task30 создайте отдельный класс FraudDetectionResult для объединения двух возвращаемых значений:

import java.util.ArrayList;


public class FraudDetectionResult {

    private boolean fraud;
    private ArrayList <String> ruleNames;

    FraudDetectionResult (boolean fraud, ArrayList <String> ruleNames) {
        this.fraud = fraud;
        this.ruleNames = ruleNames;
    }

    boolean getFraud(){
        return fraud;
    }

    void setFraud (boolean fraud){
        this.fraud = fraud;
    }

    ArrayList <String> getRuleName(){
        return ruleNames;
    }

    void addRuleName(String ruleName){
        this.ruleNames.add(ruleName);
    }



}
