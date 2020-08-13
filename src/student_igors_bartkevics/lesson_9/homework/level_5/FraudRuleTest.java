package student_igors_bartkevics.lesson_9.homework.level_5;

class FraudRuleTest {

    FraudRule rule1 = new FraudRule1("Rule 1");
    FraudRule rule2 = new FraudRule2("Rule 2");
    FraudRule rule3 = new FraudRule3("Rule 3");
    FraudRule1 rule4 = new FraudRule1("Rule 4");
    FraudRule1 rule5 = new FraudRule1("Rule 5");

    public static void main(String[] args) {
        FraudRuleTest test = new FraudRuleTest();

        test.pokemonTest();        //Rule 1 check
        test.notPokemonTest();    //Rule 1 check
        test.transactionAmountExceeds1000000Test();    //Rule 2 check
        test.transactionAmountEquals1000000Test();    //Rule 2 check
        test.transactionAmountLessThan1000000Test(); //Rule 2 check
        test.traderIsFromSydney();      //Rule 3 check
        test.traderIsNotFromSydney();  //Rule 3 check



    }

    //Rule 1 positive test (Trader is Pokemon)
    void pokemonTest() {
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        boolean condition = rule1.isFraud(transaction);
        checkResult(condition, "Trader is Pokemon");
    }

    //Rule 1 negative test (Trader is NOT Pokemon)
    void notPokemonTest() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        boolean condition = !rule1.isFraud(transaction);
        checkResult(condition, "Trader is NOT Pokemon");
    }

    //Rule 2 positive test (Transaction amount exceeds 1000000)
    void transactionAmountExceeds1000000Test() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000001);
        boolean condition = rule2.isFraud(transaction);
        checkResult(condition, "Transaction amount exceeds 1000000");
    }

    //Rule 2 negative test (Transaction amount equals 1000000)
    void transactionAmountEquals1000000Test() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean condition = !rule2.isFraud(transaction);
        checkResult(condition, "Transaction amount equals 1000000");
    }

    //Rule 2 negative test (Transaction amount less than 1000000)
    void transactionAmountLessThan1000000Test() {
        Trader trader = new Trader("Sam Johnson", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = !rule2.isFraud(transaction);
        checkResult(condition, "Transaction amount does NOT exceed 1000000");
    }

    //Rule 3 positive test (Trader is from Sydney)
    void traderIsFromSydney() {
        Trader trader = new Trader("Sam Johnson", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = rule3.isFraud(transaction);
        checkResult(condition, "Trader is from Sydney");
    }

    //Rule 3 negative test (Trader is NOT from Sydney)
    void traderIsNotFromSydney() {
        Trader trader = new Trader("Sam Johnson", "Chicago", "USA");
        Transaction transaction = new Transaction(trader, 100000);
        boolean condition = !rule3.isFraud(transaction);
        checkResult(condition, "Trader is NOT from Sydney");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
