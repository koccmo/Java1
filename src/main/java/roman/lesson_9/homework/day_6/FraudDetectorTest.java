package roman.lesson_9.homework.day_6;

import java.util.ArrayList;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();

        test.initializeFraudRules();
        test.pokemonNameTest();
        test.overLimitTest();
        test.traderFromSydney();
        test.traderFromJamaica();
        test.germanyOverLimitTest();
        test.germanyNormalTransaction();
        test.normalTransactionTest();
    }

    ArrayList<FraudRule> fraudRules = new ArrayList<>();
    FraudDetector fraudDetector = new FraudDetector(fraudRules);

    Trader traderPokemon = new Trader("Pokemon", "Lielupe", "Latvia");
    Trader traderFromUk = new Trader("John", "London", "UK");
    Trader traderFromSydney = new Trader ("Oliver", "Sydney", "Australia");
    Trader traderFromGermany = new Trader("Alex", "Berlin", "Germany");
    Trader traderFromJamaica = new Trader ("James", "Jamaica", "Jamaica");


    Transaction pokemonName = new Transaction(traderPokemon, 1000);
    Transaction ukOverLimit = new Transaction(traderFromUk, 1000001);
    Transaction fromSydney = new Transaction(traderFromSydney, 2000);
    Transaction fromJamaica = new Transaction(traderFromJamaica, 1000);
    Transaction germanyOverLimit = new Transaction(traderFromGermany, 1001);
    Transaction germanyNormal = new Transaction(traderFromGermany, 1000);
    Transaction ukNormal = new Transaction(traderFromUk, 10000);


    void initializeFraudRules() {
        fraudRules.add(new FraudRule1("FraudRule1"));
        fraudRules.add(new FraudRule2("FraudRule2"));
        fraudRules.add(new FraudRule3("FraudRule3"));
        fraudRules.add(new FraudRule4("FraudRule4"));
        fraudRules.add(new FraudRule5("FraudRule5"));
    }

    void pokemonNameTest() {
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(pokemonName);
        String ruleOfName = fraudDetectionResult.getRuleName();
        checkResult(ruleOfName.equals("FraudRule1"), "Pokemon Name Test");
    }

    void overLimitTest() {
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(ukOverLimit);
        String nameOfRule = fraudDetectionResult.getRuleName();
        checkResult(nameOfRule.equals("FraudRule2") && nameOfRule != null, "Over limit Test");
    }

    void traderFromSydney() {
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(fromSydney);
        String nameOfRule = fraudDetectionResult.getRuleName();
        checkResult(nameOfRule.equals("FraudRule3"), "Trader from Sydney Test");
    }

    void traderFromJamaica() {
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(fromJamaica);
        String nameOfRule = fraudDetectionResult.getRuleName();
        checkResult(nameOfRule.equals("FraudRule4"), "Trader from Jamaica Test");
    }

    void germanyOverLimitTest() {
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(germanyOverLimit);
        String nameOfRule = fraudDetectionResult.getRuleName();
        checkResult(nameOfRule.equals("FraudRule5"), "Germany over Limit Test");
    }

    void germanyNormalTransaction() {
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(germanyNormal);
        String nameOfRule = fraudDetectionResult.getRuleName();
        checkResult(nameOfRule == null, "Germany Normal Transaction Test");
    }

    void normalTransactionTest() {
        FraudDetectionResult fraudDetectionResult = fraudDetector.isFraud(ukNormal);
        String nameOfRule = fraudDetectionResult.getRuleName();
        checkResult(nameOfRule == null, "Normal Transaction Test");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " - OK!");
        } else {
            System.out.println(nameOfTest + " - False!");
        }
    }
}
