package student_igors_bartkevics.lesson_14.homework.level_3_junior;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionTestData testData = new TransactionTestData();
    List<Transaction> allTransactions = testData.getTransactions();
    TransactionAnalysisService service = new TransactionAnalysisService();

    @Test
    public void findAllTransactionsOf2011YearTest() {
        List<Transaction> allTransactionsOf2011Year =
                service.findAllTransactionsOf2011Year(allTransactions);
        assertEquals(2, allTransactionsOf2011Year.size());
    }

    @Test
    public void findTransactionsByYearTest() {
        List<Transaction> allTransactionsOf2011Year =
                service.findTransactionsByYear(allTransactions, 2011);
        List<Transaction> allTransactionsOf2012Year =
                service.findTransactionsByYear(allTransactions, 2012);

        assertEquals(2, allTransactionsOf2011Year.size());
        assertEquals(4, allTransactionsOf2012Year.size());
    }

    @Test
    public void sortTransactionsByValueTest() {
        List<Transaction> sortedTransactions =
                service.sortTransactionsByValue(allTransactions);
        assertEquals(300, sortedTransactions.get(0).getValue());
        assertEquals(400, sortedTransactions.get(1).getValue());
        assertEquals(700, sortedTransactions.get(2).getValue());
        assertEquals(710, sortedTransactions.get(3).getValue());
        assertEquals(950, sortedTransactions.get(4).getValue());
        assertEquals(1000, sortedTransactions.get(5).getValue());
    }

    @Test
    public void sortTransactionsByValueInReverseTest() {
        List<Transaction> sortedTransactions =
                service.sortTransactionsByValueInReverse(allTransactions);
        assertEquals(1000, sortedTransactions.get(0).getValue());
        assertEquals(950, sortedTransactions.get(1).getValue());
        assertEquals(710, sortedTransactions.get(2).getValue());
        assertEquals(700, sortedTransactions.get(3).getValue());
        assertEquals(400, sortedTransactions.get(4).getValue());
        assertEquals(300, sortedTransactions.get(5).getValue());
    }

    @Test
    public void findTransactionsOf2011YearAndSortThemByValueTest() {
        List<Transaction> sortedTransactions =
                service.findTransactionsOf2011YearAndSortThemByValue(allTransactions);
        assertEquals(300, sortedTransactions.get(0).getValue());
        assertEquals(400, sortedTransactions.get(1).getValue());
        assertEquals(2, sortedTransactions.size());

    }

}