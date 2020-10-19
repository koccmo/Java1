package student_volodya_danilin.lesson_15.level_2;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

//Task_9
@CodeReview(approved = true)
class FraudDetectorTest {
    private static List<String> bannedNames = new ArrayList<>();
    private static List<String> bannedCities = new ArrayList<>();
    static {
        bannedNames.add("Banned name");
        bannedCities.add("Banned city");
    }
    private FraudDetector detector = new FraudDetector(bannedNames, bannedCities);
    boolean isSomeTestFailed = false;

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        boolean isFraudResult;
        System.out.println("\nTesting isFraud of FraudDetector.");

        System.out.print("Performing name ban test ... ");
        isFraudResult = test.isTraderNameBanWorking();
        test.printTestResult(isFraudResult);

        System.out.print("Performing city ban test ... ");
        isFraudResult = test.isTraderCityBanWorking();
        test.printTestResult(isFraudResult);

        System.out.print("Performing name+city ban test ... ");
        isFraudResult = test.shouldReturnTrue();
        test.printTestResult(isFraudResult);

        System.out.print("Checking false positive ... ");
        isFraudResult = test.shouldReturnFalse();
        test.printTestResult(!isFraudResult);

        test.concludeTest();
    }

    private void printTestResult(boolean b) {
        if (b) {
            System.out.println("OK");
        }
        else {
            System.out.println("Test FAIL");
            this.isSomeTestFailed = true;
        }
    }

    private void concludeTest() {
        System.out.print("\nTests completed! ");
        if (!this.isSomeTestFailed) {
            System.out.println("All tests OK");
        }
        else {
            System.out.println("Some tests failed!");
        }
    }

    private boolean isTraderNameBanWorking() {
        Trader traderWithBannedName = new Trader("Banned name", "Allowed city");
        return detector.isFraud(traderWithBannedName);
    }

    private boolean isTraderCityBanWorking() {
        Trader traderWithBannedCity = new Trader("Allowed name", "Banned city");
        return detector.isFraud(traderWithBannedCity);
    }

    private boolean shouldReturnTrue() {
        Trader bannedTrader = new Trader("Banned name", "Banned city");
        return detector.isFraud(bannedTrader);
    }

    private boolean shouldReturnFalse() {
        Trader allowedTrader = new Trader("Allowed name", "Allowed city");
        return detector.isFraud(allowedTrader);
    }
}
