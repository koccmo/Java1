package student_igors_bartkevics.lesson_9.homework.level_x.super_task_2;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudDetectorTest {

    ArrayList<FraudRule> fraudRules = new ArrayList<>();
    FraudDetector fraudDetector = new FraudDetector(fraudRules);

    Trader pokemon = new Trader.TraderBuilder("Pokemon")
                               .city("Tokyo")
                               .country("Japan")
                               .build();

    Trader goodTrader = new Trader.TraderBuilder("Sam Johnson")
                                .city("Chicago")
                                .country("USA")
                                .build();

    Trader traderFromSydney = new Trader.TraderBuilder("Sam Johnson")
                                        .city("Sydney")
                                        .country("Australia")
                                        .build();

    Trader traderFromJamaica = new Trader.TraderBuilder("Bob Marley")
                                         .city("Kingston")
                                         .country("Jamaica")
                                         .build();

    Trader traderFromGermany = new Trader.TraderBuilder("Christoph Waltz")
                                         .city("Munich")
                                         .country("Germany")
                                         .build();

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();

        test.initializeFraudRules();

        test.pokemonTest();      //Rule 1 check
        test.goodTraderTest();
        test.transactionAmountExceeds1000000Test();     //Rule 2 check
        test.transactionAmountEquals1000000Test();     //Rule 2 check
        test.transactionAmountLessThan1000000Test();  //Rule 2 check
        test.traderIsFromSydney();        //Rule 3 check
        test.traderIsFromJamaica();      //Rule 4 check
        test.traderIsFromGermanyAndTransactionAmountExceeds1000();       //Rule 5 check
        test.traderIsFromGermanyAndTransactionAmountEquals1000();       //Rule 5 check
        test.traderIsFromGermanyAndTransactionAmountIsLessThan1000();  //Rule 5 check
        test.goodTraderAndTransactionAmountExceeds1000();             //Rule 5 check

    }

    void initializeFraudRules() {
        fraudRules.add(new FraudRule1("Rule 1"));
        fraudRules.add(new FraudRule2("Rule 2"));
        fraudRules.add(new FraudRule3("Rule 3"));
        fraudRules.add(new FraudRule4("Rule 4"));
        fraudRules.add(new FraudRule5("Rule 5"));
    }

    //Rule 1 positive test
    void pokemonTest() {
        Transaction transaction = new Transaction(pokemon, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 1");
        checkResult(condition, "Trader is Pokemon");
    }

    //Rule 1 negative test
    void goodTraderTest() {
        Transaction transaction = new Transaction(goodTrader, 100);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkResult(condition, "Trader is NOT Pokemon");
    }

    //Rule 2 positive test
    void transactionAmountExceeds1000000Test() {
        Transaction transaction = new Transaction(goodTrader, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 2");
        checkResult(condition, "Transaction amount exceeds 1000000");
    }

    //Rule 2 negative test
    void transactionAmountEquals1000000Test() {
        Transaction transaction = new Transaction(goodTrader, 1000000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkResult(condition, "Transaction amount equals 1000000");
    }

    //Rule 2 negative test
    void transactionAmountLessThan1000000Test() {
        Transaction transaction = new Transaction(goodTrader, 100000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkResult(condition, "Transaction amount does NOT exceed 1000000");
    }

    //Rule 3 positive test
    void traderIsFromSydney() {
        Transaction transaction = new Transaction(traderFromSydney, 100000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 3");
        checkResult(condition, "Trader is from Sydney");
    }

    //Rule 4 positive test
    void traderIsFromJamaica() {
        Transaction transaction = new Transaction(traderFromJamaica, 100000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 4");
        checkResult(condition, "Trader is from Jamaica");
    }

    //Rule 5 positive test
    void traderIsFromGermanyAndTransactionAmountExceeds1000() {
        Transaction transaction = new Transaction(traderFromGermany, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 5");
        checkResult(condition, "Trader is from Germany and transaction amount exceeds 1000");
    }

    //Rule 5 negative test
    void traderIsFromGermanyAndTransactionAmountEquals1000() {
        Transaction transaction = new Transaction(traderFromGermany, 1000);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkResult(condition, "Trader is from Germany and transaction amount equals 1000");
    }

    //Rule 5 negative test
    void traderIsFromGermanyAndTransactionAmountIsLessThan1000() {
        Transaction transaction = new Transaction(traderFromGermany, 999);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkResult(condition, "Trader is from Germany and transaction amount is less than 1000");
    }

    //Rule 5 negative test
    void goodTraderAndTransactionAmountExceeds1000() {
        Transaction transaction = new Transaction(goodTrader, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkResult(condition, "Good trader and transaction amount exceeds 1000");
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
