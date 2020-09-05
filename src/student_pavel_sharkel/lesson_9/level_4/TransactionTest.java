package student_pavel_sharkel.lesson_9.level_4;

public class TransactionTest {

    public static void main(String[] args) {

        TransactionTest transactionTest = new TransactionTest();
        transactionTest.isPokemonTest();
        transactionTest.notPokemonTest();

    }

    public void notPokemonTest() {
        Trader trader = new Trader("Albert", "Ludza");
        //Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isFraud(trader)) {
            System.out.println("Not Pokemon test is OK");
        } else {
            System.out.println("Not Pokemon test is FAILED");
        }
    }

    public void isPokemonTest() {
        Trader trader = new Trader("Pokemon", "Talsi");
        //Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();

        if (fraudDetector.isFraud(trader)) {
            System.out.println("Is Pokemon test is FAILED");
        } else {
            System.out.println("Is Pokemon test is OK");
        }
    }
}
