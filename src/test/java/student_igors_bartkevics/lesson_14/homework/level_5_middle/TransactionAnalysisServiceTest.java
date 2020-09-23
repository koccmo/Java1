package student_igors_bartkevics.lesson_14.homework.level_5_middle;

import org.junit.Test;

import java.util.List;
import java.util.Set;

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

    @Test
    public void findYearsOfTransactionsTest() {
        List<Integer> yearsOfTransactions =
                service.findYearsOfTransactions(allTransactions);
        assertEquals(6, yearsOfTransactions.size());
        assertTrue(yearsOfTransactions.contains(2011));
        assertTrue(yearsOfTransactions.contains(2012));
    }

    @Test
    public void findUniqueYearsOfTransactionsTest() {
        Set<Integer> uniqueYearsOfTransactions =
                service.findUniqueYearsOfTransactions(allTransactions);
        assertEquals(2, uniqueYearsOfTransactions.size());
        assertTrue(uniqueYearsOfTransactions.contains(2011));
        assertTrue(uniqueYearsOfTransactions.contains(2012));
    }

    @Test
    public void findUniqueNamesOfTradersTest() {
        Set<String> uniqueNamesOfTraders =
                service.findUniqueNamesOfTraders(allTransactions);
        assertEquals(4, uniqueNamesOfTraders.size());
        assertTrue(uniqueNamesOfTraders.contains("Raoul"));
        assertTrue(uniqueNamesOfTraders.contains("Mario"));
        assertTrue(uniqueNamesOfTraders.contains("Alan"));
        assertTrue(uniqueNamesOfTraders.contains("Brian"));
    }

    @Test
    public void findUniqueCitiesOfTradersTest() {
        Set<String> uniqueCitiesOfTraders =
                service.findUniqueCitiesOfTraders(allTransactions);
        assertEquals(2, uniqueCitiesOfTraders.size());
        assertTrue(uniqueCitiesOfTraders.contains("Cambridge"));
        assertTrue(uniqueCitiesOfTraders.contains("Milan"));
    }

    @Test
    public void findUniqueNamesOfTradersFromCambridgeTest() {
        Set<String> uniqueNamesOfTradersFromCambridge =
                service.findUniqueNamesOfTradersFromCambridge(allTransactions);
        assertEquals(3, uniqueNamesOfTradersFromCambridge.size());
        assertTrue(uniqueNamesOfTradersFromCambridge.contains("Raoul"));
        assertTrue(uniqueNamesOfTradersFromCambridge.contains("Alan"));
        assertTrue(uniqueNamesOfTradersFromCambridge.contains("Brian"));
    }

    @Test
    public void findUniqueNamesOfTradersByCityTest() {
        List<String> uniqueNamesOfTradersFromCambridge =
                service.findUniqueNamesOfTradersByCity(allTransactions, "Cambridge");
        assertEquals(3, uniqueNamesOfTradersFromCambridge.size());
        assertTrue(uniqueNamesOfTradersFromCambridge.contains("Raoul"));
        assertTrue(uniqueNamesOfTradersFromCambridge.contains("Alan"));
        assertTrue(uniqueNamesOfTradersFromCambridge.contains("Brian"));
    }

    @Test
    public void inMilanWorksAnyTraderTest() {
        boolean result =
                service.inMilanWorksAnyTrader(allTransactions);
        assertTrue(result);
    }

    @Test
    public void isAnyTraderOfTransactionsBasedInCityTest() {
        assertTrue(service.isAnyTraderOfTransactionsBasedInCity(allTransactions, "Milan"));
        assertTrue(service.isAnyTraderOfTransactionsBasedInCity(allTransactions, "Cambridge"));
        assertFalse(service.isAnyTraderOfTransactionsBasedInCity(allTransactions, "London"));
    }

}