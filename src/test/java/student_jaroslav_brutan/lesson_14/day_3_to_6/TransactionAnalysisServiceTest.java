package student_jaroslav_brutan.lesson_14.day_3_to_6;

import org.junit.Test;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class TransactionAnalysisServiceTest {

    TransactionTestData transactionTestData = new TransactionTestData();
    TransactionAnalysisService transactionAnalysisService = new TransactionAnalysisService();

    @Test
    public void all2011TransactionsTest(){
        List<Transaction> transactionsIn2011 =
                transactionAnalysisService.getTransactionsInYear20011(transactionTestData.getTransactions());
        assertEquals(2,transactionsIn2011.size());
    }

    @Test
    public void all2012TransactionsTest(){
        List<Transaction> transactionsIn2012 =
                transactionAnalysisService.getTransactionsByTheYear(transactionTestData.getTransactions(),2012);
        assertEquals(4,transactionsIn2012.size());
    }

    @Test
    public void all2013TransactionsTest(){
        List<Transaction> transactionsIn2013 =
                transactionAnalysisService.getTransactionsByTheYear(transactionTestData.getTransactions(),2013);
        assertEquals(0,transactionsIn2013.size());
    }

    @Test
    public void allTransactionsByValueTest(){
        List<Transaction> transactionsByValue =
                transactionAnalysisService.transactionsByValue(transactionTestData.getTransactions());
        assertEquals(300, transactionsByValue.get(0).getValue());
        assertEquals(400, transactionsByValue.get(1).getValue());
        assertEquals(700, transactionsByValue.get(2).getValue());
        assertEquals(710, transactionsByValue.get(3).getValue());
        assertEquals(950, transactionsByValue.get(4).getValue());
        assertEquals(1000, transactionsByValue.get(5).getValue());
    }

    @Test
    public void allTransactionsDescendingByValueTest(){
        List<Transaction> transactionsByValue =
                transactionAnalysisService.transactionsDescendingByValue(transactionTestData.getTransactions());
        assertEquals(1000, transactionsByValue.get(0).getValue());
        assertEquals(950, transactionsByValue.get(1).getValue());
        assertEquals(710, transactionsByValue.get(2).getValue());
        assertEquals(700, transactionsByValue.get(3).getValue());
        assertEquals(400, transactionsByValue.get(4).getValue());
        assertEquals(300, transactionsByValue.get(5).getValue());
    }

    @Test
    public void allTransactionsInReverseByValueTest(){
        List<Transaction> transactionsByValue =
                transactionAnalysisService.transactionsIn2011AscendingByValue(transactionTestData.getTransactions());
        assertEquals(300, transactionsByValue.get(0).getValue());
        assertEquals(400, transactionsByValue.get(1).getValue());
        assertEquals(2, transactionsByValue.size());
    }

    @Test
    public void yearsTransactionsTest(){
        List<Integer> transactions =
                transactionAnalysisService.allTransactionsByYear(transactionTestData.getTransactions());
        assertEquals(6,transactions.size());
        assertTrue(transactions.contains(2011));
        assertTrue(transactions.contains(2012));
    }

    @Test
    public void uniqueYearsOfTransactionsTest(){
        Set<Integer> uniqueYears =
                transactionAnalysisService.allUniqueTransactionsByYear(transactionTestData.getTransactions());
        assertEquals(2,uniqueYears.size());
        assertTrue(uniqueYears.contains(2011));
        assertTrue(uniqueYears.contains(2012));
    }

    @Test
    public void uniqueTraderNamesTest(){
        Set<String> uniqueNames =
                transactionAnalysisService.allTransactionsNames(transactionTestData.getTransactions());
        assertEquals(4,uniqueNames.size());
        assertTrue(uniqueNames.contains("Raoul"));
        assertTrue(uniqueNames.contains("Mario"));
        assertTrue(uniqueNames.contains("Alan"));
        assertTrue(uniqueNames.contains("Brian"));

    }

    @Test
    public void uniqueTradersCitiesTest(){
        Set<String> uniqueCities =
                transactionAnalysisService.traderUniqueCities(transactionTestData.getTransactions());
        assertEquals(2, uniqueCities.size());
        assertTrue(uniqueCities.contains("Cambridge"));
        assertTrue(uniqueCities.contains("Milan"));
    }

    @Test
    public void uniqueTraderNamesFromCambridgeTest(){
        Set<String> uniqueTradersFromCambridge =
                transactionAnalysisService.tradersFromCambridge(transactionTestData.getTransactions());
        assertEquals(3,uniqueTradersFromCambridge.size());
        assertTrue(uniqueTradersFromCambridge.contains("Raoul"));
        assertTrue(uniqueTradersFromCambridge.contains("Alan"));
        assertTrue(uniqueTradersFromCambridge.contains("Brian"));
    }

    @Test
    public void uniqueNamesByCityTest(){
        List<String> uniqueNamesByCity =
                transactionAnalysisService.findTraderNamesFromCity
                        (transactionTestData.getTransactions(),"Cambridge");
        assertEquals(4, uniqueNamesByCity.size());
        assertTrue(uniqueNamesByCity.contains("Raoul"));
        assertTrue(uniqueNamesByCity.contains("Alan"));
        assertTrue(uniqueNamesByCity.contains("Brian"));
    }

    @Test
    public void milanTraderTest(){
        boolean milanTrader =
                transactionAnalysisService.isAnyTraderBasedInMilan(transactionTestData.getTransactions());
        assertTrue(milanTrader);
    }

    @Test
    public void traderInCityTest(){
        assertTrue(transactionAnalysisService.isAnyTraderBasedInCity(transactionTestData.getTransactions(),
                "Milan"));
        assertTrue(transactionAnalysisService.isAnyTraderBasedInCity(transactionTestData.getTransactions(),
                "Cambridge"));
        assertFalse(transactionAnalysisService.isAnyTraderBasedInCity(transactionTestData.getTransactions(),
                "Sydney"));
    }
}