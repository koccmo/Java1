package student_volodya_danilin.lesson_15.level_2;

import java.util.ArrayList;
import java.util.List;

//Task_9
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
        boolean booleanTestCondition;
        System.out.println("Testing isFraud of FraudDetector.");

        System.out.print("Performing name ban test ... ");
        booleanTestCondition = test.isTraderNameBanWorking();
        test.printTestResult(booleanTestCondition);

        System.out.print("Performing city ban test ... ");
        booleanTestCondition = test.isTraderCityBanWorking();
        test.printTestResult(booleanTestCondition);

        System.out.print("Performing name+city ban test ... ");
        booleanTestCondition = test.shouldReturnTrue();
        test.printTestResult(booleanTestCondition);

        System.out.print("Checking false positive ... ");
        booleanTestCondition = test.shouldReturnFalse();
        test.printTestResult(!booleanTestCondition);

        test.concludeTest();
    }

    private void printTestResult(boolean b) {
        if (b) {
            System.out.println("OK");
        }
        else {
            System.out.println("Test FAIL");
            isSomeTestFailed = true;
        }
    }

    private void concludeTest() {
        System.out.print("Tests completed! ");
        if (!isSomeTestFailed) {
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
