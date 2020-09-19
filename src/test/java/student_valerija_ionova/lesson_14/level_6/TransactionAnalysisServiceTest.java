package student_valerija_ionova.lesson_14.level_6;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();
    TransactionTestData transactionTestData = new TransactionTestData();

    @Test
    public void testMaxValue(){
        assertEquals(Optional.of(1000), transactionAnalysisService.getMaxValue(transactionTestData.getTransactions()));
    }

    @Test
    public void testMinValue(){
        assertEquals(Optional.of(300), transactionAnalysisService.getMinValue(transactionTestData.getTransactions()));
    }


}