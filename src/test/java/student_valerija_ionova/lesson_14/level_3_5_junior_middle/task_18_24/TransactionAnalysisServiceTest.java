package student_valerija_ionova.lesson_14.level_3_5_junior_middle.task_18_24;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    @Test
    public void testSortedByValue(){
        List <Transaction> expectedResult = new ArrayList<>();
        expectedResult.add(transactionTestData.getTransactions().get(0));
        expectedResult.add(transactionTestData.getTransactions().get(2));
        expectedResult.add(transactionTestData.getTransactions().get(4));
        expectedResult.add(transactionTestData.getTransactions().get(3));
        expectedResult.add(transactionTestData.getTransactions().get(5));
        expectedResult.add(transactionTestData.getTransactions().get(1));
        List <Transaction> result =
                transactionAnalysisService.sortTransactionAscendingByValue(transactionTestData.getTransactions());
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSortedDescendingByValue(){
        List <Transaction> expectedResult = new ArrayList<>();
        expectedResult.add(transactionTestData.getTransactions().get(1));
        expectedResult.add(transactionTestData.getTransactions().get(5));
        expectedResult.add(transactionTestData.getTransactions().get(3));
        expectedResult.add(transactionTestData.getTransactions().get(4));
        expectedResult.add(transactionTestData.getTransactions().get(2));
        expectedResult.add(transactionTestData.getTransactions().get(0));

        List <Transaction> result =
                transactionAnalysisService.sortTransactionDescendingByValue(transactionTestData.getTransactions());
        assertEquals(expectedResult, result);
    }

    @Test
    public void testTransactionsIn2011SortedAscending(){
        List <Transaction> expectedResult = new ArrayList<>();
        expectedResult.add(transactionTestData.getTransactions().get(0));
        expectedResult.add(transactionTestData.getTransactions().get(2));

        List <Transaction> result =
                transactionAnalysisService.sortTransactionsIn2011AscendingByValue(transactionTestData.getTransactions());
        assertEquals(expectedResult, result);
    }

    @Test
    public void getSetOfDifferentYears(){
        Set<Integer> result = transactionAnalysisService.setOfDifferentYears(transactionTestData.getTransactions());
        assertEquals(2, result.size());
    }

    @Test
    public void getSetOfDifferentNames(){
        Set<String> result = transactionAnalysisService.setOfDifferentNames(transactionTestData.getTransactions());
        assertEquals(4, result.size());
    }

    @Test
    public void getSetOfDifferentCities(){
        Set<String> result = transactionAnalysisService.setOfDifferentCities(transactionTestData.getTransactions());
        assertEquals(2, result.size());
    }

    @Test
    public void getSetOfNamesFromCambridge(){
        Set<String> result = transactionAnalysisService.getTradersNamesFromDefinedCity(transactionTestData.getTransactions(),
                "Cambridge");
        assertEquals(3, result.size());
    }

    @Test
    public void getSetOfNamesFromMilan(){
        Set<String> result = transactionAnalysisService.getTradersNamesFromDefinedCity(transactionTestData.getTransactions(),
                "Milan");
        assertEquals(1, result.size());
    }



}
