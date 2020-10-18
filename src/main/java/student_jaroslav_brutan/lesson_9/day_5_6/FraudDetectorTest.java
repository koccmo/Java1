package student_jaroslav_brutan.lesson_9.day_5_6;

import java.util.ArrayList;

public class FraudDetectorTest {

    ArrayList<FraudRule> allFraudRules = new ArrayList<>();
    FraudDetector fraudDetector = new FraudDetector(allFraudRules);

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.getFraudRules();
        test.isPokemonTest();
        test.isNotPokemonTest();
        test.transactionMoneyExceeds1000000Test();
        test.transactionMoneyDoesNotExceed1000000Test();
        test.traderFromSydneyTest();
        test.tradeNotFromSydneyTest();
        test.traderFromJamaicaTest();
        test.traderNotFromJamaicaTest();
        test.germanyTraderExceedsMoney1000Test();
        test.germanyTraderDoesNotExceed1000MoneyTest();
        test.notGermanyTraderExceeds1000MoneyTest();
    }

    public void getFraudRules(){
        allFraudRules.add(new FraudRule1("Rule 1"));
        allFraudRules.add(new FraudRule2("Rule 2"));
        allFraudRules.add(new FraudRule3("Rule 3"));
        allFraudRules.add(new FraudRule4("Rule 4"));
        allFraudRules.add(new FraudRule5("Rule 5"));
    }

    public void isPokemonTest(){
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 1");
        checkCorrectResult(condition,"Trader is a pokemon!");
    }

    public void isNotPokemonTest(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkCorrectResult(condition,"Trader is a pokemon!");
    }

    public void transactionMoneyExceeds1000000Test(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 2");
        checkCorrectResult(condition, "Transaction money exceeds 1000000!");
    }

    public void transactionMoneyDoesNotExceed1000000Test(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 999999);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkCorrectResult(condition, "Transaction money does not exceed 1000000!");
    }

    public void traderFromSydneyTest(){
        Trader trader = new Trader("Jaroslav", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 3");
        checkCorrectResult(condition, "Trader from Sydney!");
    }

    public void tradeNotFromSydneyTest(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkCorrectResult(condition, "Trader not from Sydney!");
    }

    public void traderFromJamaicaTest(){
        Trader trader = new Trader("Jaroslav", "Portmore", "Jamaica");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 4");
        checkCorrectResult(condition, "Trader from Jamaica!");
    }

    public void traderNotFromJamaicaTest(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 200);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkCorrectResult(condition, "Trader not from Jamaica!");
    }

    public void germanyTraderExceedsMoney1000Test(){
        Trader trader = new Trader("Jaroslav", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = result.isFraud() && ruleName.equals("Rule 5");
        checkCorrectResult(condition, "Germany trader and money exceeds 1000!");
    }

    public void germanyTraderDoesNotExceed1000MoneyTest(){
        Trader trader = new Trader("Jaroslav", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkCorrectResult(condition, "Germany trader does not exceed 1000!");
    }

    public void notGermanyTraderExceeds1000MoneyTest(){
        Trader trader = new Trader("Jaroslav", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1001);
        FraudDetectionResult result = fraudDetector.isFraud(transaction);
        String ruleName = result.getRuleName();
        boolean condition = !result.isFraud() && (ruleName == null);
        checkCorrectResult(condition, "Trader is not from Germany but exceeds 1000 money!");
    }

    public void checkCorrectResult(boolean condition, String testName){
        if (condition){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
