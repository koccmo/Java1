package roman.lesson_9.homework.day_4.task_17;

public class FraudDetectorTest {

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isPokemonTest();
        test.isOverLimit();
        test.isTraderFromSydney();
        test.isTraderFromJamaica();
        test.isGermanyOverLimit();
    }
    FraudDetector fraudDetector = new FraudDetector();

    public void isPokemonTest() {
        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 10000);
        checkResult(fraudDetector.isPokemon(transaction), "Trader name is Pokemon");

    }

    public void isOverLimit() {
        Trader trader = new Trader("Roma", "Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        checkResult(fraudDetector.isLimit(transaction),
                "It over transaction limit");
    }

    public void isTraderFromSydney() {
        Trader trader = new Trader("Roman", "Sydney", "Australia");
        Transaction transaction = new Transaction(trader, 100);
        checkResult(fraudDetector.isSydneyTrader(transaction),
                "Is Trader from Sydney");
    }

    public void isTraderFromJamaica() {
        Trader trader = new Trader("Tabu", "Buu", "Jamaica");
        Transaction transaction = new Transaction(trader, 100);
        checkResult(fraudDetector.isJamaicaTrader(transaction), "Is Trader from Jamaica");
    }

    public void isGermanyOverLimit() {
        Trader trader = new Trader("Robert", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        checkResult(fraudDetector.isOverGermanyLimit(transaction),
                "Transaction over Germany Limit");
    }


    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " - OK!");
        } else {
            System.out.println(nameOfTest + " - Fail!");
        }
    }
}
