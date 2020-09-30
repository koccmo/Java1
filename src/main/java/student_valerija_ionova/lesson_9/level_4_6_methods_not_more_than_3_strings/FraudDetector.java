package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FraudDetector {

    private List<FraudRule> listOfRules;

    FraudDetector (FraudRule...fraudRules){
        this.listOfRules = new ArrayList<> (Arrays.asList(fraudRules));
    }

    FraudDetectionResult isFraud(Transaction t) {
        FraudDetectionResult fraudDetectionResult = createFraudDetectionResult(t);
        printTransactionIfIsFraud(fraudDetectionResult.getIsTransactionFraud(), t);
        return fraudDetectionResult;
    }

    private void printTransactionIfIsFraud(boolean isFraud, Transaction t){
        if (isFraud) {
            System.out.println(t.toString());
        }
    }

    private FraudDetectionResult createFraudDetectionResult (Transaction t){
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        for (int i = 0; i < listOfRules.size(); i ++){
            fraudDetectionResult = checkRuleNameForFraud(listOfRules.get(i), t, fraudDetectionResult);
        }
        return fraudDetectionResult;
    }

    private FraudDetectionResult checkRuleNameForFraud (FraudRule fraudRule, Transaction t,
                                                        FraudDetectionResult fraudDetectionResult){
        if (fraudRule.isFraud(t)) {
            fraudDetectionResult = updateFraudDetectionResult(fraudDetectionResult, fraudRule);
        }
        return fraudDetectionResult;
    }

    private FraudDetectionResult updateFraudDetectionResult (FraudDetectionResult fraudDetectionResult,
                                                             FraudRule fraudRule){
        fraudDetectionResult.addRuleName(fraudRule.getRuleName());
        fraudDetectionResult.setTransactionFraud(true);
        return fraudDetectionResult;
    }


}
