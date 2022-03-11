package roman.lesson_9.homework.day_6;



public class FraudRuleTest {
    public static void main(String[] args) {
        FraudRuleTest test = new FraudRuleTest();
        test.isPokemonName();
        test.overLimitTransaction();
        test.traderFromSydney();
        test.traderFromJamaica();
        test.germanyTraderOverLimit();
        test.germanyNormalTransaction();
    }

    FraudRule rule1 = new FraudRule1("FraudRule1");
    FraudRule rule2 = new FraudRule2("FraudRule2");
    FraudRule rule3 = new FraudRule3("FraudRule3");
    FraudRule rule4 = new FraudRule4("FraudRule4");
    FraudRule rule5 = new FraudRule5("FraudRule5");

    void isPokemonName () {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000);
        checkResult(rule1.isFraud(transaction), "Name of Trader = Pokemon");

    }

    void overLimitTransaction() {
        Trader trader = new Trader("Igor", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        checkResult(rule2.isFraud(transaction), "Over Limit Transaction");
    }

    void traderFromSydney() {
        Trader trader = new Trader("John", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 3009);
        checkResult(rule3.isFraud(transaction), "Trader from Sydney");
    }

    void traderFromJamaica() {
        Trader trader = new Trader("James", "Jamaica", "Jamaica");
        Transaction transaction = new Transaction(trader, 400000);
        checkResult(rule4.isFraud(transaction), "Trader from Jamaica");
    }

    void germanyTraderOverLimit() {
        Trader trader = new Trader("Robert", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        checkResult(rule5.isFraud(transaction), "Germany trader over limit");
    }

    void germanyNormalTransaction() {
        Trader trader = new Trader("James", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 999);
        checkResult(!rule5.isFraud(transaction), "Germany Normal Transaction");
    }

    void checkResult(boolean condition, String nameOfTest) {
        if (condition) {
            System.out.println(nameOfTest + " Test - OK!");
        } else {
            System.out.println(nameOfTest + " Test - FAIL!");
        }
    }
}

