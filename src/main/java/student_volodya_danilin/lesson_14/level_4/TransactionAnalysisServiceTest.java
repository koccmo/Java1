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
        test.findUniqueTraderCitiesTest();

        //Task_29
        test.findTraderNamesFromCityTest();
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
    void findUniqueTraderCitiesTest() {
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

    //Task_29
    void findTraderNamesFromCityTest() {
        System.out.println("\nStarting findTraderNamesFromCity test ...");
        List<String> traderNamesCambridge = service.findTraderNamesFromCity(allTransactionsList,
                "Cambridge");
        List<String> traderNamesMilan = service.findTraderNamesFromCity(allTransactionsList,
                "Milan");
        for (String value : traderNamesCambridge) {
            if (isTraderFromCity(value, "Cambridge")) {
                System.out.println("Test OK, trader from Cambridge found!");
            }
            else {
                System.out.println("Test FAIL");
                isTestFailed = true;
            }
        }

        for (String value : traderNamesMilan) {
            if (isTraderFromCity(value, "Milan")) {
                System.out.println("Test OK, trader from Milan found!");
            }
            else {
                System.out.println("Test FAIL");
                isTestFailed = true;
            }
        }
        System.out.println("findTraderNamesFromCity test is finished!");
    }

    //для проверки Task_29
    boolean isTraderFromCity(String traderNameToSearch, String cityToCheck) {
        boolean result = false;
        for (Transaction value : allTransactionsList) {
            String foundName = value.getTrader().getName();
            String foundCity = value.getTrader().getCity();
            if (foundName.equals(traderNameToSearch)) {
                if (foundCity.equals(cityToCheck)) {
                    result = true;
                }
            }
        }
        return result;
    }
}
