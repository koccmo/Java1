package student_valerija_ionova.lesson_9.level_6;

/*Task 29
Создайте в классе FraudDetector конструктор, который принимает список объектов типа FraudRule.
Исправьте код метода FraudDetector.isFraud(Transaction t) - проити по всем FraudRule,
применить его для транзакции и если хоть одно правило обнаружить мошенничество то вернуть true.

Task32 Продолжаем работу над системой автоматического обнаружения мошенничества.
Поменяйте тип возвращаемого значения у метода FraudDetector.isFraud(Transaction t)
c boolean на FraudDetectionResult и внесите нужные изменения в код программы и тесты.

Теперь при срабатывании одного из правил определения мошенничества, вы можете
у самого правила узнать его название. Для этого достаточто будет вызвать метод
getRuleName() у объекта FraudRule. Полученное таким образом название правила
вы вернёте в качестве результата в объекте FraudDetectionResult.*/

import java.util.ArrayList;
import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector{

    ArrayList <FraudRule> fraudRules;

    FraudDetector (FraudRule... fraudRules){
        this.fraudRules = new ArrayList<>(Arrays.asList(fraudRules));
    }

    FraudDetectionResult isFraud (Transaction t){

        FraudDetectionResult result = new FraudDetectionResult();

        for (FraudRule fraudRule : fraudRules){
            if (fraudRule.isFraud(t)) {
                result.setFraud(true);
                result.addRuleName(fraudRule.getRuleName());
            }
        }
        if (result.getFraud()){
            System.out.println("FraudRules: "+result.getRuleName()+"\n"+t.toString());
        }
        return result;
    }

}
