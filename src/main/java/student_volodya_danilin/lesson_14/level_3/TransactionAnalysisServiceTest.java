package student_volodya_danilin.lesson_14.level_3;

import java.util.List;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    List<Transaction> allTransactionsList = service.getTransactions();
    boolean isTestFailed = false;

    public static void main(String[] args) {
        TransactionAnalysisServiceTest test = new TransactionAnalysisServiceTest();

        //Task_20
        test.findTransactionsIn2011Test();

        //Task_21
        test.findTransactionsByYearTest();

        //Task_22
        test.sortAscendingByValueTest();

        //Task_23
        test.sortDescendingByValueTest();

        //Task_24
        test.findByYearAndSortByValueTest();

        test.concludeTests();

    }

    void testTransactionYear(Transaction t,int yearToTest) {
        int transactionYear = t.getYear();
        if (transactionYear == yearToTest) {
            System.out.println("Test OK, correct year!");
        }
        else {
            System.out.println("Test FAIL, year is incorrect! \nfound : " + transactionYear
                    + "\nneeded : " + yearToTest);
            isTestFailed = true;
        }
    }

    void concludeTests() {
        if (isTestFailed) {
            System.out.println("\nSome tests failed!");
        }
        else {
            System.out.println("\nAll tests OK");
        }
    }

    //Task_20
    void findTransactionsIn2011Test() {
        System.out.println("\nStarting findTransactionsIn2011 test ...");
        List<Transaction> transactions = service.findTransactionsIn2011(allTransactionsList);
        for (Transaction value : transactions) {
            testTransactionYear(value, 2011);
        }
        System.out.println("findTransactionsIn2011 test is finished!");
    }

    //Task_21
    void findTransactionsByYearTest() {
        System.out.println("\nStarting findTransactionsByYear test ...");
        System.out.println("Searching for transactions from 2011 ...");
        List<Transaction> transactions
                = service.findTransactionsByYear(allTransactionsList, 2011);
        for (Transaction value : transactions) {
            testTransactionYear(value, 2011);
        }
        System.out.println("Searching for transactions from 2012 ...");
        transactions = service.findTransactionsByYear(allTransactionsList, 2012);
        for (Transaction value : transactions) {
            testTransactionYear(value, 2012);
        }
        System.out.println("Searching for transactions from 2013 ...");
        transactions = service.findTransactionsByYear(allTransactionsList, 2013);
        for (Transaction value : transactions) {
            testTransactionYear(value, 2013); //в 2013 транзакций не было
        }
        System.out.println("findTransactionByYear test is finished!");
    }

    //Task_22
    void sortAscendingByValueTest() {
        System.out.println("\nStarting sortAscendingByValue test ...");
        List<Transaction> transactions = service.sortAscendingByValue(allTransactionsList);
        int currentValue = 0;
        for (Transaction value : transactions) {
            if (value.getValue() >= currentValue) {
                System.out.println(value.toString());
            }
            else {
                System.out.println("Test FAIL!");
                isTestFailed = true;
            }
        }
    }

    //Task_23
    void sortDescendingByValueTest() {
        System.out.println("\nStarting sortDescendingByValue");
        List<Transaction> transactions = service.sortDescendingByValue(allTransactionsList);
        int currentValue = 999999;
        for (Transaction value : transactions) {
            if (value.getValue() <= currentValue) {
                System.out.println(value.toString());
            }
            else {
                System.out.println("Test FAIL!");
                isTestFailed = true;
            }
        }
        System.out.println("sortDescendingByValue test is finished!");
    }

    //Task_25
    void findByYearAndSortByValueTest() {
        System.out.println("\nStarting findByYearAndSortByValue test ...");
        List<Transaction> transactions
                = service.findByYearAndSortAscendingByValue(allTransactionsList, 2011);
        int currentValue = 0;
        for (Transaction value : transactions) {
            if (value.getValue() >= currentValue) {
                System.out.println(value.toString());
            }
            else {
                System.out.println("Test FAIL!");
                isTestFailed = true;
            }
        }
        System.out.println("findByYearAndSortByValue test is finished!");
    }
}
