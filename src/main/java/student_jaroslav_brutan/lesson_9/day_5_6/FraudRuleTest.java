package student_jaroslav_brutan.lesson_9.day_5_6;

public class FraudRuleTest {

    FraudRule rule1 = new FraudRule1("Rule 1");
    FraudRule rule2 = new FraudRule2("Rule 2");
    FraudRule rule3 = new FraudRule3("Rule 3");
    FraudRule rule4 = new FraudRule4("Rule 4");
    FraudRule rule5 = new FraudRule5("Rule 5");

    public static void main(String[] args) {
        FraudRuleTest test = new FraudRuleTest();
        test.pokemonTest();
        test.negativePokemonTest();
        test.traderFromSydneyTest();
        test.traderNotFromSydneyTest();
        test.traderFromJamaicaTest();
        test.traderNotFromJamaicaTest();
        test.traderFromGermanyAndTransactionMoneyExceeds1000();
        test.traderFromGermanyAndTransactionMoneyIsLessThen1000();
        test.traderNotFromGermanyAndTransactionMoneyExceeds1000();
        test.transactionMoreThen1000000Test();
        test.transactionMoreThen1000000NegativeTest();
        test.transactionMoreThen1000000NegativeTest2();

    }

    public void pokemonTest(){
        Trader trader = new Trader("Pokemon", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        boolean condition = rule1.isFraud(transaction);
        checkCorrectResult(condition, "Trader is Pokemon");
    }

    public void negativePokemonTest(){
        Trader trader = new Trader("Jaroslav", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        boolean condition = !rule1.isFraud(transaction);
        checkCorrectResult(condition, "Trader is not a pokemon!");
    }

    public void transactionMoreThen1000000Test(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        boolean condition = rule2.isFraud(transaction);
        checkCorrectResult(condition, "Transaction is bigger than 1000000!");
    }

    public void transactionMoreThen1000000NegativeTest(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean condition = !rule2.isFraud(transaction);
        checkCorrectResult(condition, "Transaction equals 1000000!");
    }

    public void transactionMoreThen1000000NegativeTest2(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999999);
        boolean condition = !rule2.isFraud(transaction);
        checkCorrectResult(condition, "Transaction is less than 1000000!");
    }

    public void traderFromSydneyTest(){
        Trader trader = new Trader("Jaroslav", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 999999);
        boolean condition = rule3.isFraud(transaction);
        checkCorrectResult(condition, "Trader is from Sydney!");
    }

    public void traderNotFromSydneyTest(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999999);
        boolean condition = !rule3.isFraud(transaction);
        checkCorrectResult(condition, "Trader is not from Sydney!");
    }

    public void traderFromJamaicaTest(){
        Trader trader = new Trader("Jaroslav", "Jamaica", "Jamaica");
        Transaction transaction = new Transaction(trader, 999999);
        boolean condition = rule4.isFraud(transaction);
        checkCorrectResult(condition, "Trader is from Jamaica!");
    }

    public void traderNotFromJamaicaTest(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999999);
        boolean condition = !rule4.isFraud(transaction);
        checkCorrectResult(condition, "Trader is not from Jamaica!");
    }

    public void traderFromGermanyAndTransactionMoneyExceeds1000(){
        Trader trader = new Trader("Jaroslav", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        boolean condition = rule5.isFraud(transaction);
        checkCorrectResult
                (condition, "Trader is from germany and transaction money exceeds 1000!");
    }

    public void traderFromGermanyAndTransactionMoneyIsLessThen1000(){
        Trader trader = new Trader("Jaroslav", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        boolean condition = !rule5.isFraud(transaction);
        checkCorrectResult
                (condition, "Trader is from germany and transaction money is less then 1000!");
    }

    public void traderNotFromGermanyAndTransactionMoneyExceeds1000(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        boolean condition = !rule5.isFraud(transaction);
        checkCorrectResult
                (condition, "Trader is not from germany and transaction money exceeds 1000!");
    }
    public void checkCorrectResult(boolean condition, String testName){
        if (condition){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
