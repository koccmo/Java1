package student_volodya_danilin.lesson_14.level_4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    TransactionTestData testData = new TransactionTestData();
    List<Transaction> allTransactionsList = testData.getTransactions();
    boolean isTestFailed = false;

    public static void main(String[] args) {
        TransactionAnalysisServiceTest test = new TransactionAnalysisServiceTest();

        //Task_25
        test.findAllYearsWithTransactionsTest();

        //Task_26
        test.findAllUniqueYearsWithTransactionsTest();

        //Task_27
        test.findAllUniqueTradersTest();

        //Task_28
        test.findUniqueTraderCities();
    }

    //Task_25
    void findAllYearsWithTransactionsTest() {
        System.out.println("\nStarting findAllYearsWithTransactions test ...");
        List<Integer> yearsWithTransactions
                = service.findAllYearsWithTransactions(allTransactionsList);
        int currentMinYear = 0;
        for (Integer value : yearsWithTransactions) {
            if (value >= currentMinYear) {
                currentMinYear = value;
                System.out.println(value);
            }
            else {
                System.out.println("Test FAILED!");
                isTestFailed = true;
            }
        }
        System.out.println("findAllYearsWithTransactions test is finished!");
    }

    //Task_26
    void findAllUniqueYearsWithTransactionsTest() {
        System.out.println("\nStarting findAllUniqueYearsWithTransactions test ...");
        List<Integer> yearsWithTransactions
                = service.findAllUniqueYearsWithTransactions(allTransactionsList);
        int previousYear = 0;
        for (Integer value : yearsWithTransactions) {
            if (value != previousYear) {
                previousYear = value;
                System.out.println(value);
            }
            else {
                System.out.println("Test FAILED!");
                isTestFailed = true;
            }
        }
    }

    //Task_27
    void findAllUniqueTradersTest() {
        System.out.println("\nStarting findAllUniqueTraders test ...");
        List<Trader> traders = service.findAllUniqueTraders(allTransactionsList);
        Set<Trader> uniqueTraders = new HashSet<>(traders);
        for (Trader value : traders) {
            System.out.println(value.toString());
        }
        if (uniqueTraders.size() == traders.size()) {
            System.out.println("Test OK!");
        }
        else {
            System.out.println("Test FAIL!");
            isTestFailed = true;
        }
    }

    //Task_28
    void findUniqueTraderCities() {
        System.out.println("\nStarting findUniqueTraderCities test ...");
        List<String> cities = service.findUniqueTraderCities(allTransactionsList);
        Set<String> uniqueCities = new HashSet<>(cities);
        for (String value : cities) {
            System.out.println(value);
        }
        if (uniqueCities.size() == cities.size()) {
            System.out.println("Test OK!");
        }
        else {
            System.out.println("Test FAIL!");
            isTestFailed = true;
        }
    }
}
