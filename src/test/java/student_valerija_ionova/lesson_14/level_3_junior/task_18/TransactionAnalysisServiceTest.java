package student_valerija_ionova.lesson_14.level_3_junior.task_18;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();

    @Test
    public void testAllTransactionsIn2011(){
        List<Transaction> result = transactionAnalysisService.getTransactionsInDefinedYear(transactionTestData.getTransactions(),
                2011);
        assertEquals(2, result.size());
    }

    @Test
    public void testAllTransactionsIn2012(){
        List<Transaction> result = transactionAnalysisService.getTransactionsInDefinedYear(transactionTestData.getTransactions(),
                2012);
        assertEquals(4, result.size());
    }

    @Test
    public void testAllTransactionsIn2013(){
        List<Transaction> result = transactionAnalysisService.getTransactionsInDefinedYear(transactionTestData.getTransactions(),
                2013);
        assertEquals(0, result.size());
    }

}