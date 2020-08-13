package student_igors_bartkevics.lesson_9.homework.level_5;

class FraudRuleTest {

    FraudRule1 rule1 = new FraudRule1("Rule 1");
    FraudRule1 rule2 = new FraudRule1("Rule 2");
    FraudRule1 rule3 = new FraudRule1("Rule 3");
    FraudRule1 rule4 = new FraudRule1("Rule 4");
    FraudRule1 rule5 = new FraudRule1("Rule 5");

    public static void main(String[] args) {
        FraudRuleTest test = new FraudRuleTest();

        test.pokemonTest();
        test.notPokemonTest();

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
        Trader trader = new Trader("Sam", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 100);
        boolean condition = !rule1.isFraud(transaction);
        checkResult(condition, "Trader is NOT Pokemon");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
