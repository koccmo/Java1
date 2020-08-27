package student_anvars_intezars.home_tasks.lesson_9.level_4.task17;

class TraderTest {

    public static void main(String[] args) {

        TraderTest traderTest = new TraderTest();
        traderTest.firstTestForFraud();
        traderTest.secondTestForFraud();
    }

    void firstTestForFraud() {
        Trader firstTrader = new Trader("Pokemon","Riga");
        Transaction firstTransaction = new Transaction(firstTrader,1000);
        int amountOfFirstTransaction = firstTransaction.getAmount();
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(firstTrader,amountOfFirstTransaction);
        if (result) {
            System.out.println("Test for detecting fraud by name = OK");
        } else {
            System.out.println("Test for detecting fraud by name = FAIL");
        }
    }

    void secondTestForFraud() {
        Trader secondTrader = new Trader("Digimon","Riga");
        Transaction secondTransaction = new Transaction(secondTrader,1000001);
        int amountOfSecondTransaction = secondTransaction.getAmount();
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(secondTrader,amountOfSecondTransaction);
        if (result) {
            System.out.println("Test for detecting fraud by amount = OK");
        } else {
            System.out.println("Test for detecting fraud by amount = FAIL");
        }
    }
}
