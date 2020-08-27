package student_anvars_intezars.home_tasks.lesson_9.level_4.task17;

class TraderTest {

    public static void main(String[] args) {

        TraderTest traderTest = new TraderTest();
        traderTest.firstTestForFraud();
    }

    void firstTestForFraud() {
        Trader firstTrader = new Trader("Pokemon","Riga");
        Transaction firstTransaction = new Transaction(firstTrader,1000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(firstTrader);
        if (result) {
            System.out.println("Test for detecting fraud by name = OK");
        } else {
            System.out.println("Test for detecting fraud by name = FAIL");
        }
    }
}
