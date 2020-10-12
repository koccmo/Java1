package student_volodya_danilin.lesson_14.level_5_6;

import java.util.List;
import java.util.Optional;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    TransactionTestData testData = new TransactionTestData();
    List<Transaction> allTransactionList = testData.getTransactions();

    public static void main(String[] args) {
        TransactionAnalysisServiceTest test = new TransactionAnalysisServiceTest();

        //Task_34
        test.isAnyTraderBasedOnCityTest();

        //Task_35
        test.findMaxTransactionValueTest();

        //Task_36
        test.findMinTransactionValueTest();

        //Task_37
        test.findAndSortTraderNamesTest();

        //Task_38
        test.findAndSortTraderCities();

    }

    //Task_34
    void isAnyTraderBasedOnCityTest() {
        System.out.println("\nStarting isAnyTraderBasedOnCity test ...");
        boolean cambridgeBased = service.isAnyTraderBasedOnCity(allTransactionList,
                "Cambridge");
        if (cambridgeBased) {
            System.out.println("Cambridge test OK");
        }
        else {
            System.out.println("Cambridge test FAIL");
        }

        boolean londonBased = service.isAnyTraderBasedOnCity(allTransactionList,
                "London");
        if (!londonBased) {                  //их быть не должно
            System.out.println("London test OK");
        }
        else {
            System.out.println("London test FAIL");
        }

        boolean milanBased = service.isAnyTraderBasedOnCity(allTransactionList,
                "Milan");
        if (milanBased) {
            System.out.println("Milan tes OK");
        }
        else {
            System.out.println("Milan test FAIL");
        }
        System.out.println("Finishing isAnyTraderBasedOnCity test.");
    }

    //Task_35
    void findMaxTransactionValueTest() {
        System.out.println("\nStarting findMaxTransactionValue test ...");
        Optional<Integer> maxValue = service.findMaxTransactionValue(allTransactionList);
        if (maxValue.isPresent()) {
            if (maxValue.get().equals(1000)) {
                System.out.println("Test OK");
            }
            else {
                System.out.println("Test FAIL");
            }
        }
        System.out.println("Finishing findMaxTransactionValue test.");
    }

    //Task_36
    void findMinTransactionValueTest() {
        System.out.println("\nStarting findMinTransactionValue test ...");
        Optional<Integer> minValue = service.findMinTransactionValue(allTransactionList);
        if (minValue.isPresent()) {
            if (minValue.get().equals(300)) {
                System.out.println("Test OK");
            }
            else {
                System.out.println("Test FAIL");
            }
        }
        System.out.println("Finishing findMinTransactionValue test.");
    }

    //Task_37
    void findAndSortTraderNamesTest() {
        System.out.println("\nStarting findAndSortTraderNames test ...");
        String foundNames = service.findAndSortTraderNames(allTransactionList);
        System.out.println(foundNames);
        if (foundNames.startsWith("Alan")
        && foundNames.endsWith("Raoul")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Finishing findAndSortTraderNames test.");
    }

    //Task_38
    void findAndSortTraderCities() {
        System.out.println("\nStarting findAndSortTraderCities test ...");
        String foundCities = service.findAndSortTraderCities(allTransactionList);
        System.out.println(foundCities);
        if (foundCities.startsWith("Cambridge")
        && foundCities.endsWith("Milan")) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("Finishing findAndSortTraderCities test.");
    }
}
