package student_igors_bartkevics.lesson_9.homework.level_4.task_17;

public class FraudDetectorTest {

    FraudDetector detector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.goodTraderTest();
        test.fraudTraderTest();

    }

    void goodTraderTest() {
        Trader goodTrader = new Trader("Igors", "Riga");
        boolean condition = !detector.isFraud(new Transaction(goodTrader, 100));
        checkResult(condition, "Good trader");
    }

    void fraudTraderTest() {
        Trader fraudTrader = new Trader("Pokemon", "Tokyo");
        boolean condition = detector.isFraud(new Transaction(fraudTrader, 100));
        checkResult(condition, "Fraud trader");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }



}
