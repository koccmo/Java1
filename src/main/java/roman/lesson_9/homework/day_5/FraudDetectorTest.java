package roman.lesson_9.homework.day_5;

import java.util.ArrayList;

public class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();

        test.initializeFraudRules();
        test.overLimitTest();
        test.normalTransactionTest();
        test.pokemonNameTest();
        test.germanyOverLimitTest();
        test.germanyNormalTransaction();
        test.traderFromJamaica();
        test.traderFromSydney();
    }
    ArrayList<FraudRule> fraudRules = new ArrayList<>();
    FraudDetector fraudDetector = new FraudDetector(fraudRules);


    Trader traderFromUk = new Trader("John", "London", "UK");
    Trader traderPokemon = new Trader("Pokemon", "Lielupe", "Latvia");
    Trader traderFromGermany = new Trader("Alex", "Berlin", "Germany");
    Trader traderFromJamaica = new Trader ("James", "Jamaica", "Jamaica");
    Trader traderFromSydney = new Trader ("Oliver", "Sydney", "Australia");

    Transaction ukOverLimit = new Transaction(traderFromUk, 1000001);
    Transaction ukNormal = new Transaction(traderFromUk, 10000);
    Transaction pokemonName = new Transaction(traderPokemon, 1000);
    Transaction germanyOverLimit = new Transaction(traderFromGermany, 1001);
    Transaction germanyNormal = new Transaction(traderFromGermany, 1000);
    Transaction fromJamaica = new Transaction(traderFromJamaica, 1000);
    Transaction fromSydney = new Transaction(traderFromSydney, 2000);

    void initializeFraudRules() {
        fraudRules.add(new FraudRule1("FraudRule1"));
        fraudRules.add(new FraudRule2("FraudRule2"));
        fraudRules.add(new FraudRule3("FraudRule3"));
        fraudRules.add(new FraudRule4("FraudRule4"));
        fraudRules.add(new FraudRule5("FraudRule5"));

    }

    void overLimitTest() {
        boolean condition = fraudDetector.isFraud(ukOverLimit);
        checkResult(condition, "Over limit Test");
    }

    void normalTransactionTest() {
        checkResult(!fraudDetector.isFraud(ukNormal), "Normal Transaction Test");
    }

    void pokemonNameTest() {
        checkResult(fraudDetector.isFraud(pokemonName), "Pokemon name Test");
    }

    void germanyOverLimitTest() {
        checkResult(fraudDetector.isFraud(germanyOverLimit), "Germany over Limit Test");
    }

    void germanyNormalTransaction() {
        checkResult(!fraudDetector.isFraud(germanyNormal), "Germany Normal Transaction Test");
    }

    void traderFromJamaica() {
        checkResult(fraudDetector.isFraud(fromJamaica), "Trader from Jamaica Test");
    }

    void traderFromSydney() {
        checkResult(fraudDetector.isFraud(fromSydney), "Trader from Sydney Test");
    }


    void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " - OK!");
        } else {
            System.out.println(nameOfTest + " - False!");
        }
    }
}
