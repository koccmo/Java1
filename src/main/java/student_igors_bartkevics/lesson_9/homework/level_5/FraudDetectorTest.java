package student_igors_bartkevics.lesson_9.homework.level_5;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudDetectorTest {

    ArrayList<FraudRule> fraudRules = new ArrayList<>();
    FraudDetector fraudDetector = new FraudDetector(fraudRules);

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();

        test.initializeFraudRules();

        test.pokemonTest();      //Rule 1 check
        test.notPokemonTest();  //Rule 1 check
        test.transactionAmountExceeds1000000Test();     //Rule 2 check
        test.transactionAmountEquals1000000Test();     //Rule 2 check
        test.transactionAmountLessThan1000000Test();  //Rule 2 check
        test.traderIsFromSydney();        //Rule 3 check
        test.traderIsNotFromSydney();    //Rule 3 check
        test.traderIsFromJamaica();     //Rule 4 check
        test.traderIsNotFromJamaica(); //Rule 4 check
        test.traderIsFromGermanyAndTransactionAmountExceeds1000();       //Rule 5 check
        test.traderIsFromGermanyAndTransactionAmountEquals1000();       //Rule 5 check
        test.traderIsFromGermanyAndTransactionAmountIsLessThan1000();  //Rule 5 check
        test.traderIsNotFromGermanyAndTransactionAmountExceeds1000(); //Rule 5 check

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
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        boolean condition = fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is Pokemon");
    }

    //Rule 1 negative test
    void notPokemonTest() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is NOT Pokemon");
    }

    //Rule 2 positive test
    void transactionAmountExceeds1000000Test() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000001);
        boolean condition = fraudDetector.isFraud(transaction);
        checkResult(condition, "Transaction amount exceeds 1000000");
    }

    //Rule 2 negative test
    void transactionAmountEquals1000000Test() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Transaction amount equals 1000000");
    }

    //Rule 2 negative test
    void transactionAmountLessThan1000000Test() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Transaction amount does NOT exceed 1000000");
    }

    //Rule 3 positive test
    void traderIsFromSydney() {
        Trader trader = new Trader("Sam Johnson", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is from Sydney");
    }

    //Rule 3 negative test
    void traderIsNotFromSydney() {
        Trader trader = new Trader("Sam Johnson", "Chicago", "USA");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is NOT from Sydney");
    }

    //Rule 4 positive test
    void traderIsFromJamaica() {
        Trader trader = new Trader("Bob Marley", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is from Jamaica");
    }

    //Rule 4 negative test
    void traderIsNotFromJamaica() {
        //FraudDetector fraudDetector = new FraudDetector(fraudRules);

        Trader trader = new Trader("Sam Johnson", "Chicago", "USA");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is from Jamaica");
    }

    //Rule 5 positive test
    void traderIsFromGermanyAndTransactionAmountExceeds1000() {
        Trader trader = new Trader("Christoph Waltz", "Munich", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        boolean condition = fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is from Germany and transaction amount exceeds 1000");
    }

    //Rule 5 negative test
    void traderIsFromGermanyAndTransactionAmountEquals1000() {
        Trader trader = new Trader("Christoph Waltz", "Munich", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is from Germany and transaction amount equals 1000");
    }

    //Rule 5 negative test
    void traderIsFromGermanyAndTransactionAmountIsLessThan1000() {
        Trader trader = new Trader("Christoph Waltz", "Munich", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is from Germany and transaction amount is less than 1000");
    }

    //Rule 5 negative test
    void traderIsNotFromGermanyAndTransactionAmountExceeds1000() {
        Trader trader = new Trader("Larry Clark", "Los Angeles", "USA");
        Transaction transaction = new Transaction(trader, 1001);
        boolean condition = !fraudDetector.isFraud(transaction);
        checkResult(condition, "Trader is NOT from Germany and transaction amount exceeds 1000");
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
