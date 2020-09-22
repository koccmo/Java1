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

}