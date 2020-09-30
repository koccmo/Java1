package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class FraudDetectionResult {

    private boolean isTransactionFraud;
    private List<String> ruleNames = new ArrayList<>();

    FraudDetectionResult (){
        this.isTransactionFraud = false;
    }

    boolean getIsTransactionFraud (){
        return isTransactionFraud;
    }

    void setTransactionFraud (boolean isTransactionFraud){
        this.isTransactionFraud = isTransactionFraud;
    }

    void addRuleName (String ruleName){
        ruleNames.add(ruleName);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FraudDetectionResult that = (FraudDetectionResult) o;
        return isTransactionFraud == that.isTransactionFraud &&
                Objects.equals(ruleNames, that.ruleNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTransactionFraud, ruleNames);
    }
}
